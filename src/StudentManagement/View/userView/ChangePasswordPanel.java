package StudentManagement.View.userView;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class ChangePasswordPanel extends JPanel 
{
	private JLabel lblUserID = new JLabel("User ID");
	public JTextField txtUserID = new JTextField(20);
	private JLabel lblCurrentPassword = new JLabel("Current Password");
	public JTextField txtCurrentPassword = new JTextField(20);
	private JLabel lblNewPassword = new JLabel("New Password");
	public JTextField txtNewPassword = new JTextField(15);
	private JLabel lblConfirmPassword = new JLabel("Confirm Password");
	public JTextField txtConfirmPassword = new JTextField(15);
	
	JButton btnChange = new JButton("Change");
	JButton btnReset = new JButton("Reset");
	public ChangePasswordPanel()
	{
		this.setLayout(new GridLayout(5, 2));
		this.setBackground(Color.LIGHT_GRAY);
		
		this.add(lblUserID);
		this.add(txtUserID);
		this.add(lblCurrentPassword);
		this.add(txtCurrentPassword);
		this.add(lblNewPassword);
		this.add(txtNewPassword);
		this.add(lblConfirmPassword);
		this.add(txtConfirmPassword);
		this.add(btnChange);
		this.add(btnReset);
	}
}
