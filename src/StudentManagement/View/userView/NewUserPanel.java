package StudentManagement.View.userView;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class NewUserPanel extends JPanel
{
	private JLabel lblName = new JLabel("Name");
	public JTextField txtName = new JTextField(20);
	private JLabel lblUserID = new JLabel("User ID");
	public JTextField txtUserID = new JTextField(20);
	private JLabel lblPassword = new JLabel("Password");
	public JTextField txtPassword = new JTextField(15);
	private JLabel lblConfirmPassword = new JLabel("Confirm Password");
	public JTextField txtConfirmPassword = new JTextField(15);
	private JLabel lblEmail = new JLabel("Other Email ID");
	public JTextField txtEmail = new JTextField(20);
	private JLabel lblContact = new JLabel("Contact No");
	public JTextField txtContact = new JTextField(13);
	
	JButton btnCreate = new JButton("Create");
	JButton btnReset = new JButton("Reset");
	
	public NewUserPanel()
	{
		this.setLayout(new GridLayout(7, 2));
		this.setBackground(Color.LIGHT_GRAY);
		
		txtEmail.setToolTipText("You have to provide it when you need help releated your account settings!");
	
		this.add(lblName);
		this.add(txtName);
		this.add(lblUserID);
		this.add(txtUserID);
		this.add(lblPassword);
		this.add(txtPassword);
		this.add(lblConfirmPassword);
		this.add(txtConfirmPassword);
		this.add(lblContact);
		this.add(txtContact);
		this.add(lblEmail);
		this.add(txtEmail);
		this.add(btnCreate);
		this.add(btnReset);
	}
		
}
