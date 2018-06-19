/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.febos.lambda.dummy.filtros;

import cl.febos.lambda.framework.interceptor.Filtro;
import cl.febos.lambda.framework.lambda.Request;

/**
 *
 * @author Camilo
 */
public class ValidadorContraseñaEjemplo implements Filtro{

    @Override
    public Request ejecutar(Request request) {
        String contraseña = request.obtenerParametro("contraseña");
        verifyPasswordFormat(contraseña);
        return request;
    }
    
    private void verifyPasswordFormat(String password){
        if(passwordLengthIsNotCorrect(password)){
            System.out.println("El formato de la contraseña es incorrecto");
            System.exit(0);
        }
    }
    
    private boolean passwordLengthIsNotCorrect(String password){
        int minLength = 6;
        if(password.length() < minLength){
            return true;
        }
        return false;
    }
}
