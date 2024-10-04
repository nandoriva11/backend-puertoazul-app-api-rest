package com.apirest.puertoazul_api_rest.services.APIService;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Apiservice {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
