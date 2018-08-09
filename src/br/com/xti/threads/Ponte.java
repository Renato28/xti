package br.com.xti.threads;

/**
 * Uma <code>Ponte</code> representa o elo de 
 * liga��o entre objetos Produtores e Consumidores
 * de informacoes. Os <i>Produtores</i> utilizam as
 * Pontes para gravar informa��es e compartilhar
 * essas informa��es com os Consumidores que l�em 
 * esses dados da Ponte para fazer o Processamento
 */

/**
 * 
 * @author Renato Nobrega
 * @version 4.4.2
 * @see PonteNaoSincronizada
 * @see PonteSincronizada
 *
 */

public interface Ponte {
	
	/**
	 * Armazena o valor informado na ponte. Geralmente
	 * ser� chamado pelas classes produtoras de dados.
	 
	 * @param valor
	 * @throws InterruptedException
	 */

	public void set(int valor) throws InterruptedException;
	
	/**
	 * Recupera a informacao armazenada na ponte. esse
	 * m�todo ser� chamado pelas consumidoras de dados.
	 * @return
	 * @throws InterruptedException
	 */
	
	public int get() throws InterruptedException;
	
}
