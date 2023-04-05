package ejercicio2;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class Ejercicio2 extends JFrame {

	private JPanel contentPane;
	private JLabel lbl1;
	private JTextField tf1;
	private JButton btn1;
	private JLabel lblPelculas;
	private JComboBox<String> comboBox;

	/**
	 * Create the frame.
	 */
	public Ejercicio2() {
		setTitle("EJERCICIO 2: SWING/AWT");
		setBounds(new Rectangle(72, 0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 692, 435);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setVisible(true);

		/**
		 * LAYOUT
		 */
		setContentPane(contentPane);
		contentPane.setLayout(null);

		/**
		 * Label Peliculas
		 */
		lblPelculas = new JLabel("Películas");
		lblPelculas.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblPelculas.setBounds(261, 39, 160, 32);
		contentPane.add(lblPelculas);

		/**
		 * Label escribe un titulo
		 */
		lbl1 = new JLabel("Escribe un título para una película");
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl1.setBounds(24, 123, 297, 50);
		contentPane.add(lbl1);

		/**
		 * Button añadir titulo
		 */
		btn1 = new JButton("Añadir");
		btn1.setHorizontalTextPosition(SwingConstants.CENTER);
		btn1.setBorder(new LineBorder(new Color(0, 0, 0)));
		btn1.setBackground(new Color(192, 192, 192));
		btn1.setBounds(92, 247, 116, 58);
		btn1.setActionCommand("Añadir");
		btn1.setFont(new Font("Candara", Font.BOLD, 15));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.addItem(tf1.getText());
			}
		});

		/**
		 * TextField escribe un titulo
		 */
		tf1 = new JTextField();
		tf1.setBounds(68, 175, 166, 32);
		tf1.setMinimumSize(new Dimension(7, 16));
		tf1.setMargin(new Insets(8, 8, 8, 8));
		contentPane.add(tf1);
		tf1.setColumns(10);

		/**
		 * Select con Listado de peliculas
		 */
		comboBox = new JComboBox<String>();
		comboBox.setBounds(387, 175, 253, 32);
		contentPane.add(comboBox);
		contentPane.add(btn1);

	}

}
