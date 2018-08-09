package br.com.xti.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Layouts2 extends JFrame {
	
	public Layouts2() {
		
		super("Layouts");
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		Container c2 = new JPanel();
		c2.setLayout(new GridLayout(4, 1));
		c2.add(new JButton("Ok"));
		c2.add(new JButton("Cancel"));
		c2.add(new JButton("Setup..."));
		c2.add(new JButton("Help"));
		
		c.add(BorderLayout.CENTER , new JButton("centro"));
		c.add(BorderLayout.EAST, c2);
		
//		c.setLayout(new BorderLayout(15, 15));
//		c.add(BorderLayout.CENTER , new JButton("R"));
//		c.add(BorderLayout.EAST , new JButton("E"));
//		c.add(BorderLayout.NORTH , new JButton("N"));
//		c.add(BorderLayout.SOUTH , new JButton("A"));
//		c.add(BorderLayout.WEST , new JButton("T"));
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new Layouts2();
	}

}
