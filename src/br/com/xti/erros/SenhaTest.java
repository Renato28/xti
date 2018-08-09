package br.com.xti.erros;

public class SenhaTest {
	
	static void autentica(String senha) throws SenhaInvalidaException{
		if("123".equals(senha)){
			//autenticado
			System.out.println("Autenticado");
		}else{
			//senha incorreta
			System.out.println("senha incorreta");
		}
	}
	
	public static void main(String[] args) {
		
		try {
			autentica("123");
		} catch (SenhaInvalidaException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
