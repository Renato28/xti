package br.com.xti.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class CalculoIMC extends JFrame {

	private JPanel contentPane;
	private JTextField pesoValor;
	private JTextField alturaValor;
	private JTextField imcValor;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculoIMC frame = new CalculoIMC();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculoIMC() {
		setTitle("Calculo IMC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton resultado = new JButton("Calcular");
		resultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double peso = Double.parseDouble(pesoValor.getText());
				double altura = Double.parseDouble(alturaValor.getText());
				double imc = peso / (altura * altura);
				imcValor.setText(imc + "");
				
				
			}
		});
		resultado.setFont(new Font("Tahoma", Font.PLAIN, 26));
		contentPane.add(resultado, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 3, 5, 5));
		
		JLabel lblPeso = new JLabel("Peso :");
		lblPeso.setHorizontalAlignment(SwingConstants.CENTER);
		lblPeso.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(lblPeso);
		
		pesoValor = new JTextField();
		pesoValor.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(pesoValor);
		pesoValor.setColumns(10);
		
		JLabel lblAltura = new JLabel("Altura :");
		lblAltura.setHorizontalAlignment(SwingConstants.CENTER);
		lblAltura.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(lblAltura);
		
		alturaValor = new JTextField();
		alturaValor.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(alturaValor);
		alturaValor.setColumns(10);
		
		JLabel lblImc = new JLabel("IMC : ");
		lblImc.setHorizontalAlignment(SwingConstants.CENTER);
		lblImc.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(lblImc);
		
		imcValor = new JTextField();
		panel.add(imcValor);
		imcValor.setColumns(10);
		
		
	}

}
