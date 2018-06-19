/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.febos.lambda.framework.anotaciones;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 *
 * @author Camilo
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Interceptors {
    Interceptor [] value ();
}
