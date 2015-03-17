/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datacoper.locacaoequipamentos.persistence.dao;

import java.sql.Connection;

import com.datacoper.locacaoequipamentos.persistence.dao.jdbc.JdbcDAOFactory;
import com.datacoper.locacaoequipamentos.util.ConfiguracaoSistema;
import com.datacoper.locacaoequipamentos.util.ParametrosEnum;

/**
 *
 * @author Java
 */
public abstract class DAOFactory  {
    
    private static DAOFactory daoFactory;
    
    protected DAOFactory() {
    }
    
    public static DAOFactory getInstance() {
        String persistenceType = getPersistenceType();
        if (persistenceType.equals("JDBC")) {
            daoFactory = new JdbcDAOFactory();
        } else if (persistenceType.equals("JPA")) {
            
        }
        
        return daoFactory;
    }
       
    public abstract <T> T createDAO(Class<T> daoClass);
    
    
    private static String getPersistenceType() {
        String persistenceType = ConfiguracaoSistema.getValorConfiguracao(ParametrosEnum.PERSISTENCETYPE);
        return persistenceType;
    }

}
