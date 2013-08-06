package br.com.lino.caelum.ejb.loja.rmi;

import java.io.Serializable;

public class Livro implements Serializable {

	private static final long serialVersionUID = 1155828067731275405L;
	private transient String nome;
	private double preco;

	public Livro(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
