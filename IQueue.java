package com.queue;

public interface IQueue<T> extends Iterable<T> {

	public void enfileirar(T elemento);
    public T desenfileirar();
    public T primeiro();
    public int tamanho();
    public boolean vazia();
    public void limpar();
	
}
