package ejercicio3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JSlider;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Enumeration;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Ejercicio3 extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private ButtonGroup group1, group2;
	private String group1Selected, group2Selected;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio3 frame = new Ejercicio3();
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
	public Ejercicio3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 433, 628);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Tahoma", Font.PLAIN, 9));
		contentPane.setBackground(new Color(254, 231, 194));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		/**
		 * Titulo miniencuesta
		 */
		JLabel lbl1 = new JLabel("MINIENCUESTA");
		lbl1.setBounds(147, 11, 175, 25);
		lbl1.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lbl1);

		/*
		 * label ---------------------------------------- Sistema operativo
		 * ----------------------------------------
		 */
		JLabel lblos_0 = new JLabel("Elige un sistema operativo:");
		lblos_0.setBounds(133, 64, 197, 20);
		lblos_0.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblos_0);

		JRadioButton rdbtnos0_1 = new JRadioButton("Windows");
		rdbtnos0_1.setBounds(86, 90, 93, 23);
		rdbtnos0_1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnos0_1.setBackground(new Color(211, 250, 232));
		contentPane.add(rdbtnos0_1);

		JRadioButton rdbtnos0_2 = new JRadioButton("Linux");
		rdbtnos0_2.setBounds(191, 91, 68, 23);
		rdbtnos0_2.setBackground(new Color(211, 250, 232));
		contentPane.add(rdbtnos0_2);

		JRadioButton rdbtnos0_3 = new JRadioButton("Mac");
		rdbtnos0_3.setBounds(277, 91, 53, 23);
		rdbtnos0_3.setBackground(new Color(211, 250, 232));
		contentPane.add(rdbtnos0_3);

		/*
		 * Agrupar radio Buttons
		 */
		group1 = new ButtonGroup();
		group1.add(rdbtnos0_1);
		group1.add(rdbtnos0_2);
		group1.add(rdbtnos0_3);

		/**
		 * Listeners Sistema Operativo radiobuttons.
		 */
		ActionListener send1 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<String> selectedBoxes = new ArrayList<String>();

				if (rdbtnos0_1.isSelected()) {
					selectedBoxes.add(rdbtnos0_1.getText());
				}

				if (rdbtnos0_2.isSelected()) {
					selectedBoxes.add(rdbtnos0_2.getText());
				}

				if (rdbtnos0_3.isSelected()) {
					selectedBoxes.add(rdbtnos0_3.getText());
				}

				Enumeration<AbstractButton> allRadioButton = group1.getElements();
				while (allRadioButton.hasMoreElements()) {
					JRadioButton temp = (JRadioButton) allRadioButton.nextElement();
					if (temp.isSelected()) {
						group1Selected = temp.getText();

					}
				}
			}
		};

		/**
		 * RadioButtons Listeners
		 */
		rdbtnos0_1.addActionListener(send1);
		rdbtnos0_2.addActionListener(send1);
		rdbtnos0_3.addActionListener(send1);

		/*
		 * Label------------------------------------- Especialidad ----------------------------------------
		 */
		JLabel lbl_2 = new JLabel("Elige tu especialidad:");
		lbl_2.setBounds(133, 148, 155, 20);
		lbl_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lbl_2);

		JRadioButton rdbtn1_1 = new JRadioButton("Programación");
		rdbtn1_1.setBounds(147, 175, 141, 23);
		rdbtn1_1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtn1_1.setBackground(new Color(211, 250, 232));
		contentPane.add(rdbtn1_1);

		JRadioButton rdbtn1_2 = new JRadioButton("Diseño Gráfico");
		rdbtn1_2.setBounds(147, 201, 141, 23);
		rdbtn1_2.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtn1_2.setBackground(new Color(211, 250, 232));
		contentPane.add(rdbtn1_2);

		JRadioButton rdbtn1_3 = new JRadioButton("Administración");
		rdbtn1_3.setBounds(147, 227, 141, 23);
		rdbtn1_3.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtn1_3.setBackground(new Color(211, 250, 232));
		contentPane.add(rdbtn1_3);

		/*
		 * Agrupar radio Buttons
		 */
		group2 = new ButtonGroup();
		group2.add(rdbtn1_1);
		group2.add(rdbtn1_2);
		group2.add(rdbtn1_3);

		/**
		 * Listeners Especialidad radiobuttons.
		 */
		ActionListener send2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				ArrayList<String> selectedBoxes = new ArrayList<String>();

				if (rdbtn1_1.isSelected()) {
					selectedBoxes.add(rdbtnos0_1.getText());
				}

				if (rdbtn1_2.isSelected()) {
					selectedBoxes.add(rdbtnos0_2.getText());
				}

				if (rdbtn1_3.isSelected()) {
					selectedBoxes.add(rdbtnos0_3.getText());
				}

				Enumeration<AbstractButton> allRadioButton = group2.getElements();
				while (allRadioButton.hasMoreElements()) {
					JRadioButton temp = (JRadioButton) allRadioButton.nextElement();
					if (temp.isSelected()) {
						group2Selected = temp.getText();

					}
				}
			}
		};

		/**
		 * RadioButtons Listeners
		 */
		rdbtn1_1.addActionListener(send2);
		rdbtn1_2.addActionListener(send2);
		rdbtn1_3.addActionListener(send2);

		/*
		 * Slider Horas dedicadas ordenador.
		 */
		JLabel lbl_3 = new JLabel("Horas dedicadas al ordenador:");
		lbl_3.setBounds(133, 283, 216, 20);
		lbl_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lbl_3);

		JSlider slider1 = new JSlider();
		slider1.setPaintLabels(true);
		slider1.setMajorTickSpacing(1);
		slider1.setMinorTickSpacing(1);
		slider1.setBounds(133, 314, 175, 46);
		slider1.setValue(0);
		slider1.setBackground(new Color(211, 250, 232));
		slider1.setPaintTicks(true);
		slider1.setMaximum(10);
		contentPane.add(slider1);

		/**
		 * Boton de Enviar
		 */
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(171, 370, 117, 31);
		btnEnviar.setBackground(new Color(91, 236, 171));
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf1.setText("\n Resultado Encuesta\n" + "\n Sistema Operativo : " + group1Selected + "\nEspecialidad: "
						+ group2Selected + "\n Horas: "+ slider1.getValue() );
			}
		});
		contentPane.add(btnEnviar);

		
		//TODO: Error Ajustando el texto en lineas.
		// Campo de Texto Imprimir
		tf1 = new JTextField();
		tf1.setBounds(109, 437, 240, 125);
		contentPane.add(tf1);
		tf1.setColumns(10);
	}

}
