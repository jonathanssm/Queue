package com.queue;

import java.util.Iterator;

import com.list.ListaSEncadeada;

public class Queue<T> implements IQueue<T> {

	private ListaSEncadeada<T> queue = new ListaSEncadeada<T>();
	
	@Override
	public Iterator<T> iterator() {
		
		return this.queue.iterator();
	}

	@Override
	public void enfileirar(T elemento) {
		
		this.queue.adicionar(elemento);
		
	}

	@Override
	public T desenfileirar() {
		
		return this.queue.remover(0);
	}

	@Override
	public T primeiro() {
		
		return this.queue.obter(0);
	}

	@Override
	public int tamanho() {
		
		return this.queue.tamanho();
	}

	@Override
	public boolean vazia() {
		
		return queue.tamanho() == 0;
	}

	@Override
	public void limpar() {
		
		this.queue.limpar();
		
	}

}
