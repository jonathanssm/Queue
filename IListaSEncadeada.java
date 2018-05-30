/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.list;

/**
 *
 * @author Jonathan
 */
public interface IListaSEncadeada<Type> extends Iterable<Type> {
    
    public void adicionar(Type element);

    public void adicionar(int indice, Type element);

    public void adicionarInicio(Type element);

    public Type obter(int indice);

    public Type remover(int indice);

    public boolean remover(Type value);

    public void limpar();

    public int tamanho();

    public boolean contem(Type value);
}
