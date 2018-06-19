/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.febos.lambda.framework.interceptor;

import cl.febos.lambda.framework.lambda.Request;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Camilo
 */
public class CadenaDeFiltros {
    
    private List<Filtro> filtros = new ArrayList<Filtro>();
    
    public void añadirFiltro(Filtro filtro){
        filtros.add(filtro);
    }
    
    public Request ejecutar(Request request){
        for(Filtro filtro : filtros){
            request = filtro.ejecutar(request);
        }
        return request;
    }
}
