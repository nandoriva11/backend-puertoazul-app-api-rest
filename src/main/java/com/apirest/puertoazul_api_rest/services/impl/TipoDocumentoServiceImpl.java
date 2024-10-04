package com.apirest.puertoazul_api_rest.services.impl;

import com.apirest.puertoazul_api_rest.dao.TipoDocumentoDAO;
import com.apirest.puertoazul_api_rest.entities.Tipo_Documento;
import com.apirest.puertoazul_api_rest.generics.service.GenericServiceImpl;
import com.apirest.puertoazul_api_rest.services.ITipoDocumentoService;
import org.springframework.stereotype.Service;

@Service
public class TipoDocumentoServiceImpl extends GenericServiceImpl<Tipo_Documento, TipoDocumentoDAO, Integer> implements ITipoDocumentoService {

}
