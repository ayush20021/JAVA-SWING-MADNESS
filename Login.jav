import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Home extends JFrame{
	
	JLabel label;
	
	public Home() {
		// TODO Auto-generated constructor stub
		
		setLayout(new FlowLayout());
		
		label = new JLabel("WELCOME");
		add(label);
		setSize(400,400);
		setVisible(true);
	}

}
