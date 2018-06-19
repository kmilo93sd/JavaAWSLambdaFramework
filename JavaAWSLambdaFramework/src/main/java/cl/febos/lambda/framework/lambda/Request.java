/*
 * Copyright (C) IA Solutions Ltda - Todos los derechos reservados
 * Queda expresamente prohibida la copia o reproducción total o parcial de este archivo
 * sin el permiso expreso y por escrito de IA Solutions LTDA. 
 * La detección de un uso no autorizado puede acarrear el inicio de acciones legales.
 */
package cl.febos.lambda.framework.lambda;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Michel Muñoz <michel@febos.cl>
 */
public abstract class Request{
    
    private Map<String, Object> parametros = new HashMap<>();
    
    
    public void añadirParametro(String paramName, Object value){
        parametros.put(paramName, value);
    }
    
    public <T> T obtenerParametro(String paramName){
        return (T) parametros.get(paramName);
    }
}
