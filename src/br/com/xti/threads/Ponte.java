package br.com.xti.threads;

/**
 * Uma <code>Ponte</code> representa o elo de 
 * ligação entre objetos Produtores e Consumidores
 * de informacoes. Os <i>Produtores</i> utilizam as
 * Pontes para gravar informações e compartilhar
 * essas informações com os Consumidores que lêem 
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
	 * será chamado pelas classes produtoras de dados.
	 
	 * @param valor
	 * @throws InterruptedException
	 */

	public void set(int valor) throws InterruptedException;
	
	/**
	 * Recupera a informacao armazenada na ponte. esse
	 * método será chamado pelas consumidoras de dados.
	 * @return
	 * @throws InterruptedException
	 */
	
	public int get() throws InterruptedException;
	
}
