/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.febos.lambda.framework.interceptor;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Camilo
 */
public class RequestMap {
    
    private Map<String, Object> parameters;
    
    public RequestMap(){
        this.parameters = new HashMap();
    }
    
    public void addParameter(String name, Object value){
        this.parameters.put(name, value);
    }
    
    public Object getParam(String name){
        return this.parameters.get(name);
    }
}
