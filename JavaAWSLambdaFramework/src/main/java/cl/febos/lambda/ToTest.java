/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.febos.lambda;

import cl.febos.lambda.dummy.autenticacion.AutenticacionLambdaEjemplo;
import cl.febos.lambda.dummy.autenticacion.AutenticacionRequestEjemplo;
import cl.febos.lambda.framework.interceptor.Interceptor;
import cl.febos.lambda.framework.lambda.Response;

/**
 *
 * @author Camilo
 */
public class ToTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
            Datos de prueba, según los filtros de ejemplo
            deben tener mas de 6 caracteres.
        */
        String username = "administrador";
        String password = "administrador";
        
        /*
            Se crea el objeto Request y se le pasan los parametros
        */
        AutenticacionRequestEjemplo request = new AutenticacionRequestEjemplo();
        request.añadirParametro("nombreDeUsuario", username);
        request.añadirParametro("contraseña", password);
        
        /*
            Se crea el objeto Lambda que se debe ejecutar
        */
        AutenticacionLambdaEjemplo autLambda = new AutenticacionLambdaEjemplo();
        
        /*
            Se crea un interceptor
        */
        Interceptor interceptor = new Interceptor();
        
        /*
            Se procesa el request y el lambda
        */
        Response response = interceptor.enviarRequestALambda(request, autLambda);
        /*
            working
        */
        System.out.println(response.obtenerParametro("respuesta"));
    }
}