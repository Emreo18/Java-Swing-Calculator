package cz.spsejecna.Heller.C2a;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Calculator implements ActionListener {
	JFrame f = new JFrame();
	JTextField text = new JTextField();
	// založení všech buttons na kalkulaèce
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	JButton button7 = new JButton();
	JButton button8 = new JButton();
	JButton button9 = new JButton();
	JButton button0 = new JButton();
	JButton slash = new JButton();
	JButton times = new JButton();
	JButton minus = new JButton();
	JButton plus = new JButton();
	JButton dot = new JButton();
	JButton equals = new JButton();
	JButton del = new JButton();
	JButton clear = new JButton();

	double a = 0, b = 0, result = 0;
	int operator = 0;

	Calculator() {
		JFrame f = new JFrame("Kalkulaèka");
		text = new JTextField();
		// menubar
		JMenuBar menubar = new JMenuBar();
		f.setJMenuBar(menubar);
		JMenu Helpmenu;
		JMenuItem exit;

		exit = new JMenuItem("exit program");
		Helpmenu = new JMenu("Exit");
		menubar.add(Helpmenu);

		Helpmenu.add(exit);

		class exitaction implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		}
		exit.addActionListener(new exitaction());

		// založení buttons
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		button0 = new JButton("0");
		slash = new JButton("/");
		times = new JButton("*");
		minus = new JButton("-");
		plus = new JButton("+");
		dot = new JButton(".");
		equals = new JButton("=");
		del = new JButton("Delete");
		clear = new JButton("Clear");
//umístìní
		text.setBounds(40, 40, 262, 50);
		button7.setBounds(40, 100, 50, 40);
		button8.setBounds(110, 100, 50, 40);
		button9.setBounds(180, 100, 50, 40);
		slash.setBounds(250, 100, 50, 40);

		button4.setBounds(40, 170, 50, 40);
		button5.setBounds(110, 170, 50, 40);
		button6.setBounds(180, 170, 50, 40);
		times.setBounds(250, 170, 50, 40);

		button1.setBounds(40, 240, 50, 40);
		button2.setBounds(110, 240, 50, 40);
		button3.setBounds(180, 240, 50, 40);
		minus.setBounds(250, 240, 50, 40);

		dot.setBounds(40, 310, 50, 40);
		button0.setBounds(110, 310, 50, 40);
		equals.setBounds(180, 310, 50, 40);
		plus.setBounds(250, 310, 50, 40);

		del.setBounds(60, 380, 100, 40);
		clear.setBounds(180, 380, 100, 40);

		button1.setBackground(Color.yellow);
		button2.setBackground(Color.yellow);
		button3.setBackground(Color.yellow);
		button4.setBackground(Color.yellow);
		button5.setBackground(Color.yellow);
		button6.setBackground(Color.yellow);
		button7.setBackground(Color.yellow);
		button8.setBackground(Color.yellow);
		button9.setBackground(Color.yellow);
		button0.setBackground(Color.yellow);

		slash.setBackground(Color.CYAN);
		times.setBackground(Color.CYAN);
		plus.setBackground(Color.CYAN);
		minus.setBackground(Color.CYAN);

		del.setBackground(Color.red);
		clear.setBackground(Color.red);

		button1.setToolTipText("number 1");
		button2.setToolTipText("number 2");
		button3.setToolTipText("number 3");
		button4.setToolTipText("number 4");
		button5.setToolTipText("number 5");
		button6.setToolTipText("number 6");
		button7.setToolTipText("number 7");
		button8.setToolTipText("number 8");
		button9.setToolTipText("number 9");
		button0.setToolTipText("number 0");
		plus.setToolTipText("the first number is added to the second number");
		times.setToolTipText("the number is multiplied by the second number");
		slash.setToolTipText("the two numbers are divided by each other");
		minus.setToolTipText("this will subtract two numbers from each other");
		del.setToolTipText("this will delete last number");
		clear.setToolTipText("this will reset the whole example");
		dot.setToolTipText("this is decimal point");
		equals.setToolTipText("this will show you the result");
		text.setToolTipText("put the number and choose mathematic operation");

		JTextField t1;
		t1 = new JTextField("Welcome in my calculator");
		t1.setBounds(70, 10, 200, 25);
		f.add(t1);
		
//pøidání buttons do framu
		f.add(text);
		f.add(button7);
		f.add(button8);
		f.add(button9);
		f.add(slash);
		f.add(button4);
		f.add(button5);
		f.add(button6);
		f.add(times);
		f.add(button1);
		f.add(button2);
		f.add(button3);
		f.add(minus);
		f.add(dot);
		f.add(button0);
		f.add(equals);
		f.add(plus);
		f.add(del);
		f.add(clear);
//nastavení framu
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(350, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(true);
		f.getContentPane().setBackground(Color.GRAY);
//pøidání buttons do actionlisteneru
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button0.addActionListener(this);
		plus.addActionListener(this);
		slash.addActionListener(this);
		times.addActionListener(this);
		minus.addActionListener(this);
		dot.addActionListener(this);
		equals.addActionListener(this);
		del.addActionListener(this);
		clear.addActionListener(this);
	}

//akce když kliknu na button
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1)
			text.setText(text.getText().concat("1"));

		if (e.getSource() == button2)
			text.setText(text.getText().concat("2"));

		if (e.getSource() == button3)
			text.setText(text.getText().concat("3"));

		if (e.getSource() == button4)
			text.setText(text.getText().concat("4"));

		if (e.getSource() == button5)
			text.setText(text.getText().concat("5"));

		if (e.getSource() == button6)
			text.setText(text.getText().concat("6"));

		if (e.getSource() == button7)
			text.setText(text.getText().concat("7"));

		if (e.getSource() == button8)
			text.setText(text.getText().concat("8"));

		if (e.getSource() == button9)
			text.setText(text.getText().concat("9"));

		if (e.getSource() == button0)
			text.setText(text.getText().concat("0"));

		if (e.getSource() == dot)
			text.setText(text.getText().concat("."));

		if (e.getSource() == plus) {
			a = Double.parseDouble(text.getText());
			operator = 1;
			text.setText("");
		}

		if (e.getSource() == minus) {
			a = Double.parseDouble(text.getText());
			operator = 2;
			text.setText("");
		}

		if (e.getSource() == times) {
			a = Double.parseDouble(text.getText());
			operator = 3;
			text.setText("");
		}

		if (e.getSource() == slash) {
			a = Double.parseDouble(text.getText());
			operator = 4;
			text.setText("");
		}

		if (e.getSource() == equals) {
			b = Double.parseDouble(text.getText());
//matematické operace
			switch (operator) {
			case 1:
				result = a + b;
				break;

			case 2:
				result = a - b;
				break;

			case 3:
				result = a * b;
				break;

			case 4:
				result = a / b;
				break;

			default:
				result = 0;
			}

			text.setText("" + result);
		}

		if (e.getSource() == clear)
			text.setText("");

		if (e.getSource() == del) {
			String s = text.getText();
			text.setText("");
			for (int i = 0; i < s.length() - 1; i++)
				text.setText(text.getText() + s.charAt(i));
		}
	}
}
