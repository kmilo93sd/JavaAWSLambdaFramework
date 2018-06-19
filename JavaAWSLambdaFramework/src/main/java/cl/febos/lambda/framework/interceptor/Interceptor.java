/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.febos.lambda.framework.interceptor;

import cl.febos.lambda.framework.lambda.Request;
import cl.febos.lambda.framework.lambda.Lambda;
import cl.febos.lambda.framework.lambda.Response;


/**
 *
 * @author Camilo
 */
public class Interceptor {
    
    CadenaDeFiltros cadenaDeFiltros;
    
    public Interceptor(){
        this.cadenaDeFiltros = new CadenaDeFiltros();
    }
    
    public void establecerFiltro(Filtro filtro){
        cadenaDeFiltros.añadirFiltro(filtro);
    }
    
    public Response enviarRequestALambda(Request request, Lambda lambda){
       request = cadenaDeFiltros.ejecutar(request);
        return lambda.ejecutar(request);
    } 
}
