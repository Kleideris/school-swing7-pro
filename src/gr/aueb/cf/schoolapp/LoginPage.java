package gr.aueb.cf.schoolapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class LoginPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_User;
	private JTextField textField_Password;

	/**
	 * Create the frame.
	 */
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 443, 363);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Σύνδεση");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTitle.setBounds(185, 11, 61, 31);
		contentPane.add(lblTitle);
		
		JLabel lblText = new JLabel("Παρακαλώ εισάγετε τους κωδικούς σας για να συνδεθείτε");
		lblText.setBounds(77, 48, 276, 21);
		contentPane.add(lblText);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 80, 411, 1);
		contentPane.add(separator);
		
		JLabel lblUser = new JLabel("Χρήστης:");
		lblUser.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUser.setBounds(107, 94, 61, 21);
		contentPane.add(lblUser);
		
		textField_User = new JTextField();
		textField_User.setBounds(107, 114, 197, 30);
		contentPane.add(textField_User);
		textField_User.setColumns(10);
		
		JLabel lblPassword = new JLabel("Κωδικός:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPassword.setBounds(107, 155, 61, 21);
		contentPane.add(lblPassword);
		
		textField_Password = new JTextField();
		textField_Password.setColumns(10);
		textField_Password.setBounds(107, 175, 197, 30);
		contentPane.add(textField_Password);
		
		JButton btnConnect = new JButton("Σύνδεση");
		btnConnect.setForeground(new Color(255, 255, 255));
		btnConnect.setBackground(new Color(0, 128, 0));
		btnConnect.setBounds(107, 228, 197, 33);
		contentPane.add(btnConnect);
	}
}
