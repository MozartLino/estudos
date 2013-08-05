package br.com.lino.exercicios.dojo.algoritmosromanos;

import java.util.HashMap;
import java.util.Map;

public class AlgoritmosRomanos {

	private Map<Integer, String> mapRomanos = new HashMap<Integer, String>();
	private int[] decimais = { 1000, 500, 100, 50, 10, 5, 1 };
	private String romanos = "";

	public String converte(int n) {
		carregaMap();

		for (int i = 0; i < decimais.length; i++) {
			if ((n - decimais[i]) >= 0 && n > 0) {
 				if (ehPrimeiroCasoEspecial(n, i)) {
					romanos = romanos + mapRomanos.get(decimais[i]) + mapRomanos.get(decimais[i - 1]);
					n = n - (decimais[i - 1] - decimais[i]);
				} else {
					romanos = romanos + mapRomanos.get(decimais[i]);
					n = n - decimais[i];
					i--;
				}
			}
		}

		return romanos;
	}

	private boolean ehPrimeiroCasoEspecial(int n, int i) {
		if (decimais[i - 1] - decimais[i] != decimais[i]) {
			return (decimais[i] + 3 * decimais[i + 1]) < n;
		}
		
		return (3 * decimais[i]) <= n;
	}

	private void carregaMap() {
		mapRomanos.put(1, "I");
		mapRomanos.put(5, "V");
		mapRomanos.put(10, "X");
		mapRomanos.put(50, "L");
		mapRomanos.put(100, "C");
		mapRomanos.put(500, "D");
		mapRomanos.put(1000, "M");
	}

}
