/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.febos.lambda.framework.interceptor;

import cl.febos.lambda.framework.lambda.Request;

/**
 *
 * @author Camilo
 */
public interface Filtro {
    public Request ejecutar(Request request);
}
