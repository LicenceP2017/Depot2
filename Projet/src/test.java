import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;


public class test {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test window = new test();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(238, 238, 238));
		frame.setBounds(100, 100, 824, 532);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblConnexion = new JLabel("CONNEXION");
		lblConnexion.setFont(new Font("Dialog", Font.BOLD, 20));
		lblConnexion.setBounds(337, 81, 152, 51);
		frame.getContentPane().add(lblConnexion);
		
		JLabel lblIdentifiant = new JLabel("Identifiant :");
		lblIdentifiant.setFont(new Font("Dialog", Font.BOLD, 14));
		lblIdentifiant.setBounds(216, 192, 100, 42);
		frame.getContentPane().add(lblIdentifiant);
		
		JLabel lblMotDePasse = new JLabel("Mot de Passe :");
		lblMotDePasse.setFont(new Font("Dialog", Font.BOLD, 14));
		lblMotDePasse.setBounds(216, 267, 192, 42);
		frame.getContentPane().add(lblMotDePasse);
		
		textField = new JTextField();
		textField.setBounds(453, 275, 160, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(453, 204, 160, 27);
		frame.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("VALIDER");
		btnNewButton.setBounds(486, 393, 117, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnInscription = new JButton("INSCRIPTION");
		btnInscription.setBounds(216, 393, 138, 25);
		frame.getContentPane().add(btnInscription);
	}
}