package StudentManagement.View.studentView;
import java.awt.Color;
import java.awt.Font;
import java.awt.Container.*;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViewDetailsPanel extends JPanel
{
    private JLabel lblView,lblFName,lblMName,lblLName,lblGen,lblDOB,lblConNo,lblGConNo,lblLandLine,lblSEID,lblGEID,lblAdd,lblCatagory,lblBranch,lblBatch,lblAdmission;
    private JLabel lblView1,lblViewFName,lblViewMName,lblViewLName,lblViewGen,lblViewDOB,lblViewConNo,lblViewGConNo,lblViewLandLine,lblViewSEID,lblViewGEID,lblViewAdd,lblViewCatagory,lblViewBranch,lblViewBatch,lblViewAdmission;
    public JButton btnSubmit,btnReset;
    private MyGui obj;
   
    public ViewDetailsPanel(MyGui obj1)
    {
        obj = obj1;

        this.setLayout(new GridLayout(17,2,8,8));
        this.setBackground(Color.LIGHT_GRAY);
        lblView = new JLabel("    View Student Personal Details");
        lblView.setFont(new Font("Ariel",Font.BOLD,24));
        lblView.setForeground(Color.blue);
        lblView1 = new JLabel();
        lblFName = new JLabel("         First Name");
        lblFName.setFont(new Font("Ariel",Font.BOLD,15));
        lblViewFName = new JLabel(obj.detailsPanel.txtFName.getText());
        
        lblMName = new JLabel("         Middle Name");
        lblMName.setFont(new Font("Ariel",Font.BOLD,15));
        lblViewMName = new JLabel(obj.detailsPanel.txtMName.getText());
        lblLName = new JLabel("         Last Name");
        lblLName.setFont(new Font("Ariel",Font.BOLD,15));
        lblViewLName = new JLabel(obj.detailsPanel.txtFName.getText());
        lblGen = new JLabel("         Gender");
        lblGen.setFont(new Font("Ariel",Font.BOLD,15));

        if(obj.detailsPanel.male.isSelected())
        {
            lblViewGen = new JLabel(obj.detailsPanel.male.getLabel());
        }
        else if(obj.detailsPanel.female.isSelected())
        {
             lblViewGen = new JLabel(obj.detailsPanel.female.getLabel());
        }
        lblDOB = new JLabel("         Date of Birth(dd/mm/yyyy)");
        lblDOB.setFont(new Font("Ariel",Font.BOLD,15));
        lblViewDOB = new JLabel((String) obj.detailsPanel.comboDate.getSelectedItem() + "/" + (String) obj.detailsPanel.comboMonth.getSelectedItem() + "/" + (String) obj.detailsPanel.comboYear.getSelectedItem());
        lblConNo = new JLabel("         Student Contact Number");
        lblConNo.setFont(new Font("Ariel",Font.BOLD,15));
        lblViewConNo = new JLabel(obj.detailsPanel.txtCoNo.getText());
        lblGConNo = new JLabel("         Guardian Contact Number");
        lblGConNo.setFont(new Font("Ariel",Font.BOLD,15));
        lblViewGConNo = new JLabel(obj.detailsPanel.txtGConNo.getText());
        lblLandLine = new JLabel("         Land Line Number");
        lblLandLine.setFont(new Font("Ariel",Font.BOLD,15));
        lblViewLandLine = new JLabel(obj.detailsPanel.txtLandLine.getText());
        lblSEID = new JLabel("         Student Email I'D");
        lblSEID.setFont(new Font("Ariel",Font.BOLD,15));
        lblViewSEID = new JLabel(obj.detailsPanel.txtSEID.getText());
        lblGEID = new JLabel("         Guardian Email I'D");
        lblGEID.setFont(new Font("Ariel",Font.BOLD,15));
        lblViewGEID = new JLabel(obj.detailsPanel.txtGEID.getText());
        lblAdd = new JLabel("         Address");
        lblAdd.setFont(new Font("Ariel",Font.BOLD,15));
        lblViewAdd = new JLabel(obj.detailsPanel.txtAddress.getText());
        lblCatagory = new JLabel("         Category");
        lblCatagory.setFont(new Font("Ariel",Font.BOLD,15));
        lblViewCatagory = new JLabel((String) obj.detailsPanel.combo1.getSelectedItem());
        lblBranch = new JLabel("         Branch");
        lblBranch.setFont(new Font("Ariel",Font.BOLD,15));
        lblViewBranch = new JLabel((String) obj.detailsPanel.combo2.getSelectedItem());
        lblBatch = new JLabel("         Batch Year");
        lblBatch.setFont(new Font("Ariel",Font.BOLD,15));
        lblViewBatch = new JLabel((String) obj.detailsPanel.combo3.getSelectedItem());
        lblAdmission = new JLabel("         Admission Type");
        lblAdmission.setFont(new Font("Ariel",Font.BOLD,15));
        lblViewAdmission = new JLabel((String) obj.detailsPanel.combo4.getSelectedItem());

        btnSubmit = new JButton("Submit");
        btnReset = new JButton("Reset");


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
        this.add(btnSubmit);
        this.add(btnReset);
        btnSubmit.addActionListener(obj.listener);
        btnReset.addActionListener(obj.listener);
        
    }
    
    
}
