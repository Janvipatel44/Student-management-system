

package StudentManagement.View.studentView;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EducationlDetailsPanel extends JPanel
{

	private JLabel lblEdu,lblE1,lblPer_10,lblPer_12,lblJEE,lblACPC,lblSchool_10,lblSchool_12;
        public JTextField txtPer_10, txtPer_12 ,txtJEE,txtACPC,txtSchool_10,txtSchool_12;
        public JButton  btnNext1;

	public EducationlDetailsPanel()
        {
                this.setLayout(new GridLayout(12,2,8,8));
                this.setBackground(Color.LIGHT_GRAY);
                lblEdu = new JLabel("  Educational Details of Student");
                lblEdu.setFont(new Font("Ariel",Font.BOLD,24));
                lblEdu.setForeground(Color.blue);
                lblE1 = new JLabel();
                lblSchool_10 = new JLabel("  School Name of standarad 10");
                lblSchool_10.setFont(new Font("Ariel",Font.BOLD,18));
                lblSchool_12 = new JLabel("  School Name of standarad 12");
                lblSchool_12.setFont(new Font("Ariel",Font.BOLD,18));
                lblPer_10 = new JLabel("  Percentile of 10th Standarad");
                lblPer_10.setFont(new Font("Ariel",Font.BOLD,18));
                lblPer_12 = new JLabel("  Percentile of 12th Standarad");
                lblPer_12.setFont(new Font("Ariel",Font.BOLD,18));
                lblJEE = new JLabel("  JEE Marks");
                lblJEE.setFont(new Font("Ariel",Font.BOLD,18));
                lblACPC = new JLabel("  ACPC Rank");
                lblACPC.setFont(new Font("Ariel",Font.BOLD,18));
                 
                JLabel l1 =new JLabel();
                JLabel l2 =new JLabel();
                JLabel l3 =new JLabel();
                JLabel l4 =new JLabel();
                JLabel l5 =new JLabel();
                
                 txtPer_10 = new JTextField(5);
                 txtPer_12 = new JTextField(5);
                 txtJEE = new JTextField(3);
                 txtACPC = new JTextField(6);
                 txtSchool_10 = new JTextField(15);
                 txtSchool_12 = new JTextField(15);
                 btnNext1 = new JButton("Next");

                this.add(lblEdu);
                this.add(lblE1);
		this.add(lblSchool_10);
                this.add(txtSchool_10);
                this.add(lblSchool_12);
                this.add(txtSchool_12);
                this.add(lblPer_10);
                this.add(txtPer_10);
                this.add(lblPer_12);
                this.add(txtPer_12);
                this.add(lblJEE);
                this.add(txtJEE);
                this.add(lblACPC);
                this.add(txtACPC);
                this.add(btnNext1);
                this.add(l1);
                this.add(l2);
                this.add(l3);
                this.add(l4);
                this.add(l5);
                

	}
}