/*
 * Copyright (C) IA Solutions Ltda - Todos los derechos reservados
 * Queda expresamente prohibida la copia o reproducción total o parcial de este archivo
 * sin el permiso expreso y por escrito de IA Solutions LTDA. 
 * La detección de un uso no autorizado puede acarrear el inicio de acciones legales.
 */
package cl.febos.lambda.dummy.autenticacion;


import cl.febos.lambda.framework.lambda.Lambda;
import cl.febos.lambda.framework.lambda.Request;
import cl.febos.lambda.framework.lambda.Response;

/**
 *
 * @author Michel Muñoz <michel@febos.cl>
 */
public class AutenticacionLambdaEjemplo implements Lambda{

    @Override
    public Response ejecutar(Request request) {
        
        Response respuesta=new Response();
        
        String nombreDeUsuario = "administrador";
        String contraseña = "administrador";
        
        Object nombreUsuarioAVerificar = request.obtenerParametro("nombreDeUsuario");
        Object contrasenaAVerificar = request.obtenerParametro("contraseña");
        
        if(nombreDeUsuario.equals(nombreUsuarioAVerificar) && contraseña.equals(contrasenaAVerificar)){
            respuesta.añadirParametro("respuesta", "Credenciales correctas");
        }else{
            respuesta.añadirParametro("respuesta", "Credenciales incorrectas");
        }
       
        return respuesta;
    }
}
