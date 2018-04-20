package StudentManagement.View.userView;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class NeedHelpPanel extends JPanel
{
	private JLabel lblTrouble = new JLabel("Having trouble signing in?");
	private ButtonGroup grpHelp =new ButtonGroup();
	public JRadioButton forgotButton = new JRadioButton("I don't know my password", true);
	public JRadioButton changeButton = new JRadioButton("I want to change my password", false);
	JButton btnContinue = new JButton("Continue");
	
	public NeedHelpPanel()
	{
		this.setLayout(new GridLayout(4, 0));
		this.setBackground(Color.LIGHT_GRAY);
		
		grpHelp.add(forgotButton);
		grpHelp.add(changeButton);
		
		this.add(lblTrouble);
		this.add(forgotButton);
		this.add(changeButton);
		this.add(btnContinue);
	}
	
}
