
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator {

	private JFrame frame;
	private JTextField textField;
	
	 String calculation = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{108, 108, 108, 108, 0};
		gridBagLayout.rowHeights = new int[]{52, 52, 52, 52, 52, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.anchor = GridBagConstraints.EAST;
		gbc_textField.fill = GridBagConstraints.VERTICAL;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 0;
		frame.getContentPane().add(textField, gbc_textField);
		textField.setColumns(20);
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculation += "1";
				textField.setText(calculation);
			}
		});
		
		
		
		JButton btn_calculate = new JButton("Calculate");
		GridBagConstraints gbc_btn_calculate = new GridBagConstraints();
		gbc_btn_calculate.fill = GridBagConstraints.BOTH;
		gbc_btn_calculate.insets = new Insets(0, 0, 5, 5);
		gbc_btn_calculate.gridx = 2;
		gbc_btn_calculate.gridy = 0;
		frame.getContentPane().add(btn_calculate, gbc_btn_calculate);
		
		JButton btnDelete = new JButton("Backspace");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculation = calculation.substring(0, calculation.length()-1);
				textField.setText(calculation);
			}
		});
		GridBagConstraints gbc_btnDelete = new GridBagConstraints();
		gbc_btnDelete.fill = GridBagConstraints.BOTH;
		gbc_btnDelete.insets = new Insets(0, 0, 5, 0);
		gbc_btnDelete.gridx = 3;
		gbc_btnDelete.gridy = 0;
		frame.getContentPane().add(btnDelete, gbc_btnDelete);
		
		
		GridBagConstraints gbc_btn_1 = new GridBagConstraints();
		gbc_btn_1.fill = GridBagConstraints.BOTH;
		gbc_btn_1.insets = new Insets(0, 0, 5, 5);
		gbc_btn_1.gridx = 0;
		gbc_btn_1.gridy = 1;
		frame.getContentPane().add(btn_1, gbc_btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculation += "2";
				textField.setText(calculation);
			}
		});
		GridBagConstraints gbc_btn_2 = new GridBagConstraints();
		gbc_btn_2.fill = GridBagConstraints.BOTH;
		gbc_btn_2.insets = new Insets(0, 0, 5, 5);
		gbc_btn_2.gridx = 1;
		gbc_btn_2.gridy = 1;
		frame.getContentPane().add(btn_2, gbc_btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculation += "3";
				textField.setText(calculation);
			}
		});
		GridBagConstraints gbc_btn_3 = new GridBagConstraints();
		gbc_btn_3.fill = GridBagConstraints.BOTH;
		gbc_btn_3.insets = new Insets(0, 0, 5, 5);
		gbc_btn_3.gridx = 2;
		gbc_btn_3.gridy = 1;
		frame.getContentPane().add(btn_3, gbc_btn_3);
		
		JButton btnAdd = new JButton("+");
		GridBagConstraints gbc_btnAdd = new GridBagConstraints();
		gbc_btnAdd.fill = GridBagConstraints.BOTH;
		gbc_btnAdd.insets = new Insets(0, 0, 5, 0);
		gbc_btnAdd.gridx = 3;
		gbc_btnAdd.gridy = 1;
		frame.getContentPane().add(btnAdd, gbc_btnAdd);
		
		JButton btn_4 = new JButton("4");
		GridBagConstraints gbc_btn_4 = new GridBagConstraints();
		gbc_btn_4.fill = GridBagConstraints.BOTH;
		gbc_btn_4.insets = new Insets(0, 0, 5, 5);
		gbc_btn_4.gridx = 0;
		gbc_btn_4.gridy = 2;
		frame.getContentPane().add(btn_4, gbc_btn_4);
		
		JButton btn_5 = new JButton("5");
		GridBagConstraints gbc_btn_5 = new GridBagConstraints();
		gbc_btn_5.fill = GridBagConstraints.BOTH;
		gbc_btn_5.insets = new Insets(0, 0, 5, 5);
		gbc_btn_5.gridx = 1;
		gbc_btn_5.gridy = 2;
		frame.getContentPane().add(btn_5, gbc_btn_5);
		
		JButton btn_6 = new JButton("6");
		GridBagConstraints gbc_btn_6 = new GridBagConstraints();
		gbc_btn_6.fill = GridBagConstraints.BOTH;
		gbc_btn_6.insets = new Insets(0, 0, 5, 5);
		gbc_btn_6.gridx = 2;
		gbc_btn_6.gridy = 2;
		frame.getContentPane().add(btn_6, gbc_btn_6);
		
		JButton btnSubtract = new JButton("_");
		GridBagConstraints gbc_btnSubtract = new GridBagConstraints();
		gbc_btnSubtract.fill = GridBagConstraints.BOTH;
		gbc_btnSubtract.insets = new Insets(0, 0, 5, 0);
		gbc_btnSubtract.gridx = 3;
		gbc_btnSubtract.gridy = 2;
		frame.getContentPane().add(btnSubtract, gbc_btnSubtract);
		
		JButton btn_7 = new JButton("7");
		GridBagConstraints gbc_btn_7 = new GridBagConstraints();
		gbc_btn_7.fill = GridBagConstraints.BOTH;
		gbc_btn_7.insets = new Insets(0, 0, 5, 5);
		gbc_btn_7.gridx = 0;
		gbc_btn_7.gridy = 3;
		frame.getContentPane().add(btn_7, gbc_btn_7);
		
		JButton btn_8 = new JButton("8");
		GridBagConstraints gbc_btn_8 = new GridBagConstraints();
		gbc_btn_8.fill = GridBagConstraints.BOTH;
		gbc_btn_8.insets = new Insets(0, 0, 5, 5);
		gbc_btn_8.gridx = 1;
		gbc_btn_8.gridy = 3;
		frame.getContentPane().add(btn_8, gbc_btn_8);
		
		JButton btn_9 = new JButton("9");
		GridBagConstraints gbc_btn_9 = new GridBagConstraints();
		gbc_btn_9.fill = GridBagConstraints.BOTH;
		gbc_btn_9.insets = new Insets(0, 0, 5, 5);
		gbc_btn_9.gridx = 2;
		gbc_btn_9.gridy = 3;
		frame.getContentPane().add(btn_9, gbc_btn_9);
		
		JButton btnMultiply = new JButton("X");
		GridBagConstraints gbc_btnMultiply = new GridBagConstraints();
		gbc_btnMultiply.fill = GridBagConstraints.BOTH;
		gbc_btnMultiply.insets = new Insets(0, 0, 5, 0);
		gbc_btnMultiply.gridx = 3;
		gbc_btnMultiply.gridy = 3;
		frame.getContentPane().add(btnMultiply, gbc_btnMultiply);

		
		JButton btn_0 = new JButton("0");
		GridBagConstraints gbc_btn_0 = new GridBagConstraints();
		gbc_btn_0.insets = new Insets(0, 0, 0, 5);
		gbc_btn_0.fill = GridBagConstraints.BOTH;
		gbc_btn_0.gridx = 0;
		gbc_btn_0.gridy = 4;
		frame.getContentPane().add(btn_0, gbc_btn_0);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		GridBagConstraints gbc_btnClear = new GridBagConstraints();
		gbc_btnClear.fill = GridBagConstraints.BOTH;
		gbc_btnClear.insets = new Insets(0, 0, 0, 5);
		gbc_btnClear.gridx = 2;
		gbc_btnClear.gridy = 4;
		frame.getContentPane().add(btnClear, gbc_btnClear);
		
		JButton btnDivide = new JButton("/");
		GridBagConstraints gbc_btnDivide = new GridBagConstraints();
		gbc_btnDivide.fill = GridBagConstraints.BOTH;
		gbc_btnDivide.gridx = 3;
		gbc_btnDivide.gridy = 4;
		frame.getContentPane().add(btnDivide, gbc_btnDivide);
		
		
	}
}
