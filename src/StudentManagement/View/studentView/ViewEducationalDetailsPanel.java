
package StudentManagement.View.studentView;


import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViewEducationalDetailsPanel extends JPanel
{

	private JLabel lblViewEdu,lblE1,lblPer_10,lblPer_12,lblJEE,lblACPC,lblSchool_10,lblSchool_12,lblViewPer_10,lblViewPer_12,lblViewJEE,lblViewACPC,lblViewSchool_10,lblViewSchool_12;
        public JButton btnSave1,btnReset1;
        private MyGui obj;
       
        public ViewEducationalDetailsPanel(MyGui obj1)
        {
                obj = obj1;


                this.setLayout(new GridLayout(12,2,8,8));
                this.setBackground(Color.LIGHT_GRAY);
                lblViewEdu = new JLabel("  Educational Details of Student");
                lblViewEdu.setFont(new Font("Ariel",Font.BOLD,24));
                lblViewEdu.setForeground(Color.blue);
                lblE1 = new JLabel();
                lblSchool_10 = new JLabel("  School Name");
                lblSchool_10.setFont(new Font("Ariel",Font.BOLD,18));
                lblViewSchool_10 = new JLabel(obj.educationdetailspanel.txtSchool_10.getText());
                lblSchool_12 = new JLabel("  School Name");
                lblSchool_12.setFont(new Font("Ariel",Font.BOLD,18));
                lblViewSchool_12 = new JLabel(obj.educationdetailspanel.txtSchool_12.getText());
                lblPer_10 = new JLabel("  Percentile of 10th Standarad");
                lblPer_10.setFont(new Font("Ariel",Font.BOLD,18));
                lblViewPer_10 = new JLabel((obj.educationdetailspanel.txtPer_10.getText()));
                lblPer_12 = new JLabel("  Percentile of 12th Standarad");
                lblPer_12.setFont(new Font("Ariel",Font.BOLD,18));
                lblViewPer_12 = new JLabel(obj.educationdetailspanel.txtPer_12.getText());
                lblJEE = new JLabel("  JEE Marks");
                lblJEE.setFont(new Font("Ariel",Font.BOLD,18));
                lblViewJEE = new JLabel(obj.educationdetailspanel.txtJEE.getText());
                lblACPC = new JLabel("  ACPC Rank");
                lblACPC.setFont(new Font("Ariel",Font.BOLD,18));
                lblViewACPC = new JLabel(obj.educationdetailspanel.txtACPC.getText());

                JLabel l1 =new JLabel();
                JLabel l2 =new JLabel();
                JLabel l3 =new JLabel();
                JLabel l4 =new JLabel();
                JLabel l5 =new JLabel();

                btnSave1 = new JButton("Save");
                btnReset1 = new JButton("Reset");

                this.add(lblViewEdu);
                this.add(lblE1);
		this.add(lblSchool_10);
                this.add(lblViewSchool_10);
                this.add(lblSchool_12);
                this.add(lblViewSchool_12);
                this.add(lblPer_10);
                this.add(lblViewPer_10);
                this.add(lblPer_12);
                this.add(lblViewPer_12);
                this.add(lblJEE);
                this.add(lblViewJEE);
                this.add(lblACPC);
                this.add(lblViewACPC);
                this.add(btnSave1);
                this.add(btnReset1);
                this.add(l1);
                this.add(l2);
                this.add(l3);
                this.add(l4);
                this.add(l5);

                btnSave1.addActionListener(obj.listener);
                btnReset1.addActionListener(obj.listener);

	}
}