package br.com.parserproject.util;

/**
 * Enumera os registros que ser�o gerados para o SPED.
 * @author Jo�o Gabriel QA
 *
 */
public enum Registros {
	
	PRODUTO_0200("produto");
	
	private final String tipo;
	
	Registros(String tipo){
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

}
