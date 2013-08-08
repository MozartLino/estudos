package br.com.lino.caelum.ejb.loja.cliente;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import br.com.lino.caelum.ejb.loja.rmi.Carrinho;

public class ClienteLojaCarrinho {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		Carrinho carrinho = (Carrinho) Naming.lookup("rmi://localhost:1099/loja/carrinho");

		System.out.println(carrinho.getClass());
	}

}
