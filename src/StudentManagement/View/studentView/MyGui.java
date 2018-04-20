

package StudentManagement.View.studentView;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import StudentManagement.Controller.studentController.MyActionListener;


public class MyGui extends JFrame
{
    
    public DetailsPanel detailsPanel = new DetailsPanel();
    public EducationlDetailsPanel educationdetailspanel = new EducationlDetailsPanel();
    public SearchStudentPanel searchstudentpanel = new SearchStudentPanel();
    public ClassDetailsPanel classdetailspanel = new ClassDetailsPanel();
  
    
    MyActionListener listener ;
    
    public JPanel panel1;
    public JButton btnAddRe,btnSearchRe,btnViewReS,btnSecurity,btnLogOut,btnAboutUs;
    private JLabel lblPic1,lblPic2;

    public MyGui()
    {
        listener = new MyActionListener(this);
       
        this.setSize(1000,725);
        this.setLayout(new BorderLayout(400,400));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel1 = new JPanel();
        panel1.setSize(200,725);
        panel1.setBackground(Color.PINK);

        btnAddRe = new JButton("New Record");
        btnSearchRe = new JButton("Search Record");
        /*try
        //{
        Image img= null;
        img = ImageIO.read(getClass().getResource("th05GOCEDS.jpg"));
        btnSearchRe.setIcon(new ImageIcon(img));
        }
        catch(IOException ex)
        {
        	
        }*/
        btnViewReS = new JButton("View Records");
        
        btnLogOut = new JButton("Log Out");
        btnAboutUs = new JButton("About Us");
        lblPic1 = new JLabel();
        lblPic2 = new JLabel();
        JLabel l = new JLabel("                                                                                 ");

        Box box = Box.createVerticalBox();

        lblPic1.setIcon(new ImageIcon("C://sms2.GIF"));
        box.add(lblPic1);
        box.add(Box.createVerticalStrut(50));
        box.add(btnAddRe);
        box.add(Box.createVerticalStrut(20));
        box.add(btnSearchRe);
        box.add(Box.createVerticalStrut(20));
        box.add(btnViewReS);
       
        box.add(Box.createVerticalStrut(20));
        box.add(btnLogOut);
        box.add(Box.createVerticalStrut(20));
        box.add(btnAboutUs);
        box.add(Box.createVerticalStrut(210));
        lblPic2.setIcon(new ImageIcon("C://iet.GIF"));
        box.add(lblPic2);
        box.add(l);

        panel1.add(box);
        btnAddRe.addActionListener(listener);
        btnSearchRe.addActionListener(listener);
        btnViewReS.addActionListener(listener);
        btnLogOut.addActionListener(listener);
        btnAboutUs.addActionListener(listener);


        detailsPanel.btnNext.addActionListener(listener);
        
        educationdetailspanel.btnNext1.addActionListener(listener);
        searchstudentpanel.btnSearch.addActionListener(listener);        
        searchstudentpanel.btnDropOut.addActionListener(listener);
        
        classdetailspanel.btnView.addActionListener(listener);
        
      
        this.add(panel1, BorderLayout.WEST);
        panel1.setVisible(true);
    
    }
       

}
