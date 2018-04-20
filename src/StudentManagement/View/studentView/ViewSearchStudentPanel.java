package StudentManagement.View.studentView;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViewSearchStudentPanel extends JPanel
{
    public JLabel lblView,lblFName,lblMName,lblLName,lblGen,lblDOB,lblConNo,lblGConNo,lblLandLine,lblSEID,lblGEID,lblAdd,lblCatagory,lblBranch,lblBatch,lblAdmission;
    public JLabel lblView1,lblViewFName,lblViewMName,lblViewLName,lblViewGen,lblViewDOB,lblViewConNo,lblViewGConNo,lblViewLandLine,lblViewSEID,lblViewGEID,lblViewAdd,lblViewCatagory,lblViewBranch,lblViewBatch,lblViewAdmission;
    public ViewSearchStudentPanel()
    {
    	
    }
    
    public ViewSearchStudentPanel(String fn, String mn, String ln, String gender, String dob, String stuCon, String gurCon, String landLine, String stuEmail, String gurEmail, String address, String category, String branch, String batch,  String admType)
    {
        
        this.setLayout(new GridLayout(18,2,5,5));
        this.setBackground(Color.LIGHT_GRAY);
        lblView = new JLabel("    View Student Personal Details");
        lblView.setFont(new Font("Ariel",Font.BOLD,25));
        lblView.setForeground(Color.blue);
        lblView1 = new JLabel();
        lblFName = new JLabel("         First Name");
        lblFName.setFont(new Font("Ariel",Font.BOLD,15));
        lblViewFName = new JLabel(fn);
        
        lblMName = new JLabel("         Middle Name");
        lblMName.setFont(new Font("Ariel",Font.BOLD,15));
        lblViewMName = new JLabel(mn);
        lblLName = new JLabel("         Last Name");
        lblLName.setFont(new Font("Ariel",Font.BOLD,15));
        lblViewLName = new JLabel(ln);
        lblGen = new JLabel("         Gender");
        lblGen.setFont(new Font("Ariel",Font.BOLD,15));

            lblViewGen = new JLabel(gender);
        lblDOB = new JLabel("         Date of Birth(dd/mm/yyyy)");
        lblDOB.setFont(new Font("Ariel",Font.BOLD,15));
        lblViewDOB = new JLabel(dob);
        lblConNo = new JLabel("         Student Contact Number");
        lblConNo.setFont(new Font("Ariel",Font.BOLD,15));
        lblViewConNo = new JLabel(stuCon);
        lblGConNo = new JLabel("         Guardian Contact Number");
        lblGConNo.setFont(new Font("Ariel",Font.BOLD,15));
        lblViewGConNo = new JLabel(gurCon);
        lblLandLine = new JLabel("         Land Line Number");
        lblLandLine.setFont(new Font("Ariel",Font.BOLD,15));
        lblViewLandLine = new JLabel(landLine);
        lblSEID = new JLabel("         Student Email I'D");
        lblSEID.setFont(new Font("Ariel",Font.BOLD,15));
        lblViewSEID = new JLabel(stuEmail);
        lblGEID = new JLabel("         Guardian Email I'D");
        lblGEID.setFont(new Font("Ariel",Font.BOLD,15));
        lblViewGEID = new JLabel(gurEmail);
        lblAdd = new JLabel("         Address");
        lblAdd.setFont(new Font("Ariel",Font.BOLD,15));
        lblViewAdd = new JLabel(address);
        lblCatagory = new JLabel("         Category");
        lblCatagory.setFont(new Font("Ariel",Font.BOLD,15));
        lblViewCatagory = new JLabel(category);
        lblBranch = new JLabel("         Branch");
        lblBranch.setFont(new Font("Ariel",Font.BOLD,15));
        lblViewBranch = new JLabel(branch);
        lblBatch = new JLabel("         Batch Year");
        lblBatch.setFont(new Font("Ariel",Font.BOLD,15));
        lblViewBatch = new JLabel(batch);
        lblAdmission = new JLabel("         Admission Type");
        lblAdmission.setFont(new Font("Ariel",Font.BOLD,15));
        lblViewAdmission = new JLabel(admType);

    
        this.add(lblView);
        this.add(lblView1);
        this.add(lblFName);
        this.add(lblViewFName);
        this.add(lblMName);
        this.add(lblViewMName);
        this.add(lblLName);
        this.add(lblViewLName);

        this.add(lblGen);
        this.add(lblViewGen);
        this.add(lblDOB);
        this.add(lblViewDOB);
        this.add(lblConNo);
        this.add(lblViewConNo);
        this.add(lblGConNo);
        this.add(lblViewGConNo);
        this.add(lblLandLine);
        this.add(lblViewLandLine);
        this.add(lblSEID);
        this.add(lblViewSEID);
        this.add(lblGEID);
        this.add(lblViewGEID);
        this.add(lblAdd);
        this.add(lblViewAdd);
        this.add(lblCatagory);
        this.add(lblViewCatagory);
        this.add(lblBranch);
        this.add(lblViewBranch);
        this.add(lblBatch);
        this.add(lblViewBatch);
        this.add(lblAdmission);
        this.add(lblViewAdmission);
        
    }
}
