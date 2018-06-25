/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.febos.lambda.framework.interceptor;

import cl.febos.lambda.framework.interceptor.parser.RequestParser;
import cl.febos.lambda.framework.lambda.BaseRequest;
import cl.febos.lambda.framework.lambda.Lambda;
import java.util.List;

/**
 *
 * @author Camilo
 */
public class Interceptor {
    private ControlPort port;
    private FilterManager filterManager;
    private RequestParser mapper;
    private BaseRequest requestToCheck;
    
    public Interceptor(){
        this.port = new ControlPort();
        this.filterManager = new FilterManager();
        this.mapper = new RequestParser(null, null);
    }
    
    public void setRequestToCheck(BaseRequest requestToCheck){
        this.requestToCheck = requestToCheck;
    }
    
    public void setTargetLambda(Lambda lambda){
        port.setLambda(lambda);
    }
    
    public String sendRequestToTarget(String trueRequest){
        RequestMap requestMapped = mapper.buildRequest(trueRequest);
        List<Filter> filters = port.getFiltersRequiredFromBaseRequest(this.requestToCheck);
        filterManager.setFilters(filters);
        requestMapped = filterManager.doFiltersToThisRequestMap(requestMapped);
        String trueRequest = mapper.buildJsonFromRequestMap(requestMapped);
        String response = port.sendRequestToLambda(trueRequest);
        return response;
    }
}
