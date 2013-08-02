package br.com.lino.exercicios.caelum.ejb.serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;

import org.junit.Test;

public class TestaEscritaDeObjetos {

	@Test
	public void testaEscritaDeTestSemOserializer() throws FileNotFoundException, IOException {
		ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("livros.txt"));

		Livro livro1 = new Livro("livro1");
		livro1.setPreco(200);

		Livro livro2 = new Livro("livro2");
		livro2.setPreco(100);

		stream.writeObject(Arrays.asList(livro1, livro2));
		stream.close();
	}

}
