package ejercicio4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ejercicio4 extends JFrame {

	private JPanel contentPane;

	private String operando1;
	private String operando2;
	private String operador;
	private boolean resultado;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public Ejercicio4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 309, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitulo = new JLabel("CALCULADORA");
		lblTitulo.setBounds(73, 58, 146, 27);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 22));
		contentPane.add(lblTitulo);

		JPanel panel = new JPanel();
		panel.setBounds(32, 158, 236, 203);
		contentPane.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0, 0, 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		// BOTON 1
		JButton btn01 = new JButton("1");
		btn01.setBackground(new Color(169, 254, 235));
		btn01.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_btn01 = new GridBagConstraints();
		gbc_btn01.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn01.insets = new Insets(0, 0, 5, 5);
		gbc_btn01.gridx = 0;
		gbc_btn01.gridy = 0;
		panel.add(btn01, gbc_btn01);
		btn01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((operando1) == "0") {
					operando1 = btn01.getText();
				} else {
					operando2 = btn01.getText();
				}
				textField.setText(" " + btn01.getText() + " ");
			}
		});

		// BOTON 2
		JButton btn02 = new JButton("2");
		btn02.setBackground(new Color(169, 254, 235));
		btn02.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_btn02 = new GridBagConstraints();
		gbc_btn02.insets = new Insets(0, 0, 5, 5);
		gbc_btn02.gridx = 1;
		gbc_btn02.gridy = 0;
		panel.add(btn02, gbc_btn02);
		btn02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((operando1) == "0") {
					operando1 = btn02.getText();
				} else {
					operando2 = btn02.getText();
				}
				textField.setText(" " + btn02.getText() + " ");
			}
		});

		// BOTON 3
		JButton btn03 = new JButton("3");
		btn03.setBackground(new Color(169, 254, 235));
		btn03.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_btn03 = new GridBagConstraints();
		gbc_btn03.fill = GridBagConstraints.BOTH;
		gbc_btn03.insets = new Insets(0, 0, 5, 5);
		gbc_btn03.gridx = 2;
		gbc_btn03.gridy = 0;
		panel.add(btn03, gbc_btn03);
		btn03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((operando1) == "0") {
					operando1 = btn03.getText();
				} else {
					operando2 = btn03.getText();
				}
				textField.setText(" " + btn03.getText() + " ");
			}
		});

		// BOTON SUMA
		JButton btnsuma = new JButton("+");
		btnsuma.setBackground(new Color(248, 215, 152));
		btnsuma.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_btnsuma = new GridBagConstraints();
		gbc_btnsuma.fill = GridBagConstraints.BOTH;
		gbc_btnsuma.insets = new Insets(0, 0, 5, 0);
		gbc_btnsuma.gridx = 3;
		gbc_btnsuma.gridy = 0;
		panel.add(btnsuma, gbc_btnsuma);
		btnsuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (operador == "+") {
					daResultado();
					operador = btnsuma.getText();
				}else {
					operador = btnsuma.getText();
				}
				textField.setText(" " + btnsuma.getText() + " ");
			}
		});

		// BOTON4
		JButton btn04 = new JButton("4");
		btn04.setBackground(new Color(169, 254, 235));
		btn04.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_btn04 = new GridBagConstraints();
		gbc_btn04.fill = GridBagConstraints.BOTH;
		gbc_btn04.insets = new Insets(0, 0, 5, 5);
		gbc_btn04.gridx = 0;
		gbc_btn04.gridy = 1;
		panel.add(btn04, gbc_btn04);
		btn04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((operando1) == "0") {
					operando1 = btn04.getText();
				} else {
					operando2 = btn04.getText();
				}
				textField.setText(" " + btn04.getText() + " ");
			}
		});

		// BOTON 5
		JButton btn05 = new JButton("5");
		btn05.setBackground(new Color(169, 254, 235));
		btn05.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_btn05 = new GridBagConstraints();
		gbc_btn05.insets = new Insets(0, 0, 5, 5);
		gbc_btn05.gridx = 1;
		gbc_btn05.gridy = 1;
		panel.add(btn05, gbc_btn05);
		btn05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((operando1) == "0") {
					operando1 = btn05.getText();
				} else {
					operando2 = btn05.getText();
				}
				textField.setText(" " + btn05.getText() + " ");
			}
		});

		// BOTON 6
		JButton btn06 = new JButton("6");
		btn06.setBackground(new Color(169, 254, 235));
		btn06.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_btn06 = new GridBagConstraints();
		gbc_btn06.fill = GridBagConstraints.BOTH;
		gbc_btn06.insets = new Insets(0, 0, 5, 5);
		gbc_btn06.gridx = 2;
		gbc_btn06.gridy = 1;
		panel.add(btn06, gbc_btn06);
		btn06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((operando1) == "0") {
					operando1 = btn06.getText();
				} else {
					operando2 = btn06.getText();
				}
				textField.setText(" " + btn06.getText() + " ");
			}
		});

		// BOTON RESTA
		JButton btnResta = new JButton("-");
		btnResta.setBackground(new Color(248, 215, 152));
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operador = "-";
				textField.setText(" " + operador + " ");
			}
		});
		btnResta.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_btnResta = new GridBagConstraints();
		gbc_btnResta.fill = GridBagConstraints.BOTH;
		gbc_btnResta.insets = new Insets(0, 0, 5, 0);
		gbc_btnResta.gridx = 3;
		gbc_btnResta.gridy = 1;
		panel.add(btnResta, gbc_btnResta);

		// BOTON 7
		JButton btn07 = new JButton("7");
		btn07.setBackground(new Color(169, 254, 235));
		btn07.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_btn07 = new GridBagConstraints();
		gbc_btn07.fill = GridBagConstraints.BOTH;
		gbc_btn07.insets = new Insets(0, 0, 5, 5);
		gbc_btn07.gridx = 0;
		gbc_btn07.gridy = 2;
		panel.add(btn07, gbc_btn07);
		btn07.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((operando1) == "0") {
					operando1 = btn07.getText();
				} else {
					operando2 = btn07.getText();
				}
				textField.setText(" " + btn07.getText() + " ");
			}
		});

		// BOTON 8
		JButton btn08 = new JButton("8");
		btn08.setBackground(new Color(169, 254, 235));
		btn08.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_btn08 = new GridBagConstraints();
		gbc_btn08.fill = GridBagConstraints.BOTH;
		gbc_btn08.insets = new Insets(0, 0, 5, 5);
		gbc_btn08.gridx = 1;
		gbc_btn08.gridy = 2;
		panel.add(btn08, gbc_btn08);
		btn08.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (operando1 == "0") {
					operando1 = btn08.getText();
				} else {
					operando2 = btn08.getText();
				}
				textField.setText(" " + btn08.getText() + " ");
			}
		});

		// BOTON 9
		JButton btn09 = new JButton("9");
		btn09.setBackground(new Color(169, 254, 235));
		btn09.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_btn09 = new GridBagConstraints();
		gbc_btn09.fill = GridBagConstraints.BOTH;
		gbc_btn09.insets = new Insets(0, 0, 5, 5);
		gbc_btn09.gridx = 2;
		gbc_btn09.gridy = 2;
		btn09.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((operando1) == "0") {
					operando1 = btn09.getText();
				} else {
					operando2 = btn09.getText();
				}
				textField.setText(" " + btn09.getText() + " ");
			}
		});
		panel.add(btn09, gbc_btn09);

		// BOTON MULTIPLICA
		JButton btnMultiplica = new JButton("*");
		btnMultiplica.setBackground(new Color(248, 215, 152));
		btnMultiplica.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_btnMultiplica = new GridBagConstraints();
		gbc_btnMultiplica.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnMultiplica.insets = new Insets(0, 0, 5, 0);
		gbc_btnMultiplica.gridx = 3;
		gbc_btnMultiplica.gridy = 2;
		panel.add(btnMultiplica, gbc_btnMultiplica);
		btnMultiplica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(" " + btnMultiplica.getText() + " ");
			}
		});

		// BOTON RESET
		JButton btnReset = new JButton("CE");
		btnReset.setBackground(new Color(248, 215, 152));
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iniciaCalculadora();
			}
		});
		GridBagConstraints gbc_btnReset = new GridBagConstraints();
		gbc_btnReset.fill = GridBagConstraints.BOTH;
		gbc_btnReset.insets = new Insets(0, 0, 0, 5);
		gbc_btnReset.gridx = 0;
		gbc_btnReset.gridy = 3;
		panel.add(btnReset, gbc_btnReset);

		JButton btn0 = new JButton("0");
		btn0.setBackground(new Color(169, 254, 235));
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_btn0 = new GridBagConstraints();
		gbc_btn0.fill = GridBagConstraints.BOTH;
		gbc_btn0.insets = new Insets(0, 0, 0, 5);
		gbc_btn0.gridx = 1;
		gbc_btn0.gridy = 3;
		panel.add(btn0, gbc_btn0);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((operando1) == "0") {
					operando1 = btn0.getText();
				} else {
					operando2 = btn0.getText();
				}
				textField.setText(" " + btn0.getText() + " ");
			}
		});

		JButton btnIgual = new JButton("=");
		btnIgual.setBackground(new Color(248, 215, 152));
		btnIgual.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_btnIgual = new GridBagConstraints();
		gbc_btnIgual.fill = GridBagConstraints.BOTH;
		gbc_btnIgual.insets = new Insets(0, 0, 0, 5);
		gbc_btnIgual.gridx = 2;
		gbc_btnIgual.gridy = 3;
		panel.add(btnIgual, gbc_btnIgual);
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(" " + btnIgual.getText() + " ");
				textField.setText(" " + daResultado() + " ");
			}
		});

		JButton btnDivide = new JButton("/");
		btnDivide.setBackground(new Color(248, 215, 152));
		btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_btnDivide = new GridBagConstraints();
		gbc_btnDivide.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnDivide.gridx = 3;
		gbc_btnDivide.gridy = 3;
		panel.add(btnDivide, gbc_btnDivide);
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(" " + btnDivide.getText() + " ");
			}
		});

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(32, 96, 236, 51);
		contentPane.add(textField);
		textField.setColumns(10);

	}

	public void iniciaCalculadora() {
		operando1 = "0";
		operando2 = "0";
		operador = "";
	}

	/**
	 * SUMA
	 * 
	 * @param op1
	 * @param op2
	 * @return
	 */
	public double suma(Double op1, Double op2) {
		return (op1 + op2);
	}

	/**
	 * RESTA
	 * 
	 * @param op1
	 * @param op2
	 * @return
	 */
	public double resta(Double op1, Double op2) {
		return (op1 - op2);
	}

	/**
	 * MULTIPLICA
	 * 
	 * @param op1
	 * @param op2
	 * @return
	 */
	public double multiplica(Double op1, Double op2) {
		return (op1 * op2);
	}

	/**
	 * DIVIDE
	 * 
	 * @param op1
	 * @param op2
	 * @return
	 */
	public double divide(Double op1, Double op2) {
		return (op1 / op2);
	}

	public String daResultado() {
		System.out.println(operando1 +" "+ operando2 + " "+ operador);
		Double op1 = Double.parseDouble(operando1);
		Double op2 = Double.parseDouble(operando2);

		double rs = 0;
		String resultado;
		switch (operador) {
		case "+":
			rs = suma(op1, op2);
			break;
		case "-":
			resta(op1, op2);
			break;
		case "*":
			rs = multiplica(op1, op2);
			break;
		case "/":
			rs = divide(op1, op2);
			break;
		default:
			iniciaCalculadora();
		}

		resultado = String.valueOf(rs);
		return resultado;
	}
}
