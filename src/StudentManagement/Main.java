package StudentManagement;

import StudentManagement.View.userView.LogInFrameGUI;

public class Main 
{
	public static void main(String args[])
	{
		//Opening Login Frame
		LogInFrameGUI myFrame = new LogInFrameGUI();
		myFrame.setLocationRelativeTo(null);
		myFrame.setVisible(true);
	}
	
}
