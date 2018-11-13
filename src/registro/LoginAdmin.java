package registro;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import tienda.TiendaAdmin;

import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginAdmin extends JFrame {

	private JPanel contentPane;
	private JTextField usuario;
	private JPasswordField contrasena;
	private JButton logIn;
	private String user, pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginAdmin frame = new LoginAdmin();
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
	public LoginAdmin() {
		user = "Admin";
		pass = "Admin";
		
		setTitle("Progra GUZY");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		usuario = new JTextField();
		usuario.setBounds(181, 95, 186, 20);
		contentPane.add(usuario);
		usuario.setColumns(10);
		
		JLabel usuarioText = new JLabel("Usuario");
		usuarioText.setFont(new Font("Tahoma", Font.PLAIN, 20));
		usuarioText.setBounds(67, 77, 104, 49);
		contentPane.add(usuarioText);
		
		JLabel contrasenaText = new JLabel("Contrase\u00F1a");
		contrasenaText.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contrasenaText.setBounds(53, 184, 104, 20);
		contentPane.add(contrasenaText);
		
		contrasena = new JPasswordField();
/*
 * Hashing
String plaintext = "your text here";
MessageDigest m = MessageDigest.getInstance("MD5");
m.reset();
m.update(plaintext.getBytes());
byte[] digest = m.digest();
BigInteger bigInt = new BigInteger(1,digest);
String hashtext = bigInt.toString(16);
// Now we need to zero pad it if you actually want the full 32 chars.
while(hashtext.length() < 32 ){
  hashtext = "0"+hashtext;
}
 */
		contrasena.setBounds(181, 188, 186, 20);
		contentPane.add(contrasena);
		
		logIn = new JButton("Ingresar");
		logIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(user.equals(usuario.getText()) && pass.equals(contrasena.getText())) {
					System.out.println("AK7");
					System.out.println(contrasena.getPassword());
					TiendaAdmin.main(null);
					setVisible(false);
				}else {
					System.out.println("contaseña incorrecta");
				}
				
			}
		});
		logIn.setBounds(167, 315, 89, 23);
		contentPane.add(logIn);
	}
}
