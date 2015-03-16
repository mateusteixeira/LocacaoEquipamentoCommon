/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datacoper.locacaoequipamentos.common.service;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 *
 * @author Java
 */
public class ServiceLocator {
    
    
    public <T> T loadService(Class<T> interfaceServico) {
        T service = null;
        ServiceLoader serviceLoader =  ServiceLoader.load(interfaceServico);
        Iterator<T> iterator = serviceLoader.iterator();
        if (iterator.hasNext()) 
            service = iterator.next();
        
        if (service == null)
            throw new RuntimeException("Não foi encontrado implementação para o serviço: " + interfaceServico.getCanonicalName());
        
        return service;
    }
}
