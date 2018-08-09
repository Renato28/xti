package br.com.xti.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


@SuppressWarnings("serial")
public class ControleCombo extends JFrame implements ItemListener{
	ImageIcon[] imagens = {
			new ImageIcon("foto/amigo.jpg"),
			new ImageIcon("foto/familia.jpg"),
			new ImageIcon("foto/familia2.jpg"),
			new ImageIcon("foto/renato.jpg")
	};
	JComboBox<String> combo;
	JLabel label;
	public ControleCombo() {
		super("Formatura");
		Container c = getContentPane();
		combo = new JComboBox<String>();
		combo.setFont(new Font("Serif", Font.PLAIN, 26));
		combo.addItem("amigo");
		combo.addItem("familia");
		combo.addItem("familia2");
		combo.addItem("renato");
		combo.addItemListener(this);
		
		label = new JLabel(imagens[0]);
		
		c.add(BorderLayout.NORTH, combo);
		c.add(BorderLayout.CENTER, label);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ControleCombo();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED){
			label.setIcon(imagens[combo.getSelectedIndex()]);
		}
	}
}
