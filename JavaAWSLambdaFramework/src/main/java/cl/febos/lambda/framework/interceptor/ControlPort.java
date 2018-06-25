/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.febos.lambda.framework.interceptor;

import cl.febos.lambda.framework.interceptor.parser.RequestParser;
import cl.febos.lambda.framework.lambda.BaseRequest;
import cl.febos.lambda.framework.lambda.BaseResponse;
import cl.febos.lambda.framework.lambda.Lambda;
import java.util.List;

/**
 *
 * @author Camilo
 */
public class ControlPort {
    private Lambda lambda;
    private InterceptorExtractor extractor;
    private RequestParser parser;
    private BaseRequest baseRequest;
    
    public ControlPort(){
        this.extractor = new InterceptorExtractor();
        this.parser = new RequestParser(null, null);
    }
    
    public void setBaseRequest(BaseRequest baseRequest){
        this.baseRequest = baseRequest;
    }
    
    public void setLambda(Lambda lambda){
        this.lambda = lambda;
    }
    
    public List<Filter> getFiltersRequiredFromBaseRequest(BaseRequest baseRequest){
        List <Filter> filters = extractor.getFiltersRequiredFromBaseRequest(baseRequest);
        return filters;
    }
    
    public String sendRequestToLambda(String request){
        BaseRequest finalRequest = parser.getObjectFromStringRequest(request, this.baseRequest);
        BaseResponse baseResponse = this.lambda.execute(finalRequest);
        String response = parser.getJsonFromBaseResponse(baseResponse);
        return response;
    }
}
