package registro;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;
import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {
	private Component confirmation;
	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Progra de Guzi");
	//	initComponents();
		setLocationRelativeTo(null); //centra la vara
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton botonCliente = new JButton();
		try {
			ImageIcon img = new ImageIcon("cliente.png");
			botonCliente.setIcon(img);
		} catch (Exception ex) {
			
		}
		botonCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		botonCliente.setBounds(42, 75, 129, 152);
		contentPane.add(botonCliente);
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCliente.setBounds(74, 238, 119, 14);
		contentPane.add(lblCliente);
		
		JButton botonAdmin = new JButton();
		botonAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				LoginAdmin logadmin = new LoginAdmin();
				logadmin.main(null);
			}
		});
		try {
			ImageIcon img1 = new ImageIcon("admin.png");
			botonAdmin.setIcon(img1);
		} catch (Exception ex) {
			
		}
		botonAdmin.setBounds(251, 75, 136, 152);
		contentPane.add(botonAdmin);
		
		
		JLabel lblAdministrador = new JLabel("Administrador");
		lblAdministrador.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAdministrador.setBounds(261, 238, 112, 34);
		contentPane.add(lblAdministrador);
	}
}
