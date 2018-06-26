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
public class FilterChain {
    
    private List<Filter> filters;
    
    public void addFilter(Filter filter){
        this.filters.add(filter);
    }
    
    public RequestMap doFilters(RequestMap requestMapped){
        for(Filter filter:this.filters){
            requestMapped = filter.execute(requestMapped);
        }
        return requestMapped;
    }
}
