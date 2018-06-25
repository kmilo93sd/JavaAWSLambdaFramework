/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.febos.lambda.framework.interceptor;

/**
 *
 * @author Camilo
 */
public interface Filter {
    
    public RequestMap execute(RequestMap requestMapped);
}
