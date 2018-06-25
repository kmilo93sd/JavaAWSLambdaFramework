/*
 * Copyright (C) IA Solutions Ltda - Todos los derechos reservados
 * Queda expresamente prohibida la copia o reproducción total o parcial de este archivo
 * sin el permiso expreso y por escrito de IA Solutions LTDA. 
 * La detección de un uso no autorizado puede acarrear el inicio de acciones legales.
 */
package cl.febos.lambda.dummy.autenticacion;


import cl.febos.lambda.framework.lambda.Lambda;

/**
 *
 * @author Michel Muñoz <michel@febos.cl>
 */
public class AutenticacionLambdaEjemplo implements Lambda<AutenticacionRequestEjemplo, AutenticacionResponseEjemplo>{

    @Override
    public AutenticacionResponseEjemplo ejecutar(AutenticacionRequestEjemplo request) {
        
        AutenticacionResponseEjemplo response = new AutenticacionResponseEjemplo();
        
        String nombreDeUsuario = "administrador";
        String contraseña = "administrador";
        
        String nombreDeUsuarioEntrante = request.username;
        String contraseñaEntrante = request.password;
        
        if(nombreDeUsuario.equals(nombreDeUsuarioEntrante) && contraseña.equals(contraseñaEntrante)){
            response.respuesta = "Credenciales correctas";
        }else{
            response.respuesta = "Credenciales incorrectas";
        }
        
        return response;
    }
}
