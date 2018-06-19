/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.febos.lambda.framework.interceptor;

import cl.febos.lambda.framework.lambda.Request;
import cl.febos.lambda.framework.anotaciones.Interceptor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Camilo
 */
public class ExtractorDeInterceptores {
    
    private ConstructorDeFiltros contructorDeFiltros;
    
    public ExtractorDeInterceptores(){
        this.contructorDeFiltros = new ConstructorDeFiltros();
    }
    
    public List<Filtro> extraerFiltros(Request request){
        
        return this.contructorDeFiltros.construir(obtenerRutasDeFiltros(request));
    }
    
    private List<String> obtenerRutasDeFiltros(Request request){
        
        Interceptor [] interceptores = request.getClass().getAnnotationsByType(Interceptor.class);
        List <String> rutasDeFiltros = new ArrayList();
        for(Interceptor interceptor:interceptores){
            rutasDeFiltros.add(interceptor.classPath());
        }
        
        return rutasDeFiltros;
    }
}
