package gr.aueb.cf.schoolapp;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Dashboard extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public Dashboard() {
		setTitle("Πίνακες");
		setIconImage(Toolkit.getDefaultToolkit().getImage(LandingPage.class.getResource("/images/eduv2.png")));
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 504);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel header = new JPanel();
		header.setLayout(null);
		header.setBackground(new Color(0, 52, 117));
		header.setBounds(0, 11, 668, 56);
		contentPane.add(header);
		
		JLabel govImage = new JLabel("");
		govImage.setIcon(new ImageIcon(Dashboard.class.getResource("/images/gov_logo_small.png")));
		govImage.setBounds(10, 0, 152, 56);
		header.add(govImage);
		
		JLabel lblNewLabel = new JLabel("ΚΛΕΙΔΕΡΗΣ ΧΡΗΣΤΟΣ");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(528, 11, 130, 34);
		header.add(lblNewLabel);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBackground(Color.WHITE);
		footer.setBounds(0, 361, 668, 100);
		contentPane.add(footer);
		
		JLabel lblManual = new JLabel("Εγχειρίδιο Χρήσης");
		lblManual.setForeground(Color.BLUE);
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
		
		JPanel leftPanel = new JPanel();
		leftPanel.setBackground(new Color(0, 52, 117));
		leftPanel.setBounds(0, 67, 157, 295);
		contentPane.add(leftPanel);
		leftPanel.setLayout(null);
		
		JLabel lblHome = new JLabel("Αρχική");
		lblHome.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblHome.setForeground(new Color(240, 240, 0));
		lblHome.setBounds(10, 10, 137, 14);
		leftPanel.add(lblHome);
		
		JLabel lblTeachers = new JLabel("Εκπαιδευτές");
		lblTeachers.setForeground(new Color(255, 255, 255));
		lblTeachers.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTeachers.setBounds(10, 30, 137, 14);
		leftPanel.add(lblTeachers);
		
		JLabel lblTeachersView = new JLabel("Προβολή Εκπαιδευτών");
		lblTeachersView.setForeground(new Color(255, 255, 255));
		lblTeachersView.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTeachersView.setBounds(20, 50, 137, 14);
		leftPanel.add(lblTeachersView);
		
		JLabel lblTeachersInsert = new JLabel("Εισαγωγή Εκπαιδευτών");
		lblTeachersInsert.setForeground(new Color(255, 255, 255));
		lblTeachersInsert.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTeachersInsert.setBounds(20, 70, 137, 14);
		leftPanel.add(lblTeachersInsert);
		
		JPanel body = new JPanel();
		body.setBackground(new Color(255, 255, 255));
		body.setBounds(158, 67, 510, 295);
		contentPane.add(body);
		body.setLayout(null);
		
		JLabel lblQuality = new JLabel("Ποιότητα στην Εκπαίδευση");
		lblQuality.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblQuality.setBounds(148, 11, 214, 44);
		body.add(lblQuality);
		
		JLabel lblNewLabel_2 = new JLabel("Προβολή Μητρώου Εκπαιδευτών");
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(22, 70, 432, 16);
		body.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Προβολή Mητρώου Εγγεγραμένων Μελών στο Mητρώο του Coding Factory");
		lblNewLabel_3.setBackground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(22, 88, 432, 16);
		body.add(lblNewLabel_3);
		
		JButton btnViewTeachers = new JButton("Συνέχεια");
		btnViewTeachers.setForeground(new Color(255, 255, 255));
		btnViewTeachers.setBackground(new Color(0, 128, 0));
		btnViewTeachers.setBounds(22, 116, 138, 33);
		body.add(btnViewTeachers);
		
		JLabel lblNewLabel_4 = new JLabel("Εισαγωγή Εκπαιδευτή στο Μητρώο Εκπαιδευτών");
		lblNewLabel_4.setBackground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(22, 182, 432, 16);
		body.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Εισαγωγή Εκπαιδευτή στο Μητρώο του Coding Factory");
		lblNewLabel_5.setBackground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_5.setBounds(22, 200, 432, 16);
		body.add(lblNewLabel_5);
		
		JButton btnInsertTeachers = new JButton("Συνέχεια");
		btnInsertTeachers.setForeground(new Color(255, 255, 255));
		btnInsertTeachers.setBackground(new Color(0, 128, 0));
		btnInsertTeachers.setBounds(22, 228, 138, 33);
		body.add(btnInsertTeachers);
	}

}
