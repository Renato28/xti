package br.com.xti.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class Calculadora extends JFrame{

	public Calculadora() {
		super("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
		Container c = new JPanel();
		c.setLayout(new GridLayout(4, 4, 5, 5));
		
		c.add(new JButton("7"));
		c.add(new JButton("8"));
		c.add(new JButton("9"));
		c.add(new JButton("/"));
		c.add(new JButton("4"));
		c.add(new JButton("5"));
		c.add(new JButton("6"));
		c.add(new JButton("*"));
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("-"));
		c.add(new JButton("0"));
		c.add(new JButton("."));
		c.add(new JButton("="));
		c.add(new JButton("+"));
		
		JTextField display = new JTextField();
		display.setFont(new Font("serif", Font.PLAIN, 26));
		
		Container n = getContentPane();
		n.add(BorderLayout.NORTH, display);
		n.add(BorderLayout.CENTER, c);
		
	}
	
	public static void main(String[] args) {
		new Calculadora();
	}
}
