/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.febos.lambda.dummy.filtros;

import cl.febos.lambda.dummy.autenticacion.AutenticacionRequestEjemplo;
import cl.febos.lambda.framework.interceptor.Filtro;
import cl.febos.lambda.framework.lambda.BaseRequest;

/**
 *
 * @author Camilo
 */
public class ValidadorNombreDeUsuarioEjemplo implements Filtro<AutenticacionRequestEjemplo>{
    
    @Override
    public AutenticacionRequestEjemplo ejecutar(AutenticacionRequestEjemplo request) {
        String username = request.username;
        verifyUsernameFormat(username);
        return request;
    }
    
    private void verifyUsernameFormat(String username){
        if(usernameLengthIsNotCorrect(username)){
            System.out.println("El formato de el usuario es incorrecto");
            System.exit(0);
        }
    }
    
    private boolean usernameLengthIsNotCorrect(String username){
        int minLength = 6;
        if(username.length() < minLength){
            return true;
        }
        return false;
    }    
}
