package br.com.lino.caelum.ejb.loja.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoBean extends UnicastRemoteObject implements Carrinho {

	private static final long serialVersionUID = 1L;

	private double total = 0;
	private List<Livro> livros = new ArrayList<Livro>();

	protected CarrinhoBean() throws RemoteException {
		super();
	}

	public void addLivro(Livro livro) throws RemoteException {
		livros.add(livro);
		total += livro.getPreco();

		System.out.println("Livro add com sucesso");
	}

	public List<Livro> getLivros() throws RemoteException {
		return this.livros;
	}

	public double getTotal() throws RemoteException {
		return this.total;
	}

}
