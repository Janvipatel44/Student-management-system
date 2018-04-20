package StudentManagement.View.studentView;


import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ClassDetailsTable extends JFrame{
	
	
	String[]  header = {"Roll Number", "First Name", "Middle Name", "Last Name", "Gender", "Birth Date", "Student Contact", "Guardian Contact", "Land Line", "Student Email", "Guardian Email", "Address", "Category", "Branch", "Batch", "Admission Type"};
    String[][] data = {{"Roll Number", "First Name", "Middle Name", "Last Name", "Gender", "Birth Date", "Student Contact", "Guardian Contact", "Land Line", "Student Email", "Guardian Email", "Address", "Category", "Branch", "Batch", "Admission Type"}};
    
    public DefaultTableModel model = new DefaultTableModel(data,header);
    public JTable table = new JTable(model);
    
    
	public ClassDetailsTable()
	{
		this.setSize(1500, 1000);
		this.setLayout(new BorderLayout());
		
	}
	

}