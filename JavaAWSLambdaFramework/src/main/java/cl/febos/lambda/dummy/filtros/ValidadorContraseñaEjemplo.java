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
public class ValidadorContraseñaEjemplo implements Filtro<AutenticacionRequestEjemplo>{

    
    @Override
    public AutenticacionRequestEjemplo ejecutar(AutenticacionRequestEjemplo request) {
        String contrasena = request.password;
        verificarFormato(contrasena);
        return request;
    }
    
    private void verificarFormato(String contrasena){
        
        if(elLargoEsIncorrecto(contrasena)){
            System.out.println("El formato de la contraseña es incorrecto");
            System.exit(0);
        }
    }
    
    private boolean elLargoEsIncorrecto(String contrasena){
        
        int minLength = 6;
        if(contrasena.length() < minLength){
            return true;
        }
        return false;
    }

 
}
