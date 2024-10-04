package com.apirest.puertoazul_api_rest.security.filters;

import com.apirest.puertoazul_api_rest.entities.Usuario_Empleado;
import com.apirest.puertoazul_api_rest.services.UsuarioEmpleadoService;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.Jwts;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import static com.apirest.puertoazul_api_rest.security.TokenConfig.*;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter {




    private final UsuarioEmpleadoService usuarioEmpleadoService;

    private AuthenticationManager authenticationManager;


    public JWTAuthenticationFilter(AuthenticationManager authenticationManager, UsuarioEmpleadoService usuarioEmpleadoService) {
        this.authenticationManager = authenticationManager;
        this.usuarioEmpleadoService = usuarioEmpleadoService;

        setFilterProcessesUrl("/cevicheria/api/login");

    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        Usuario_Empleado user = null;
        String username = null;
        String password = null;

        try {
            logger.info(request.getInputStream());
            user = new ObjectMapper().readValue(request.getInputStream(), Usuario_Empleado.class);
            username = user.getEmail();
            password = user.getPassword();
            logger.info(username);
            logger.info(password);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(username, password);
        //IMPORTANTE
        return authenticationManager.authenticate(authToken);
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {
        String username = ((User) authResult.getPrincipal()).getUsername();
        Usuario_Empleado payload = usuarioEmpleadoService.getUsuarioByEmail(username).get();


//        String token = Base64.getEncoder().encodeToString(original.getBytes());
        Collection<? extends GrantedAuthority> roles = authResult.getAuthorities();
        Map<String, Object> payloadd = new HashMap<>();
        payloadd.put("id", payload.getId());
        payloadd.put("nombres", payload.getEmpleado().getNombres());
        boolean isEnabled = ((User) authResult.getPrincipal()).isEnabled();


//        String[] rolesConvertido = roles.stream().map(GrantedAuthority::getAuthority).toArray(String[]::new);


        String token = Jwts.builder()
                .subject(username)
                .signWith(SECRET_KEY)
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + (3600000 * 12)))
                .claim("authorities", new ObjectMapper().writeValueAsString(roles))
                .claim("enabled", isEnabled)
                .claim("usuario", new ObjectMapper().writeValueAsString(payloadd))

//                .expiration(new Date(System.currentTimeMillis() + (10000)))
                .compact();

        response.addHeader(HEADER_AUTHORIZATION, PREFIX_TOKEN + token);
        Map<String, Object> body = new HashMap<>();
        body.put("token", token);
        body.put("message", "Iniciaste sesión con exito");
        body.put("username", username);
        response.getWriter().write(new ObjectMapper().writeValueAsString(body));
        response.setStatus(200);
        response.setContentType("application/json");

    }

    @Override
    protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response, AuthenticationException failed) throws IOException, ServletException {
        Map<String, Object> body = new HashMap<>();
        logger.info(failed.toString());
        body.put("message", "Error, username o password incorrecto!");
        body.put("error", failed.getMessage());
        response.getWriter().write(new ObjectMapper().writeValueAsString(body));
        response.setStatus(401);
        response.setContentType("application/json");
    }
}
