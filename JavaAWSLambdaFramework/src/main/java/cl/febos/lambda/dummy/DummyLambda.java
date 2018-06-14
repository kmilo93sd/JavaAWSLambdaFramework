/*
 * Copyright (C) IA Solutions Ltda - Todos los derechos reservados
 * Queda expresamente prohibida la copia o reproducción total o parcial de este archivo
 * sin el permiso expreso y por escrito de IA Solutions LTDA. 
 * La detección de un uso no autorizado puede acarrear el inicio de acciones legales.
 */
package cl.febos.lambda.dummy;


import cl.febos.lambda.framework.Lambda;

/**
 *
 * @author Michel Muñoz <michel@febos.cl>
 */
public class DummyLambda implements Lambda<DummyRequest, DummyResponse>{


    @Override
    public DummyResponse ejecutar(DummyRequest request) {
        DummyResponse respuesta=new DummyResponse();
        respuesta.salida1=request.entrada1;
        
        return respuesta;
    }
    
}
