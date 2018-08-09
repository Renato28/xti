package br.com.xti.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class ControleLabel extends JFrame {
	
	public ControleLabel() {
		
		super("Label");
		
		JLabel simples = new JLabel("Label simples");
		simples.setToolTipText("Meu ToolTip");
		
		Font fonte = new Font("Serif", Font.BOLD, 28);
		JLabel label = new JLabel("Label Simples");
		label.setFont(fonte);
		label.setForeground(Color.BLUE);
		
		ImageIcon icon = new ImageIcon("foto/download.jpg");
		JLabel imagem = new JLabel(icon);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(simples);
		c.add(label);
		c.add(imagem);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new ControleLabel();
		
	}

}
