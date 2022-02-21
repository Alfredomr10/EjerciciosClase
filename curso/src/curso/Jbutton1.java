package curso;

import javax.swing.*;
import java.awt.event.*;

public class Jbutton1 extends JFrame implements ActionListener {

	JButton boton1;
	JButton boton2;
	JButton boton3;
	JButton boton4;
	JLabel li;
	JTextField textfield1;

//Constructor
	public Jbutton1() {

//Layout absoluto
		setLayout(null);

//Tamaño de la ventana
		setBounds(0, 0, 450, 350);

//Titulo
		setTitle("Ejemplo 1: Botón");

//Cerrar proceso al cerrar la ventana
		setDefaultCloseOperation(EXIT_ON_CLOSE);
//label
		li = new JLabel("programacion DAM");
		li.setBounds(10, 20, 300, 30);
		add(li);
		
		//text
		textfield1 = new JTextField();
		textfield1.setBounds(10,50,100,30);
		add(textfield1);
		
//boton
		boton1 = new JButton("Finalizar");
		boton1.setBounds(300, 250, 100, 30);
		add(boton1);
		boton1.addActionListener(this);

		boton2 = new JButton("Open");
		boton2.setBounds(300, 150, 100, 30);
		add(boton2);
		boton2.addActionListener(this);

		boton3 = new JButton("Other class");
		boton3.setBounds(300, 200, 100, 30);
		add(boton3);
		boton3.addActionListener(this);
		
		boton4 = new JButton("cambio de titulo");
		boton4.setBounds(300, 100, 100, 30);
		add(boton4);
		boton4.addActionListener(this);

//Muestro JFrame (lo último para que lo pinte todo correctamente)
		setVisible(true);
	}


	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == boton1) {
			System.exit(EXIT_ON_CLOSE);
		}
		if (e.getSource() == boton2) {
			System.out.println("holaaaaaaaa");
		}
		if (e.getSource() == boton3) {
			System.out.println("llamando a otra clase");
		}
		if (e.getSource()==boton4) {
			setTitle("jeje cambio de titulo");
		}
	}

	public static void main(String[] args) {

		new Jbutton1();

	}
	}


