/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.febos.lambda.framework.interceptor;

import cl.febos.lambda.framework.lambda.Request;
import cl.febos.lambda.framework.lambda.Lambda;
import cl.febos.lambda.framework.lambda.Response;
import java.util.List;


/**
 *
 * @author Camilo
 */
public class Interceptor {
    
    private CadenaDeFiltros cadenaDeFiltros;
    private ExtractorDeInterceptores extractor;
    
    public Interceptor(){
        this.cadenaDeFiltros = new CadenaDeFiltros();
        this.extractor = new ExtractorDeInterceptores();
    }
    
    public Response enviarRequestALambda(Request request, Lambda lambda){
       
        establecerFiltros(extractor.extraerFiltros(request));
        request = cadenaDeFiltros.ejecutar(request);
        return lambda.ejecutar(request);
    } 
    
    private void establecerFiltros(List<Filtro> filtros){
        for(Filtro filtro: filtros){
            cadenaDeFiltros.añadirFiltro(filtro);
        }
    }
}
