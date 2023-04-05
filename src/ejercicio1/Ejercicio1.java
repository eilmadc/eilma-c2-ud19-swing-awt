/**
 *  C02 - UD19 - Elena López
 */

package ejercicio1;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import java.awt.Font;

public class Ejercicio1 extends JFrame {

	private JPanel contentPane;
	private JLabel lbl1;
	private JTextField tf1;
	private JButton btnNewButton;

	/**
	 * Create the frame.
	 */
	public Ejercicio1() {
		setTitle("EJERCICIO 1: SWING/AWT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setVisible(true);
		
		
		/**
		 * Boton Bienvenida
		 */
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbl1 = new JLabel("Escribe un nombre para saludar");
		lbl1.setBounds(125, 35, 154, 14);
		contentPane.add(lbl1);
		
		tf1 = new JTextField();
		tf1.setBounds(95, 84, 214, 20);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		btnNewButton = new JButton("Saluda!");
		btnNewButton.setBounds(146, 131, 111, 30);
		btnNewButton.setFont(new Font("Candara", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hola "+tf1.getText()+"!", "Bienvenida", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		contentPane.add(btnNewButton);
		

	}

}
