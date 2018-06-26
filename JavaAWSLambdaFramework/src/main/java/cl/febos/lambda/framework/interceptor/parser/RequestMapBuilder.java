/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.febos.lambda.framework.interceptor.parser;

import cl.febos.lambda.framework.interceptor.RequestMap;
import java.util.Map;

/**
 *
 * @author Camilo
 */
public class RequestMapBuilder {
    
    private RequestParser parser;
    
    public RequestMapBuilder(){
        this.parser = new RequestParser(null,null);
    }
    
    public RequestMap buildRequestMap(String request){
        Map<String,Object> map = parser.getMapFromStringRequest(request);
        RequestMap requestMap = new RequestMap();
        for(Map.Entry<String, Object> entry: map.entrySet()){
            requestMap.addParameter(entry.getKey(), entry.getValue());
        }
        return requestMap;
    }
}
