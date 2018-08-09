package br.com.xti.erros;

@SuppressWarnings("serial")
public class SenhaInvalidaException extends Exception {

	public SenhaInvalidaException (String mensagem) {
		super(mensagem);
	}
	
}
