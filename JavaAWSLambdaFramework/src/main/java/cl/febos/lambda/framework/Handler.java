/*
 * Copyright (C) IA Solutions Ltda - Todos los derechos reservados
 * Queda expresamente prohibida la copia o reproducción total o parcial de este archivo
 * sin el permiso expreso y por escrito de IA Solutions LTDA. 
 * La detección de un uso no autorizado puede acarrear el inicio de acciones legales.
 */
package cl.febos.lambda.framework;

import com.amazonaws.services.lambda.runtime.Context;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Punto de entrada para Amazon.
 * Cada vez que amazon va a ejecutar un lambda, invoca esta clase con la funcion especifica,
 * la cual debe detectar a que funcion llamar, que parametros, ejecutar validaciones
 * y filtros
 * @author Michel M. <michel@febos.cl>
 */
public class Handler {
    public void handler(InputStream inputStream, OutputStream outputStream, Context context) {
        //TODO: leer la entrada, pasarselo al la funcion lambda (que implementa la interfaz), y la respuesta del lambda, entregarla como string al outputstram   
    }
}
