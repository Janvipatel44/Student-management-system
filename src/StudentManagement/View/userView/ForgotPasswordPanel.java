package StudentManagement.View.userView;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class ForgotPasswordPanel extends JPanel 
{
	private JLabel lblUserID = new JLabel("User ID");
	public JTextField txtUserID = new JTextField(20);
	private JLabel lblEmail = new JLabel("Email ID");
	public JTextField txtEmail = new JTextField(20);
	private JLabel lblNewPassword = new JLabel("New Password");
	public JTextField txtNewPassword = new JTextField(15);
	private JLabel lblConfirmPassword = new JLabel("Confirm Password");
	public JTextField txtConfirmPassword = new JTextField(15);
	
	
	JButton btnSubmit = new JButton("Submit");
	JButton btnReset = new JButton("Reset");
	
	public ForgotPasswordPanel()
	{
		this.setLayout(new GridLayout(5, 2));
		this.setBackground(Color.LIGHT_GRAY);
	
		txtEmail.setToolTipText("Another Email address that provide while creating account!");
		
		this.add(lblUserID);
		this.add(txtUserID);
		this.add(lblEmail);
		this.add(txtEmail);
		this.add(lblNewPassword);
		this.add(txtNewPassword);
		this.add(lblConfirmPassword);
		this.add(txtConfirmPassword);
		this.add(btnSubmit);
		this.add(btnReset);
	}
	
}
