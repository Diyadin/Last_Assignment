package otherClasses;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorClass {

	private JFrame frmCalculator;
	private JTextField resultField;
	private JButton btnMinus = new JButton("-");
	private JButton btnAdd = new JButton("+");
	private JButton btnMulti = new JButton("*");
	private JButton btnDivide = new JButton("/");
	private JButton btn7 = new JButton("7");
	private JButton btn5 = new JButton("5");
	private JButton btn6 = new JButton("6");
	private JButton btn9 = new JButton("9");
	private JButton btn4 = new JButton("4");
	private JButton btn1 = new JButton("1");
	private JButton btn2 = new JButton("2");
	private JButton btn3 = new JButton("3");
	private JButton btnZero = new JButton("0");
	private JButton btnDot = new JButton(".");
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorClass window = new CalculatorClass();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorClass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setBounds(100, 100, 450, 468);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		resultField = new JTextField();
		resultField.setBounds(6, 19, 438, 56);
		frmCalculator.getContentPane().add(resultField);
		resultField.setColumns(10);
		
		btnAdd.setBounds(6, 87, 77, 56);
		frmCalculator.getContentPane().add(btnAdd);
		
		btnMulti.setBounds(184, 87, 77, 56);
		frmCalculator.getContentPane().add(btnMulti);
		
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMinus.setBounds(95, 87, 77, 56);
		frmCalculator.getContentPane().add(btnMinus);
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDivide.setBounds(273, 87, 77, 56);
		frmCalculator.getContentPane().add(btnDivide);
		
		
		btn7.setBounds(6, 155, 58, 37);
		frmCalculator.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(76, 155, 58, 37);
		frmCalculator.getContentPane().add(btn8);
		
		btn5.setBounds(76, 204, 58, 35);
		frmCalculator.getContentPane().add(btn5);
		
		btn6.setBounds(146, 204, 58, 35);
		frmCalculator.getContentPane().add(btn6);
		
		btn9.setBounds(146, 155, 58, 37);
		frmCalculator.getContentPane().add(btn9);
		
		frmCalculator.getContentPane().add(btn4);
		
		btn4.setBounds(6, 202, 58, 37);
		btn1.setBounds(6, 251, 58, 37);
		frmCalculator.getContentPane().add(btn1);
		
		btn2.setBounds(76, 251, 58, 37);
		frmCalculator.getContentPane().add(btn2);
		
		btn3.setBounds(146, 251, 58, 37);
		frmCalculator.getContentPane().add(btn3);
		
		btnZero.setBounds(6, 296, 128, 37);
		frmCalculator.getContentPane().add(btnZero);
		
		btnDot.setBounds(144, 300, 58, 33);
		frmCalculator.getContentPane().add(btnDot);
	}
}
