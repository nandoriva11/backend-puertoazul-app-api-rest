package com.apirest.puertoazul_api_rest.services;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Path;

public interface UploadService {

    public Resource cargar(String nombreFoto) throws MalformedURLException;

    public String copiarImg(MultipartFile archivo) throws IOException;

    public boolean eliminar(String nombreFoto);

    public Path getPath(String nombreFoto);
}
