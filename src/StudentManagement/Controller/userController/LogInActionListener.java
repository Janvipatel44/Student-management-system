
package StudentManagement.Controller.userController;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import StudentManagement.Common.MyException;
import StudentManagement.Model.userModel.User;
import StudentManagement.Model.userModel.UserList;
import StudentManagement.View.studentView.MyGui;
import StudentManagement.View.userView.LogInFrameGUI;

public class LogInActionListener implements ActionListener
{
	private LogInFrameGUI myGUI;
	private MyGui prjFrame = new MyGui();
	private User myUser = new User();
	private UserList user = new UserList();
	
	public LogInActionListener(LogInFrameGUI frame)
	{
		myGUI = frame;
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		try
		{
			if(e.getActionCommand() == "New User")
			{
				myGUI.inputPanel.setVisible(false);
				myGUI.add(myGUI.newPanel, BorderLayout.PAGE_END);
				myGUI.newPanel.setVisible(true);
			}
			else if(e.getActionCommand() == "Create")
			{
				if(myGUI.newPanel.txtPassword.getText().equals(myGUI.newPanel.txtConfirmPassword.getText()))
				{	
					if((myGUI.newPanel.txtContact.getText()).length() != 10)
					{
						throw new MyException("Contatct number must be of 10 digits");
					}
					else
					{
						myUser.setName(myGUI.newPanel.txtName.getText());
						myUser.setPassword(myGUI.newPanel.txtPassword.getText());
						myUser.setContact(myGUI.newPanel.txtContact.getText());
						myUser.setEmail(myGUI.newPanel.txtEmail.getText());
						myUser.setUser(myGUI.newPanel.txtUserID.getText());
					
						user.addUser(myUser);
						
						myGUI.newPanel.setVisible(false);
						myGUI.messagePane.showMessageDialog(myGUI.btnOK, "User Created SuccessFully!");
						myGUI.add(myGUI.messagePane, BorderLayout.PAGE_END);
						myGUI.messagePane.setVisible(false);
						myGUI.inputPanel.setVisible(true);
					}
				}
				else
				{
					myGUI.messagePane.showMessageDialog(myGUI.btnOK, "Passwords don't match!");
				}
				
			}
			else if(e.getActionCommand() == "Need Help?")
			{
				myGUI.inputPanel.setVisible(false);
				myGUI.forgotPanel.setVisible(false);
				myGUI.newPanel.setVisible(false);
				myGUI.changePanel.setVisible(false);
				myGUI.add(myGUI.helpPanel, BorderLayout.PAGE_END);
				myGUI.helpPanel.setVisible(true);
			}
			else if(e.getActionCommand() == "Continue")
			{
				myGUI.helpPanel.setVisible(false);
				
				if(myGUI.helpPanel.forgotButton.isSelected())
				{
					myGUI.add(myGUI.forgotPanel, BorderLayout.PAGE_END);
					myGUI.forgotPanel.setVisible(true);
				}
				else if(myGUI.helpPanel.changeButton.isSelected())
				{
					myGUI.add(myGUI.changePanel, BorderLayout.PAGE_END);
					myGUI.changePanel.setVisible(true);
				}
			}
			else if(e.getActionCommand() == "Submit")
			{
				if((myGUI.forgotPanel.txtConfirmPassword.getText()).equals("") || (myGUI.forgotPanel.txtEmail.getText()).equals("") || (myGUI.forgotPanel.txtNewPassword.getText()).equals("") || (myGUI.forgotPanel.txtUserID.getText()).equals("") )
				{
					throw new MyException("Null Values Not Allowed!");
				}
				else
				{
					if(user.forgotPassword(myGUI.forgotPanel.txtUserID.getText(), myGUI.forgotPanel.txtEmail.getText()))
					{
						if(myGUI.forgotPanel.txtNewPassword.getText().equals(myGUI.forgotPanel.txtConfirmPassword.getText()))
						{
							user.updatePassword(myGUI.forgotPanel.txtUserID.getText(), myGUI.forgotPanel.txtNewPassword.getText());
							myGUI.forgotPanel.setVisible(false);
							myGUI.helpPanel.setVisible(false);
							myGUI.messagePane.showMessageDialog(null, "Password Set Successfully!");
							myGUI.add(myGUI.messagePane, BorderLayout.PAGE_END);
							myGUI.messagePane.setVisible(false);
							myGUI.inputPanel.setVisible(true);
						
						}
						else
						{
							myGUI.messagePane.showMessageDialog(null, "Passwords don't match!");
						}
					}
					else
					{
						myGUI.messagePane.showMessageDialog(null, "Wrong User ID or Email!");
					}
				}	
			}
			else if(e.getActionCommand() == "Change")
			{
				if((myGUI.changePanel.txtConfirmPassword.getText()).equals("") || (myGUI.changePanel.txtCurrentPassword.getText()).equals("") || (myGUI.changePanel.txtNewPassword.getText()).equals("") || (myGUI.changePanel.txtUserID.getText()).equals("") )
				{
					throw new MyException("Null Values Not Allowed!");
				}
				else
				{
					if(user.changePassword(myGUI.changePanel.txtUserID.getText(), myGUI.changePanel.txtCurrentPassword.getText()))
					{
						if(myGUI.changePanel.txtNewPassword.getText().equals(myGUI.changePanel.txtConfirmPassword.getText()))
						{
							user.updatePassword(myGUI.changePanel.txtUserID.getText(), myGUI.changePanel.txtNewPassword.getText());
							myGUI.changePanel.setVisible(false);
							myGUI.helpPanel.setVisible(false);
							myGUI.messagePane.showMessageDialog(myGUI.btnOK, "Password Change Successfully!");
							myGUI.add(myGUI.messagePane, BorderLayout.PAGE_END);
							myGUI.messagePane.setVisible(false);
							myGUI.inputPanel.setVisible(true);
						}
						else
						{
							myGUI.messagePane.showMessageDialog(null, "Passwords don't match!");
						}
					}
					else
					{
						myGUI.messagePane.showMessageDialog(null, "Wrong User ID or Password!");
					}
				}
			}
			else if(e.getActionCommand() == "Log In")
			{	
				if((myGUI.txtUserID.getText().equals("")|| (myGUI.txtPassword.getText()).equals("")))
				{
					throw new MyException("Null Values Not Allowed!");
				}
				
				if(user.searchUser(myGUI.txtUserID.getText(), myGUI.txtPassword.getText()))
				{
					myGUI.setVisible(false);
					prjFrame.setVisible(true);
				}
				else
				{
					myGUI.messagePane.showMessageDialog(null, "Invalid User ID or Password!");
				}
			}
		}
		catch(MyException err)
		{
			myGUI.messagePane.showMessageDialog(null, err.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			
		} catch (SQLException a) {
			a.printStackTrace();
		} catch (ClassNotFoundException b) {
			b.printStackTrace();
		} catch (Exception c) {
			c.printStackTrace();
		}
		finally
		{
			myGUI.txtPassword.setText("");
			myGUI.txtUserID.setText("");
			myGUI.forgotPanel.txtConfirmPassword.setText("");
			myGUI.forgotPanel.txtEmail.setText("");
			myGUI.forgotPanel.txtNewPassword.setText("");
			myGUI.forgotPanel.txtUserID.setText("");
			myGUI.newPanel.txtConfirmPassword.setText("");
			myGUI.newPanel.txtContact.setText("");
			myGUI.newPanel.txtEmail.setText("");
			myGUI.newPanel.txtName.setText("");
			myGUI.newPanel.txtPassword.setText("");
			myGUI.newPanel.txtUserID.setText("");
			myGUI.changePanel.txtConfirmPassword.setText("");
			myGUI.changePanel.txtCurrentPassword.setText("");
			myGUI.changePanel.txtNewPassword.setText("");
			myGUI.changePanel.txtUserID.setText("");
		}
		
	}
}