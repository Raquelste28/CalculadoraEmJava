package Calculator;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

@SuppressWarnings("serial")
public class Formulario extends JFrame {

	private JPanel contentPane;
	JTextField txtresultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
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
	public Formulario()	{	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 318, 377);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtresultado = new JTextField();
		txtresultado.setBackground(new Color(205, 254, 243));
		txtresultado.setBounds(42, 22, 222, 42);
		contentPane.add(txtresultado);
		txtresultado.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtresultado.setText(txtresultado.getText()+'8');
			}
		});
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 9));
		btnNewButton_1.setBounds(82, 95, 40, 38);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtresultado.setText(txtresultado.getText()+'9');
			}
		});
		btnNewButton_2.setFont(new Font("Arial Black", Font.PLAIN, 9));
		btnNewButton_2.setBounds(133, 95, 40, 38);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("ce");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtresultado.setText("");
			}
		});
		btnNewButton_3.setFont(new Font("Arial Black", Font.PLAIN, 9));
		btnNewButton_3.setBounds(179, 95, 49, 39);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("+");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtresultado.getText());
				txtresultado.setText("");
				sinal = "soma";
				
			}
		});
		btnNewButton_4.setFont(new Font("Arial Black", Font.PLAIN, 9));
		btnNewButton_4.setBounds(231, 96, 40, 38);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("4");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtresultado.setText(txtresultado.getText()+ '4');
			}
		});
		btnNewButton_5.setFont(new Font("Arial Black", Font.PLAIN, 9));
		btnNewButton_5.setBounds(31, 141, 40, 38);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_1_1 = new JButton("5");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtresultado.setText(txtresultado.getText()+'5');
			}
		});
		btnNewButton_1_1.setFont(new Font("Arial Black", Font.PLAIN, 9));
		btnNewButton_1_1.setBounds(81, 141, 40, 38);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("6");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtresultado.setText(txtresultado.getText()+'6');
			}
		});
		btnNewButton_2_1.setFont(new Font("Arial Black", Font.PLAIN, 9));
		btnNewButton_2_1.setBounds(132, 141, 40, 38);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("c");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = null;
				valor2 = null;
				txtresultado.setText("");
			}
			
		});
		btnNewButton_3_1.setFont(new Font("Arial Black", Font.PLAIN, 9));
		btnNewButton_3_1.setBounds(179, 141, 40, 38);
		contentPane.add(btnNewButton_3_1);
		
		JButton btnNewButton_4_1 = new JButton("-");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtresultado.getText());
				txtresultado.setText("");
				sinal = "subtração";
				
			}
		});
		btnNewButton_4_1.setFont(new Font("Arial Black", Font.PLAIN, 9));
		btnNewButton_4_1.setBounds(231, 141, 40, 38);
		contentPane.add(btnNewButton_4_1);
		
		JButton btnNewButton_6 = new JButton("1");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtresultado.setText(txtresultado.getText()+ '1');
			}
		});
		btnNewButton_6.setFont(new Font("Arial Black", Font.PLAIN, 9));
		btnNewButton_6.setBounds(32, 193, 40, 38);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_1_2 = new JButton("2");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtresultado.setText(txtresultado.getText()+'2');
			}
		});
		btnNewButton_1_2.setFont(new Font("Arial Black", Font.PLAIN, 9));
		btnNewButton_1_2.setBounds(81, 192, 40, 38);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_2_2 = new JButton("3");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtresultado.setText(txtresultado.getText()+'3');
			}
		});
		btnNewButton_2_2.setFont(new Font("Arial Black", Font.PLAIN, 9));
		btnNewButton_2_2.setBounds(131, 192, 40, 38);
		contentPane.add(btnNewButton_2_2);
		
		JButton btnNewButton_3_2 = new JButton("=");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor2 = Double.parseDouble(txtresultado.getText());
				
				if (sinal == "soma") {
					
					txtresultado.setText(String.valueOf(valor1 + valor2));
				}
				
				if (sinal == "subtração") {
					txtresultado.setText(String.valueOf(valor1 - valor2));
				}
				
				if (sinal == "multiplicação") {
					txtresultado.setText(String.valueOf(valor1 * valor2));
				}
				
				if (sinal == "divisão") {
					txtresultado.setText(String.valueOf(valor1 / valor2));
				}
				
			}
		});
		btnNewButton_3_2.setFont(new Font("Arial Black", Font.PLAIN, 9));
		btnNewButton_3_2.setBounds(179, 191, 40, 86);
		contentPane.add(btnNewButton_3_2);
		
		JButton btnNewButton_4_2 = new JButton("*");
		btnNewButton_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtresultado.getText());
				txtresultado.setText("");
				sinal = "multiplicação";
						
			}
		});
		btnNewButton_4_2.setFont(new Font("Arial Black", Font.PLAIN, 9));
		btnNewButton_4_2.setBounds(231, 189, 40, 38);
		contentPane.add(btnNewButton_4_2);
		
		JButton btnNewButton_7 = new JButton("0");
		btnNewButton_7.setFont(new Font("Arial Black", Font.PLAIN, 9));
		btnNewButton_7.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent e) {
			txtresultado.setText(txtresultado.getText() + "0");
			}
		});
		btnNewButton_7.setBounds(32, 239, 91, 38);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_1_3 = new JButton(".");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtresultado.setText(txtresultado.getText()+'.');
			}
		});
		btnNewButton_1_3.setFont(new Font("Arial Black", Font.PLAIN, 9));
		btnNewButton_1_3.setBounds(131, 239, 40, 38);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_4_3 = new JButton("/");
		btnNewButton_4_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtresultado.getText());
				txtresultado.setText("");
				sinal = "divisão";
			}
		});
		btnNewButton_4_3.setFont(new Font("Arial Black", Font.PLAIN, 9));
		btnNewButton_4_3.setBounds(231, 240, 40, 38);
		contentPane.add(btnNewButton_4_3);
		
		JButton btnNewButton_1_4 = new JButton("7");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtresultado.setText(txtresultado.getText()+'7');
			}
		});
		btnNewButton_1_4.setFont(new Font("Arial Black", Font.PLAIN, 9));
		btnNewButton_1_4.setBounds(31, 95, 40, 38);
		contentPane.add(btnNewButton_1_4);
	}
	
	Double valor1,valor2;
	String sinal;
	public Object btnNewButton_3_2;
	
	
}
