/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.febos.lambda.framework.interceptor;

import java.util.List;

/**
 *
 * @author Camilo
 */
public class FilterManager {
    
    private FilterChain filterChain;
    
    public void setFilters(List<Filter> filters){
        for(Filter filter: filters){
            filterChain.addFilter(filter);
        }
    }
    
    public RequestMap doFiltersToThisRequestMap(RequestMap requestMapped){
        
        RequestMap response = filterChain.doFilters(requestMapped);
        
        return response;
    }
}
