import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Login extends JFrame {

	JLabel labe11, label2;
	JTextField namw, pass;
	JButton bt1, bt2;

	Login() {
		setLayout(null);
		labe11 = new JLabel(" Enter Name");
		label2 = new JLabel(" Enter PASS");
		namw = new JTextField(10);
		pass = new JTextField(10);
		bt1 = new JButton("Login");
		bt2 = new JButton("Clear");
		bt1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				if (namw.getText().equals("abc") && pass.getText().equals("abc")) {
					new Home();
					
				} else {

				}
			}

		});

		bt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				namw.setText("");
				pass.setText("");

			}
		});

		labe11.setBounds(50, 50, 100, 30);
		namw.setBounds(150, 50, 100, 30);
		label2.setBounds(50, 100, 100, 30);
		pass.setBounds(150, 100, 100, 30);
		bt1.setBounds(50, 150, 90, 30);
		bt2.setBounds(150, 150, 90, 30);

		add(labe11);
		add(namw);
		add(label2);
		add(pass);
		add(bt1);
		add(bt2);
		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Login();
	}

}
