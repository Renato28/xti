package br.com.xti.logica;

public class Fluxo{
	
	public static void main(String[] args){
		
		boolean[][] matrix = 
		{
			{false,true,false,false,false},
			{false,false,false,false,false}
		};
		
		busca:
		for(int a = 0; a < matrix.length; a++){
			System.out.println("A ");
			for(int b = 0; b < matrix[a].length; b++){
				if(matrix[a][b]){
					System.out.println("TRUE ");
					continue busca;
				}
				System.out.println("B ");
			}
		}
	}
}
