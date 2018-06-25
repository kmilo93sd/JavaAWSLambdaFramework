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
public class FiltersBuilder {
    
    public List<Filter> build(List<String> filtersPaths){
        
        List <Filter> filters = new ArrayList();
        for(String path: filtersPaths){
            
            try {
                Class <?> filterClass = Class.forName(path);
                Constructor<?> filterConstructor = filterClass.getConstructor();
                filters.add((Filter) filterConstructor.newInstance());
                
            } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                Logger.getLogger(FiltersBuilder.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        return filters;
    }
}
