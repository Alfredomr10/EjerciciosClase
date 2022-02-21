package curso;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener {
	Container container = getContentPane();
	JLabel userLabel = new JLabel("USERNAME");
	JLabel paswordLabel = new JLabel("PASSWORD");
	JTextField user = new JTextField("");
	JPasswordField contraseña = new JPasswordField("");
	JButton botonlogin = new JButton("login");
	JButton resetboton = new JButton("reset");
	
	JCheckBox showpassword = new JCheckBox("show password");

	LoginFrame() {
		setLayoutManager();
		setLocationAndSize();
		addActionEvent();
	}

	private void addActionEvent() {
		// TODO Auto-generated method stub
		botonlogin.addActionListener(this);
		resetboton.addActionListener(this);
		showpassword.addActionListener(this);

	}

	public void setLocationAndSize() {
		// TODO Auto-generated method stub
		userLabel.setBounds(50, 150, 100, 30);
		container.add(userLabel);
		paswordLabel.setBounds(50, 200, 100, 30);
		container.add(paswordLabel);

		user.setBounds(200, 150, 100, 30);
		container.add(user);
		contraseña.setBounds(200, 200, 100, 30);
		container.add(contraseña);

		botonlogin.setBounds(50, 300, 100, 30);
		container.add(botonlogin);
		resetboton.setBounds(200, 300, 100, 30);
		container.add(resetboton);

		showpassword.setBounds(100,250,150,50);
		container.add(showpassword);
	}

	public void setLayoutManager() {
		// TODO Auto-generated method stub
		container.setLayout(null);
	}

	public static void main(String[] args) {
		LoginFrame frame = new LoginFrame();
		frame.setTitle("login from");
		frame.setBounds(10, 10, 370, 600);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == botonlogin) {
			System.out.println("probando");
			String usertest;
			String pwdtest;
			usertest =user.getText();
			pwdtest =contraseña.getText();
			
			if(usertest.equalsIgnoreCase("mehtab")&& pwdtest.equalsIgnoreCase("12345")) {
				JOptionPane.showMessageDialog(this, "login sucefull");
			}else {
				JOptionPane.showMessageDialog(this, "incorrecto");
			}
		}
		if (e.getSource() == resetboton) {
			user.setText("");
			contraseña.setText("");
		}
		if (e.getSource()==showpassword) {
			if(showpassword.isSelected()) {
				contraseña.setEchoChar((char)0);
			}else {
				contraseña.setEchoChar('*');
			}
		}
	}

}
