package gr.aueb.cf.schoolapp;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	private JPasswordField password;

	public LoginPage() {
		setBackground(new Color(255, 255, 255));
		setIconImage(Toolkit.getDefaultToolkit().getImage(LandingPage.class.getResource("/images/eduv2.png")));
		setTitle("Αυθεντικοποίηση Χρήστη");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 448, 379);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Σύνδεση");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitle.setBounds(185, 11, 61, 31);
		contentPane.add(lblTitle);
		
		JLabel lblMessage = new JLabel("Παρακαλώ εισάγετε τους κωδικούς σας για να συνδεθείτε");
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setBounds(25, 48, 385, 21);
		contentPane.add(lblMessage);
		
		JLabel lblUser = new JLabel("Χρήστης:");
		lblUser.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUser.setBounds(107, 94, 61, 21);
		contentPane.add(lblUser);
		
		JLabel lblPassword = new JLabel("Κωδικός:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPassword.setBounds(107, 155, 61, 21);
		contentPane.add(lblPassword);
		
		username = new JTextField();
		username.setBounds(107, 114, 197, 30);
		contentPane.add(username);
		username.setColumns(10);
		
		password = new JPasswordField();
		password.setForeground(new Color(0, 0, 0));
		password.setBounds(107, 175, 197, 30);
		contentPane.add(password);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 80, 411, 1);
		contentPane.add(separator);
		
		JButton btnConnect = new JButton("Σύνδεση");
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConnect.setForeground(new Color(255, 255, 255));
		btnConnect.setBackground(new Color(0, 128, 0));
		btnConnect.setBounds(107, 228, 197, 33);
		contentPane.add(btnConnect);
		
		JPanel border = new JPanel();
		border.setBackground(new Color(255, 255, 255));
		border.setBorder(new EmptyBorder(0, 0, 0, 0));
		border.setBounds(48, 90, 335, 191);
		contentPane.add(border);
	}
}
