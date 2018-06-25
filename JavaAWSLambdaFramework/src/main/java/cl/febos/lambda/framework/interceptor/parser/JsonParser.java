/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.febos.lambda.framework.interceptor.parser;

import cl.febos.lambda.framework.lambda.BaseRequest;
import cl.febos.lambda.framework.lambda.BaseResponse;


/**
 *
 * @author Camilo
 */
public interface JsonParser {
    
    public BaseRequest getRequestObjectFromJson(String json, BaseRequest requestToMap);
    public boolean isJson(String json);
    public String getJsonFromBaseResponse(BaseResponse response);
}
