/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datacoper.locacaoequipamentos.persistence.dao;

import com.datacoper.locacaoequipamentos.common.model.Cliente;

/**
 *
 * @author Java
 */
public interface ClienteDAO {

    public void insert(Cliente cliente);
    
    public Integer nextId();

//    public List<Cliente> buscaAll(int ordem, int ascDesc);
//
//    public List<Cliente> buscaEsp(int ordem, int ascDesc, int ID, String cont);
//
//    public void updateCliente(Cliente c);
//
//    public void excluiCliente(Cliente c);
}
