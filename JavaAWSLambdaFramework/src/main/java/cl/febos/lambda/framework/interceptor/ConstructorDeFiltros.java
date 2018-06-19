/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.febos.lambda.framework.interceptor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Camilo
 */
public class ConstructorDeFiltros {
    
    public List<Filtro> construir(List<String> rutasDeFiltros){
        
        List <Filtro> filtros = new ArrayList();
        for(String ruta: rutasDeFiltros){
            try {
                Class <?> claseDelFiltro = Class.forName(ruta);
                Constructor<?> constructorDeFiltro = claseDelFiltro.getConstructor();
                filtros.add((Filtro) constructorDeFiltro.newInstance());
            } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                Logger.getLogger(ConstructorDeFiltros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return filtros;
    }
    
}
