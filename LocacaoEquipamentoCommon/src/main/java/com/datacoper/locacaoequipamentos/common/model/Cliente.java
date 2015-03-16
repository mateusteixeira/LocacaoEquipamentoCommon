/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datacoper.locacaoequipamentos.common.model;

/**
 *
 * @author Java
 */
public class Cliente extends Pessoa {

    private Integer idCliente;

    public Cliente() { //Construtor
    }

    public void setIdCliente(int id) {
        this.idCliente = id;
    }

    public Integer getIdCliente() {
        return this.idCliente;
    }
}
