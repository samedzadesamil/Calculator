package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class CalculatorGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txt_input;
	private double answer, number;
	private int operation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI frame = new CalculatorGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void addInput(String str) {

		txt_input.setText(txt_input.getText() + str);
		
	}

	public void calculate() {
		switch (operation) {
		case 1:
			answer = number + Double.parseDouble(txt_input.getText());
			txt_input.setText(Double.toString(answer));
			break;

		case 2:
			answer = number - Double.parseDouble(txt_input.getText());
			txt_input.setText(Double.toString(answer));
			break;
		case 3:
			answer = number * Double.parseDouble(txt_input.getText());
			txt_input.setText(Double.toString(answer));
			break;
		case 4:
			answer = number / Double.parseDouble(txt_input.getText());
			txt_input.setText(Double.toString(answer));
			break;
		}

	}

	public CalculatorGUI() {
		setTitle("Hesablay\u0131c\u0131");
		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel screen = new JPanel();
		screen.setBounds(10, 0, 274, 57);
		contentPane.add(screen);
		screen.setLayout(null);

		txt_input = new JTextField();
		txt_input.setFont(new Font("Tahoma", Font.BOLD, 25));
		txt_input.setHorizontalAlignment(SwingConstants.RIGHT);
		txt_input.setBounds(0, 27, 274, 30);
		screen.add(txt_input);
		txt_input.setColumns(10);
		
		JLabel lbl = new JLabel("");
		lbl.setFont(new Font("Tahoma", Font.BOLD, 17));
		lbl.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl.setBounds(0, 0, 274, 25);
		screen.add(lbl);

		JPanel control = new JPanel();
		control.setBounds(10, 59, 274, 308);
		contentPane.add(control);
		control.setLayout(new GridLayout(4, 4, 10, 10));

		JButton btnNewButton_4 = new JButton("7");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 30));
		control.add(btnNewButton_4);

		JButton btnNewButton_4_1 = new JButton("8");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_4_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		control.add(btnNewButton_4_1);

		JButton btnNewButton_4_1_1 = new JButton("9");
		btnNewButton_4_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		control.add(btnNewButton_4_1_1);

		JButton btnNewButton_4_1_2 = new JButton("+");
		btnNewButton_4_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(txt_input.getText());
				operation=1;
				lbl.setText(number+"+");
				txt_input.setText(null);
			}
		});
		btnNewButton_4_1_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		control.add(btnNewButton_4_1_2);

		JButton btnNewButton_4_2 = new JButton("4");
		btnNewButton_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_4_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		control.add(btnNewButton_4_2);

		JButton btnNewButton_4_1_6 = new JButton("5");
		btnNewButton_4_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_4_1_6.setFont(new Font("Tahoma", Font.BOLD, 30));
		control.add(btnNewButton_4_1_6);

		JButton btnNewButton_4_1_4 = new JButton("6");
		btnNewButton_4_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_4_1_4.setFont(new Font("Tahoma", Font.BOLD, 30));
		control.add(btnNewButton_4_1_4);

		JButton btnNewButton_4_1_7 = new JButton("-");
		btnNewButton_4_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(txt_input.getText());
				operation=2;
				lbl.setText(number+"+");
				txt_input.setText(null);
			}
		});
		btnNewButton_4_1_7.setFont(new Font("Tahoma", Font.BOLD, 30));
		control.add(btnNewButton_4_1_7);

		JButton btnNewButton_4_1_3 = new JButton("1");
		btnNewButton_4_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_4_1_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		control.add(btnNewButton_4_1_3);

		JButton btnNewButton_4_1_5 = new JButton("2");
		btnNewButton_4_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_4_1_5.setFont(new Font("Tahoma", Font.BOLD, 30));
		control.add(btnNewButton_4_1_5);

		JButton btnNewButton_4_1_8 = new JButton("3");
		btnNewButton_4_1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_4_1_8.setFont(new Font("Tahoma", Font.BOLD, 30));
		control.add(btnNewButton_4_1_8);

		JButton btnNewButton_4_1_10 = new JButton("*");
		btnNewButton_4_1_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(txt_input.getText());
				operation=3;
				lbl.setText(number+"+");
				txt_input.setText(null);
			}
		});
		btnNewButton_4_1_10.setFont(new Font("Tahoma", Font.BOLD, 30));
		control.add(btnNewButton_4_1_10);

		JButton btnNewButton_4_1_9 = new JButton("C");
		btnNewButton_4_1_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_input.setText(null);
				lbl.setText(null);
			}
		});
		btnNewButton_4_1_9.setFont(new Font("Tahoma", Font.BOLD, 30));
		control.add(btnNewButton_4_1_9);

		JButton btnNewButton_4_1_11 = new JButton("0");
		btnNewButton_4_1_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_4_1_11.setFont(new Font("Tahoma", Font.BOLD, 30));
		control.add(btnNewButton_4_1_11);

		JButton btnNewButton_4_1_12 = new JButton("=");
		btnNewButton_4_1_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl.setText(lbl.getText()+txt_input.getText());
				calculate();
			}
		});
		btnNewButton_4_1_12.setFont(new Font("Tahoma", Font.BOLD, 30));
		control.add(btnNewButton_4_1_12);

		JButton btnNewButton_4_1_13 = new JButton("/");
		btnNewButton_4_1_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(txt_input.getText());
				operation=4;
				lbl.setText(number+"+");
				txt_input.setText(null);
			}
		});
		btnNewButton_4_1_13.setFont(new Font("Tahoma", Font.BOLD, 30));
		control.add(btnNewButton_4_1_13);
	}
}
