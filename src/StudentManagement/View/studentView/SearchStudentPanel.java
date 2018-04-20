package StudentManagement.View.studentView;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class SearchStudentPanel extends JPanel
{
	
	private JLabel lblRollNumber,lbl,lblE,lbl1,lbl2,lbl3,lbl4,lbl5,lbl6;																									
	public JTextField txtRollNumber;
	
	public JButton btnSearch = new JButton("Search");
	public JButton btnDropOut = new JButton("Drop Out");
	public SearchStudentPanel()
	{
		this.setLayout(new GridLayout(10,2,40,40));
		//this.setSize(700,500);
        this.setBackground(Color.LIGHT_GRAY);
        
       
        lbl = new JLabel("               Edit details of student",SwingConstants.CENTER);	
        lbl.setFont(new Font("Ariel",Font.BOLD,24));
        lbl.setForeground(Color.blue);
        lbl1 = new JLabel("");
        lbl2 = new JLabel("");
        lbl3 = new JLabel("");
        lbl4 = new JLabel("");
        lbl5 = new JLabel("");
        lbl6 = new JLabel("");
        //lbl.setAlignmentX(CENTER_ALIGNMENT);
        lblE = new JLabel("");
        lblRollNumber = new JLabel("	      Roll Number");
        lblRollNumber.setFont(new Font("Ariel",Font.BOLD,15));
        txtRollNumber = new JTextField();
        this.add(lbl);
        this.add(lblE);
		this.add(lblRollNumber);
		this.add(txtRollNumber);
		this.add(btnSearch);
		this.add(btnDropOut);
		this.add(lbl1);
		this.add(lbl2);
		this.add(lbl3);
		this.add(lbl4);
		this.add(lbl5);
		this.add(lbl6);
		
	}
	
}
