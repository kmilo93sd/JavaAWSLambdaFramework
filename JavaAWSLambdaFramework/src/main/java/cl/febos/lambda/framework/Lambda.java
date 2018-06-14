/*
 * Copyright (C) IA Solutions Ltda - Todos los derechos reservados
 * Queda expresamente prohibida la copia o reproducción total o parcial de este archivo
 * sin el permiso expreso y por escrito de IA Solutions LTDA. 
 * La detección de un uso no autorizado puede acarrear el inicio de acciones legales.
 */
package cl.febos.lambda.framework;

/**
 * Interfaz para identificar un Lambda.
 * Cada funcion lambda debe implementar esta interfaz para poder ser ejecutada
 * @author Michel Munoz <michel@febos.cl>
 * @param <T> Clase que represente el Request
 * @param <U> Clase que represente el Response
 */
public interface Lambda<T extends BaseRequest,U extends BaseResponse> {
    /**
     * Implementación de la funcionalidad de un lambda.
     * @param request un objeto de clase que extienda del BaseRequest
     * @return un objeto de clase que extienda del BaseResponse
     */
    public U ejecutar(T request);
    //public void actualizarInformacionDeProcesoMasivoOtarea(T request);
}
