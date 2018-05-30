/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.list;

import java.util.Iterator;

/**
 *
 * @author Jonathan
 */
public class IteradorListaSEncadeada<Type> implements Iterator<Type>{
    No<Type> aux;

    public IteradorListaSEncadeada(No<Type> inicio) {
        this.aux = inicio;
    }
    
    
    
    @Override
    public boolean hasNext() {
        
        if (aux != null) {
            return true;
        }
        return false;
    }

    @Override
    public Type next() {
        Type valor = aux.getValor();
        aux = aux.getProximo();
        
        return valor;
    }
    
}
