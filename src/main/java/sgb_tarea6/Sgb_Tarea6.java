package sgb_tarea6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;

public class Sgb_Tarea6 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sgb_Tarea6 window = new Sgb_Tarea6();
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
	public Sgb_Tarea6() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSaraGarcaBarbas = new JLabel("Sara García Barbas");
		lblSaraGarcaBarbas.setHorizontalAlignment(SwingConstants.CENTER);
		lblSaraGarcaBarbas.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblSaraGarcaBarbas.setBounds(115, 10, 201, 35);
		frame.getContentPane().add(lblSaraGarcaBarbas);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(66, 55, 317, 2);
		frame.getContentPane().add(separator);
		
		JRadioButton radioButton1 = new JRadioButton("Gerald es un pesao");
		radioButton1.setBounds(162, 82, 137, 21);
		frame.getContentPane().add(radioButton1);
		
		JRadioButton radioButton2 = new JRadioButton("¿No estais contentos?");
		radioButton2.setBounds(162, 135, 137, 21);
		frame.getContentPane().add(radioButton2);
		
		JRadioButton radioButton3 = new JRadioButton("Madre mía, un for!");
		radioButton3.setBounds(162, 193, 154, 21);
		frame.getContentPane().add(radioButton3);
	}
}
