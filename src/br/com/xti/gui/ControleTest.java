package br.com.xti.gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ControleTest extends JFrame {

	JButton ok, cancel;
	JTextField login;
	JPasswordField senha;

	public ControleTest() {

		super("Textos e Senhas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);

		login = new JTextField();
		senha = new JPasswordField();

		ok = new JButton("ok");
		ok.addActionListener(new BotaoOkListener());

		cancel = new JButton("cancel");
		cancel.addActionListener(new BotaoCancelListener());

		Container c = getContentPane();
		c.setLayout(new GridLayout(3, 2));
		c.add(new Label("Login: "));
		c.add(login);
		c.add(new Label("Senha:"));
		c.add(senha);
		c.add(ok);
		c.add(cancel);
	}

	class BotaoOkListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == ok) {
				String s = "Login:" + login.getText() + "\nsenha: "
						+ new String(senha.getPassword());
				JOptionPane.showMessageDialog(null, s);
			}
		}
	}

	class BotaoCancelListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == cancel){
				login.setText("");
				senha.setText("");
			}
		}
	}

	public static void main(String[] args) {
		new ControleTest();
	}
}
