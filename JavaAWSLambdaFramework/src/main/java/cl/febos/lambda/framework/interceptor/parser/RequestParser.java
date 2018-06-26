/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.febos.lambda.framework.interceptor.parser;

import cl.febos.lambda.framework.lambda.BaseRequest;
import cl.febos.lambda.framework.lambda.BaseResponse;
import java.util.Map;


/**
 *
 * @author Camilo
 */
public class RequestParser {
    
    private XmlParser xmlParser;
    private JsonParser jsonParser;
    
    public RequestParser(XmlParser xmlParser, JsonParser jsonParser){
        this.xmlParser = xmlParser;
        this.jsonParser = jsonParser;
    }
    
    public BaseRequest getObjectFromStringRequest(String request, BaseRequest requestClass){
        
        if(isJsonString(request)){
            return jsonParser.getRequestObjectFromJson(request, requestClass);
        }
        
        if(isXmlString(request)){
            return xmlParser.getRequestObjectFromXml(request, requestClass);
        }
        
        return null;//checkThis
    }
    
    private boolean isJsonString(String request){
        
        return jsonParser.isJson(request);
    }
    
    private boolean isXmlString(String request) {
        return xmlParser.isXml(request);
    }
    
    public String getJsonFromBaseResponse(BaseResponse baseResponse){
        
        return jsonParser.getJsonFromBaseResponse(baseResponse);
    }

    public Map<String,Object> getMapFromStringRequest(String request){
        if(isJsonString(request)){
            return jsonParser.getMapFromJson(request);
        }
        
        if(isXmlString(request)){
            return xmlParser.getMapFromXml(request);
        }
        
        return null;//check this
    }
    
    public String getJsonFromMap(Map<String,Object> map){
        return jsonParser.getJsonFromMap(map);
    }
}
