package br.com.xti.refinado;

import java.io.Serializable;


@Cabecalho(
	instituicao = "Universidade XTI",
	projeto = "Sistema de Avaliações",
	dataCriacao = "08/10/2011",
	criador = "Renato Nobrega da Silva",
	revisao = 2
)
@ErrosCorrigidos(erros = {"0001" , "0002"})
@SuppressWarnings("serial")
public class Anotacao implements Serializable{
	
	@SuppressWarnings("unused")
	private int x;
	
	@Deprecated
	public void anotar(){}
	
	@Override
	public String toString() {
		return null;
	}
}
