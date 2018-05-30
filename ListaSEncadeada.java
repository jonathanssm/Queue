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
public class ListaSEncadeada<Type> implements IListaSEncadeada<Type> {

	private No<Type> inicio;
	private No<Type> fim;
	private int totalElementos;

	@Override
	public void adicionar(Type element) {

		No<Type> novoNo = new No<Type>(element, null);

		if (totalElementos == 0) {
			inicio = fim = novoNo;
		} else {
			fim.setProximo(novoNo);
			fim = novoNo;
		}
		totalElementos++;
	}

	@Override
	public void adicionar(int indice, Type element) {

		No<Type> aux = inicio;
		No<Type> novoNo = new No<Type>(element, null);

		if (indice == 0) {
			this.adicionarInicio(element);

			return;
		}
		if (indice == totalElementos) {
			fim.setProximo(novoNo);
			fim = novoNo;
		} else {

			for (int i = 1; i < indice; i++) {
				aux = aux.getProximo();
			}
			novoNo.setProximo(aux.getProximo());
			aux.setProximo(novoNo);
		}
		totalElementos++;
	}

	@Override
	public void adicionarInicio(Type element) {
		No<Type> novoNo = new No<Type>(element, inicio);

		if (fim == null) {
			fim = novoNo;
		}

		inicio = novoNo;
		totalElementos++;
	}

	@Override
	public Type obter(int indice) {
		No<Type> aux = inicio;
		for (int i = 1; i <= indice; i++) {
			aux = aux.getProximo();
		}
		return aux.getValor();
	}

	@Override
	public Type remover(int indice) {
		No<Type> aux = inicio;
		Type result = null;

		if (indice == 0) {
			result = inicio.getValor();
			this.inicio = this.inicio.getProximo();
		} else {

			for (int i = 1; i < indice; i++) {
				aux = aux.getProximo();
			}

			result = aux.getProximo().getValor();

			aux.setProximo(aux.getProximo().getProximo());
		}

		totalElementos--;

		return result;
	}

	@Override
	public boolean remover(Type value) {
		No<Type> aux = inicio;
		No<Type> anterior = null;
		for (int i = 0; i < totalElementos; i++) {

			if (aux.getValor().equals(value)) {
				if (anterior != null) {
					anterior.setProximo(aux.getProximo());
				} else {
					this.inicio = aux.getProximo();
				}
				totalElementos--;
				return true;
			}

			anterior = aux;
			aux = aux.getProximo();
		}
		return false;
	}

	@Override
	public void limpar() {
		inicio = null;
		fim = null;
	}

	@Override
	public int tamanho() {
		return totalElementos;
	}

	@Override
	public boolean contem(Type value) {

		for (Type type : this) {
			if (type.equals(value)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Iterator<Type> iterator() {
		return new IteradorListaSEncadeada<>(this.inicio);
	}

}
