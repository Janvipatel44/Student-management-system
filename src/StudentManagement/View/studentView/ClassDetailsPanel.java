package StudentManagement.View.studentView;



import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class ClassDetailsPanel extends JPanel 
{
	
	public JLabel lblBatchYear,lblBranch,lbl,lbl1,lblE1,lblE2,lblE3,lblE4;
	public JComboBox combobox1,combobox2;
	public DefaultComboBoxModel branchType,batchYear;
	public JButton btnView;
	 
    
    public ClassDetailsPanel()
    { 
    	this.setLayout(new GridLayout(8,2,50,50));
    	this.setBackground(Color.LIGHT_GRAY);
    	lbl = new JLabel("                    View class record");
    	lbl.setFont(new Font("Ariel",Font.BOLD,24));
        lbl.setForeground(Color.blue);
    	lbl1 = new JLabel();
    	lblE1 = new JLabel();
    	lblE2 = new JLabel();
    	lblE3 = new JLabel();
    	lblE4 = new JLabel();
    	lblBatchYear = new JLabel("Batch Year");
    	lblBatchYear.setFont(new Font("Ariel",Font.BOLD,18));
   	 	lblBranch = new JLabel("Branch");
   	 	lblBranch.setFont(new Font("Ariel",Font.BOLD,18));
   	
   	 	branchType = new DefaultComboBoxModel();

	   	branchType.addElement("--none--");
	   	branchType.addElement("ICT");
	   	branchType.addElement("Chemical");
	   	branchType.addElement("Mechanical");
	   	branchType.addElement("M.Tech");
	   	branchType.addElement("PhD");

       combobox2 = new JComboBox(branchType);
       combobox2.setSelectedIndex(0);

       batchYear = new DefaultComboBoxModel();

       batchYear.addElement("--none--");
       batchYear.addElement("2013");
       batchYear.addElement("2014");
       batchYear.addElement("2015");
       batchYear.addElement("2016");
       batchYear.addElement("2017");
       batchYear.addElement("2018");
       batchYear.addElement("2019");
       batchYear.addElement("2020");

       combobox1 = new JComboBox(batchYear);
       combobox1.setSelectedIndex(0);
       
       btnView = new JButton("View");
       
       this.add(lbl);
       this.add(lbl1);
       this.add(lblBranch);
       this.add(combobox2);
       this.add(lblBatchYear);
       this.add(combobox1);
       this.add(btnView);
       this.add(lblE1);
       this.add(lblE2);
       this.add(lblE3);
       this.add(lblE4);
       
       
       
   }
}
