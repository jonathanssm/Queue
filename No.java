package com.list;

public class No <Type>{
	
	private Type valor;
	private No<Type> proximo;
	
	public No(Type valor,No<Type> proximo){
		this.proximo = proximo;
		this.valor = valor;
	}
	
	public Type getValor() {
		return valor;
	}
	public void setValor(Type valor) {
		this.valor = valor;
	}
	public No<Type> getProximo() {
		return proximo;
	}
	public void setProximo(No<Type> proximo) {
		this.proximo = proximo;
	}
}
