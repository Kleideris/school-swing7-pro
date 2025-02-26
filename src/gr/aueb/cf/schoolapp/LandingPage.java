package gr.aueb.cf.schoolapp;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LandingPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public LandingPage() {
		setBackground(new Color(255, 255, 255));
		setIconImage(Toolkit.getDefaultToolkit().getImage(LandingPage.class.getResource("/images/eduv2.png")));
		setTitle("Ποιότητα στην Εκπαίδευση");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 451);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel header = new JPanel();
		header.setBackground(new Color(0, 52, 117));
		header.setBounds(0, 17, 668, 56);
		contentPane.add(header);
		header.setLayout(null);
		
		JLabel govImage = new JLabel("");
		govImage.setIcon(new ImageIcon(LandingPage.class.getResource("/images/gov_logo_small.png")));
		govImage.setBounds(10, 0, 152, 56);
		header.add(govImage);
		
		JLabel lblAuthRequired = new JLabel("Απαιτείται Ταυτοποίηση");
		lblAuthRequired.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAuthRequired.setBounds(29, 84, 286, 56);
		contentPane.add(lblAuthRequired);
		
		JLabel lblMustConnect = new JLabel("Για να προχωρήσετε πρέπει να συνδεθείται");
		lblMustConnect.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMustConnect.setBounds(29, 151, 236, 30);
		contentPane.add(lblMustConnect);
		
		JButton btnConnect = new JButton("Σύνδεση");
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getLandingPage().setVisible(false);
				Main.getLoginPage().setVisible(true);
			}
		});
		btnConnect.setEnabled(false);
		btnConnect.setForeground(new Color(255, 255, 255));
		btnConnect.setBackground(new Color(0, 128, 0));
		btnConnect.setBounds(29, 243, 112, 39);
		contentPane.add(btnConnect);
		
		JCheckBox privacyCheckbox = new JCheckBox("Δηλώνω οτι αποδέχομαι τη");
		privacyCheckbox.setBackground(new Color(255, 255, 255));
		privacyCheckbox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					btnConnect.setEnabled(true);
				} else {
					btnConnect.setEnabled(false);
				}
			}
		});
		privacyCheckbox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		privacyCheckbox.setBounds(29, 181, 167, 22);
		contentPane.add(privacyCheckbox);
		
		JLabel lblPrivacy = new JLabel("Δήλωση Ιδιωτικότητας");
		lblPrivacy.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPrivacy.setForeground(new Color(0, 0, 255));
		lblPrivacy.setBounds(202, 181, 153, 22);
		contentPane.add(lblPrivacy);
		
		JPanel footer = new JPanel();
		footer.setBackground(new Color(255, 255, 255));
		footer.setBounds(0, 309, 668, 100);
		contentPane.add(footer);
		footer.setLayout(null);
		
		JLabel lblManual = new JLabel("Εγχειρίδιο Χρήσης");
		lblManual.setForeground(new Color(0, 0, 255));
		lblManual.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblManual.setBounds(63, 39, 102, 30);
		footer.add(lblManual);
		
		JLabel lblQuestions = new JLabel("Συχνές Ερωτήσεις");
		lblQuestions.setForeground(Color.BLUE);
		lblQuestions.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblQuestions.setBounds(255, 39, 102, 30);
		footer.add(lblQuestions);
		
		JLabel lblSupport = new JLabel("Υποστήριξη Πολιτών");
		lblSupport.setForeground(Color.BLUE);
		lblSupport.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSupport.setBounds(447, 39, 122, 30);
		footer.add(lblSupport);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 128, 255));
		separator.setBounds(0, 2, 668, 1);
		footer.add(separator);
	}
}
