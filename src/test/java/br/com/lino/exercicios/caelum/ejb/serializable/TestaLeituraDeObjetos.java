package br.com.lino.exercicios.caelum.ejb.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import org.junit.Test;

public class TestaLeituraDeObjetos {

	@Test
	@SuppressWarnings({ "unchecked", "resource" })
	public void testaEscritaDeTestSemOserializer() throws ClassNotFoundException, FileNotFoundException, IOException {
		List<Livro> livros = (List<Livro>) new ObjectInputStream(new FileInputStream("livros.txt")).readObject();

		for (Livro livro : livros) {
			System.out.println(livro.getNome() + "  " + livro.getPreco());
		}
	}
	
	

}
