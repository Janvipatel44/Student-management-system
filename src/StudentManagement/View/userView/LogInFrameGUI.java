package StudentManagement.View.userView;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import StudentManagement.Controller.userController.LogInActionListener;


public class LogInFrameGUI extends JFrame
{
	public JPanel inputPanel = new JPanel();
	public NewUserPanel newPanel = new NewUserPanel();
	public ForgotPasswordPanel forgotPanel = new ForgotPasswordPanel();
	public NeedHelpPanel helpPanel = new NeedHelpPanel();
	public ChangePasswordPanel changePanel = new ChangePasswordPanel();
	public JOptionPane messagePane = new JOptionPane();
	
	private ImageIcon logo = new ImageIcon("C:/IET3.jpg");
	public JLabel lblIamge = new JLabel(logo);
	private JLabel lblUserID = new JLabel("User ID");
	/*private ImageIcon admin = new ImageIcon("C:/admin5a.png");
	public JLabel lblAdminImage = new JLabel(admin);
	*/public JTextField txtUserID = new JTextField(10);
	private JLabel lblPassword = new JLabel("Password");
	public JPasswordField txtPassword = new JPasswordField(15);
	private JLabel lblEmpty1 = new JLabel("");
	private JLabel lblEmpty2 = new JLabel("");
	
	private JButton btnNew = new JButton("New User");
	private JButton btnHelp = new JButton("Need Help?");
	public JButton btnLogIn = new JButton("Log In");
	private JButton btnReset = new JButton("Reset");
	public JButton btnOK = new JButton("OK");

	public String user="iet",password="12345";
	
	public LogInFrameGUI()
	{
		//Frame
		this.setSize(600, 400);
		this.setLayout(new BorderLayout());
		
		//Panel
		inputPanel.setLayout(new GridLayout(5, 2));
		inputPanel.setBackground(Color.LIGHT_GRAY);
		inputPanel.add(lblUserID);
		inputPanel.add(txtUserID);
		inputPanel.add(lblPassword);
		inputPanel.add(txtPassword);
		inputPanel.add(btnLogIn);
		inputPanel.add(btnReset);
		inputPanel.add(lblEmpty1);
		inputPanel.add(lblEmpty2);
		inputPanel.add(btnNew);
		inputPanel.add(btnHelp);
		
		
		//Listener 
		LogInActionListener listener = new LogInActionListener(this);
		
		//Controllers
		btnNew.addActionListener(listener);
		btnHelp.addActionListener(listener);
		btnReset.addActionListener(listener);
		btnLogIn.addActionListener(listener);
		helpPanel.btnContinue.addActionListener(listener);
		forgotPanel.btnReset.addActionListener(listener);
		changePanel.btnReset.addActionListener(listener);
		newPanel.btnReset.addActionListener(listener);
		forgotPanel.btnSubmit.addActionListener(listener);
		changePanel.btnChange.addActionListener(listener);
		newPanel.btnCreate.addActionListener(listener);
		
		this.add(lblIamge, BorderLayout.NORTH);
		this.add(inputPanel, BorderLayout.SOUTH);
		
	}
	
}
