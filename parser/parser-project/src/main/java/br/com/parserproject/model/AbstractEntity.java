package br.com.parserproject.model;

/**
 * Uma classe abstrata para a geração de entidades no parser.
 * @author João Gabriel QA
 *
 */
public abstract class AbstractEntity {
	
	/**
	 * Gera chaves de hash no Redis.
	 * @return
	 * Uma chave de uma determinada entidade.
	 */
	public abstract String getGeneratedKey();

}
