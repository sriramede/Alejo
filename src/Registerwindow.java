import java.awt.EventQueue;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Registerwindow extends JFrame {

	private JPanel contentPane;
	private JTextField useridregtextField;
	private JTextField NameregtextField;
	private JTextField usernameregtextField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registerwindow frame = new Registerwindow();
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
	public Registerwindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 858, 557);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeNewUser = new JLabel("Welcome new user");
		lblWelcomeNewUser.setBounds(360, 79, 282, 36);
		contentPane.add(lblWelcomeNewUser);
		
		JLabel lblUserId = new JLabel("User ID:");
		lblUserId.setBounds(244, 152, 56, 16);
		contentPane.add(lblUserId);
		
		useridregtextField = new JTextField();
		useridregtextField.setBounds(352, 149, 116, 22);
		contentPane.add(useridregtextField);
		useridregtextField.setColumns(10);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(244, 217, 56, 16);
		contentPane.add(lblName);
		
		NameregtextField = new JTextField();
		NameregtextField.setBounds(352, 214, 116, 22);
		contentPane.add(NameregtextField);
		NameregtextField.setColumns(10);
		
		JLabel lblUsername = new JLabel("UserName:");
		lblUsername.setBounds(244, 287, 64, 16);
		contentPane.add(lblUsername);
		
		usernameregtextField = new JTextField();
		usernameregtextField.setBounds(352, 284, 116, 22);
		contentPane.add(usernameregtextField);
		usernameregtextField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(244, 345, 64, 22);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(352, 345, 116, 22);
		contentPane.add(passwordField);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String idstring=useridregtextField.getText();
				if(idstring==null) {
					JOptionPane.showMessageDialog(null, "userid should not be null");
				}
				String id=null;
				try {
					id = useridregtextField.getText();
				} catch (NullPointerException e3) {
					// TODO Auto-generated catch block
					e3.printStackTrace();
					JOptionPane.showMessageDialog(null, "userid should not be null please enter a valid one");
				}
				String name=NameregtextField.getText();
				String username=usernameregtextField.getText();
				String password=passwordField.getText();
				
				Login loginobjinreg=new Login();
			
				loginobjinreg.createuser1(Integer.parseInt(idstring), name, username, password);
				
				JOptionPane.showMessageDialog(null, "Registered");
				
				//loginobjinreg.showuseres();
				
				
//				Registerwindow frame = new Registerwindow();
//				frame.setVisible(false);
				
				Loginwindow window = new Loginwindow();
				window.frame.setVisible(true);
				
			}
		});
		btnRegister.setBounds(360, 424, 97, 25);
		contentPane.add(btnRegister);
	}

}
