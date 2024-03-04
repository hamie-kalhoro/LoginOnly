import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class GUI implements ActionListener {
	
	static private JFrame frame;
	static private JLabel label1, label2, success;
	static private JTextField usertxt;
	static private JPasswordField passtxt;
	static private JButton log;
    
    public static void main(String[] args) {
    	
    	frame = new JFrame("Login Form");
    	JPanel panel = new JPanel();

        frame.setSize(330, 220);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        //frame.setBackground(Color.darkGray);
        panel.setBackground(Color.white);
        frame.add(panel);
        panel.setLayout(null);
        
        label1 = new JLabel("Username");
        label1.setBounds(20,20,75,25);
        label1.setForeground(Color.black);
        // label1.setForeground(Color.black);
        panel.add(label1);
        
        usertxt = new JTextField();
        usertxt.setBounds(100,23,170,20);
        usertxt.setBackground(Color.gray.white);
        usertxt.setForeground(Color.black);
        panel.add(usertxt);
        
        label2 = new JLabel("Password");
        label2.setBounds(20,60,75,25);
        label2.setForeground(Color.black);
        panel.add(label2);
        
        passtxt = new JPasswordField();
        passtxt.setBounds(100,63,170,20);
        passtxt.setBackground(Color.gray.white);
        passtxt.setForeground(Color.black);
        panel.add(passtxt);
        
        log = new JButton("Login");
        log.setBounds(20,100,70,20);
        log.addActionListener((ActionListener) new GUI());
        log.setBackground(Color.black);
        log.setForeground(Color.gray.white);
        panel.add(log);
        
        success = new JLabel("");
        success.setBounds(100,125,180,25);
        success.setForeground(Color.black);
        panel.add(success);
        
        frame.setVisible(true);

    }

	@Override
	public void actionPerformed(ActionEvent e) {
		
		/*
		 * frame1 = new JFrame("Result"); frame1.setSize(300,150);
		 * frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 * frame1.setLayout(null); frame1.setVisible(true);
		 */
		
		String username = usertxt.getText();
		String password = passtxt.getText();
		
		if(username.equals("hamidali") && password.equals("kalhoro")) {
			success.setText("Login successful!");
		} else {
			success.setText("Something failed!");
		}
	}

}
