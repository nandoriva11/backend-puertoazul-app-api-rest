package com.apirest.puertoazul_api_rest.services.APIService;

import com.apirest.puertoazul_api_rest.exceptions.NotFoundException;
import com.apirest.puertoazul_api_rest.models.PersonaReniec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Service
public class ReniecService {

    @Autowired
    private RestTemplate restTemplate;

    private static final String tokenAPI = "apis-token-10648.38uMBahVZxnzGFxYEK449oVHYuVI3pWm";

    private String urlToken = "https://api.apis.net.pe/v2/reniec/dni?numero=";

    public Map<String, Object> getApiData(String dni) {

        Map<String, Object> res = new HashMap<>();
        try {
            PersonaReniec obj = restTemplate.getForObject(urlToken + dni + "&token=" + tokenAPI, PersonaReniec.class);
            res.put("persona", obj);
            return res;
        } catch (RestClientException e) {
            res.put("mensaje", e.getMessage());
            return res;
        }
    }

}


