/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.febos.lambda.dummy.autenticacion;

import cl.febos.lambda.framework.lambda.BaseRequest;
import cl.febos.lambda.framework.anotaciones.Interceptor;

/**
 *
 * @author Camilo
 * Por ahora es necesario escribir el classPath para cada filtro
 */
@Interceptor(classPath="cl.febos.lambda.dummy.filtros.ValidadorContraseñaEjemplo")
@Interceptor(classPath="cl.febos.lambda.dummy.filtros.ValidadorNombreDeUsuarioEjemplo")
public class AutenticacionRequestEjemplo extends BaseRequest{
    public String username;
    public String password;
}
