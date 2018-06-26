/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.febos.lambda.framework.interceptor.parser;

import cl.febos.lambda.framework.lambda.BaseRequest;
import java.util.Map;


/**
 *
 * @author Camilo
 */
public interface XmlParser {
    public BaseRequest getRequestObjectFromXml(String request, BaseRequest requestClass);
    public boolean isXml(String xml);
    public Map<String,Object> getMapFromXml(String xml);
}
