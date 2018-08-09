package br.com.xti.logica;
import javax.swing.JOptionPane;
public class Entrada{
	
	
	public static void main(String[] args){
		
		//System.out.println(args[0]);
		//Scanner s = new Scanner(System.in);
		//System.out.println(s.nextLine());
		
		//System.out.println("Qual o seu nome?");
		//String nome = s.nextLine();
		//System.out.println("Bem vindo, " + nome);
		
		String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
		JOptionPane.showMessageDialog(null, nome);
	}
}