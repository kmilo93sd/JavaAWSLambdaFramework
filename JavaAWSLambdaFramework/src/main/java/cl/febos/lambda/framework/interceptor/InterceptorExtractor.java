/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.febos.lambda.framework.interceptor;

import java.util.ArrayList;
import java.util.List;
import cl.febos.lambda.framework.anotaciones.Interceptor;
import cl.febos.lambda.framework.lambda.BaseRequest;

/**
 *
 * @author Camilo
 */
public class InterceptorExtractor  {
    
    private FiltersBuilder filtersBuilder;
    
    public InterceptorExtractor(){
        this.filtersBuilder = new FiltersBuilder();
    }
    
    public List<Filter> getFiltersRequiredFromBaseRequest(BaseRequest request){
        
        return this.filtersBuilder.build(getFiltersPaths(request));
    }
    
    private List<String> getFiltersPaths(BaseRequest request){
        
        Interceptor [] interceptors = request.getClass().getAnnotationsByType(Interceptor.class);
        List <String> filtersPaths = new ArrayList();
        for(Interceptor interceptor:interceptors){
            filtersPaths.add(interceptor.classPath());
        }
        
        return filtersPaths;
    }
}
