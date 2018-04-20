package StudentManagement.View.studentView;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class DetailsPanel extends JPanel
{
    private JPanel panelGender,panelDOB;
    public JButton btnNext;
    private JScrollPane scroll;
    private JLabel lblGConNo,lblLandLine,lblSEID,lblGEID,lbl,lblFName,lblMName,lblLName,lblCatagory,lblGen,lblAdd,lblBranch,lblConNo,lblBatch,lblDOB,lblAdmition;
    public JTextField txtGConNo,txtLandLine,txtSEID,txtGEID,txtFName,txtMName,txtLName,txtCoNo;
    public JTextArea txtAddress;
    private DefaultComboBoxModel category,branch,batch,type,date,month,year;
    public JComboBox combo1,combo2,combo3,combo4,comboDate,comboMonth,comboYear;
    private ButtonGroup gender;
    public JRadioButton male,female;

    
    public DetailsPanel()
    {
        
        this.setLayout(new GridLayout(17,2,8,8));
        this.setBackground(Color.LIGHT_GRAY);

        panelGender = new JPanel();
        panelGender.setSize(700,400);
        panelGender.setLayout(new GridLayout(0 , 2 , 10 , 10));
        panelGender.setBackground(Color.LIGHT_GRAY);

        panelDOB = new JPanel();
        panelDOB.setSize(700,400);
        panelDOB.setLayout(new GridLayout(1 , 3 , 10 , 10));
        panelDOB.setBackground(Color.LIGHT_GRAY);

        JLabel e1 = new JLabel();
        JLabel e2 = new JLabel();
        JLabel e3 = new JLabel();

        lbl = new JLabel("  Enter Student Personal Details");
        lbl.setFont(new Font("Ariel",Font.BOLD,24));
        lbl.setForeground(Color.blue);
        lblFName = new JLabel("    First Name");
        lblFName.setFont(new Font("Ariel",Font.BOLD,15));
        lblMName = new JLabel("    Middle Name");
        lblMName.setFont(new Font("Ariel",Font.BOLD,15));
        lblLName = new JLabel("    Last Name");
        lblLName.setFont(new Font("Ariel",Font.BOLD,15));
        lblGen = new JLabel("    Gender");
        lblGen.setFont(new Font("Ariel",Font.BOLD,15));
        lblDOB = new JLabel("    Date of Birth(dd/mm/yyyy)");
        lblDOB.setFont(new Font("Ariel",Font.BOLD,15));
        date = new DefaultComboBoxModel();

        date.addElement("Date");
        date.addElement("1");
        date.addElement("2");
        date.addElement("3");
        date.addElement("4");
        date.addElement("5");
        date.addElement("6");
        date.addElement("7");
        date.addElement("8");
        date.addElement("9");
        date.addElement("10");
        date.addElement("11");
        date.addElement("12");
        date.addElement("13");
        date.addElement("14");
        date.addElement("15");
        date.addElement("16");
        date.addElement("17");
        date.addElement("18");
        date.addElement("19");
        date.addElement("20");
        date.addElement("21");
        date.addElement("22");
        date.addElement("23");
        date.addElement("24");
        date.addElement("25");
        date.addElement("26");
        date.addElement("27");
        date.addElement("28");
        date.addElement("29");
        date.addElement("30");
        date.addElement("31");

        comboDate = new JComboBox(date);
        comboDate.setSelectedIndex(0);

        month = new DefaultComboBoxModel();

        month.addElement("Month");
        month.addElement("01");
        month.addElement("02");
        month.addElement("03");
        month.addElement("04");
        month.addElement("05");
        month.addElement("06");
        month.addElement("07");
        month.addElement("08");
        month.addElement("09");
        month.addElement("10");
        month.addElement("11");
        month.addElement("12");
        

        comboMonth = new JComboBox(month);
        comboMonth.setSelectedIndex(0);

        year = new DefaultComboBoxModel();

        year.addElement("Year");
        year.addElement("1990");
        year.addElement("1991");
        year.addElement("1992");
        year.addElement("1993");
        year.addElement("1994");
        year.addElement("1995");
        year.addElement("1996");
        year.addElement("1997");
        year.addElement("1998");
        year.addElement("1999");
        year.addElement("2000");
        year.addElement("2001");
        year.addElement("2002");
        year.addElement("2003");
        year.addElement("2004");
        year.addElement("2005");


        comboYear = new JComboBox(year);
        comboYear.setSelectedIndex(0);

        lblConNo = new JLabel("    Student Contact Number");
        lblConNo.setFont(new Font("Ariel",Font.BOLD,15));
        lblGConNo = new JLabel("    Guardian Contact Number");
        lblGConNo.setFont(new Font("Ariel",Font.BOLD,15));
        lblLandLine = new JLabel("    Land Line Number");
        lblLandLine.setFont(new Font("Ariel",Font.BOLD,15));
        lblSEID = new JLabel("    Student Email I'D");
        lblSEID.setFont(new Font("Ariel",Font.BOLD,15));
        lblGEID = new JLabel("    Guardian Email I'D");
        lblGEID.setFont(new Font("Ariel",Font.BOLD,15));

        lblAdd = new JLabel("    Address");
        lblAdd.setFont(new Font("Ariel",Font.BOLD,15));


        lblCatagory = new JLabel("    Category");
        lblCatagory.setFont(new Font("Ariel",Font.BOLD,15));
        lblBranch = new JLabel("    Branch");
        lblBranch.setFont(new Font("Ariel",Font.BOLD,15));
        lblBatch = new JLabel("    Batch Year");
        lblBatch.setFont(new Font("Ariel",Font.BOLD,15));
        lblAdmition = new JLabel("    Admission Type");
        lblAdmition.setFont(new Font("Ariel",Font.BOLD,15));

        txtFName = new JTextField(10);
        txtMName = new JTextField(10);
        txtLName = new JTextField(10);

        txtAddress = new JTextArea();
        scroll = new JScrollPane(txtAddress);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        txtCoNo = new JTextField(10);
        txtGConNo = new JTextField(10);
        txtLandLine = new JTextField(11);
        txtSEID = new JTextField(30);
        txtGEID = new JTextField(30);

        btnNext = new JButton("Next");
        male = new JRadioButton("Male",true);
        female = new JRadioButton("Female",false);

        male.setHorizontalAlignment(JRadioButton.CENTER);
        female.setHorizontalAlignment(JRadioButton.CENTER);

	male.setBackground(Color.white);
        female.setBackground(Color.white);

        gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);

      category = new DefaultComboBoxModel();

      category.addElement("--none--");
      category.addElement("General");
      category.addElement("OBC");
      category.addElement("SC");
      category.addElement("ST");

      combo1 = new JComboBox(category);
      combo1.setSelectedIndex(0);

      branch = new DefaultComboBoxModel();

      branch.addElement("--none--");
      branch.addElement("ICT");
      branch.addElement("Chemical");
      branch.addElement("Mechanical");
      branch.addElement("M.Tech");
      branch.addElement("PhD");

      combo2 = new JComboBox(branch);
      combo2.setSelectedIndex(0);

      batch = new DefaultComboBoxModel();

      batch.addElement("--none--");
      batch.addElement("2011");
      batch.addElement("2012");
      batch.addElement("2013");
      batch.addElement("2014");
      batch.addElement("2015");
      batch.addElement("2016");
      batch.addElement("2017");
      batch.addElement("2018");
      batch.addElement("2019");
      batch.addElement("2020");

      combo3 = new JComboBox(batch);
      combo3.setSelectedIndex(0);

      type = new DefaultComboBoxModel();

      type.addElement("--none--");
      type.addElement("NRI");
      type.addElement("ACPC");
      type.addElement("Vacant");

      combo4 = new JComboBox(type);
      combo4.setSelectedIndex(0);

        this.add(lbl);
        this.add(e1);
        this.add(lblFName);
        this.add(txtFName);
        this.add(lblMName);
        this.add(txtMName);
        this.add(lblLName);
        this.add(txtLName);

        this.add(lblGen);
        panelGender.add(male);
        panelGender.add(female);
        this.add(panelGender);
        this.add(lblDOB);
        panelDOB.add(comboDate);
        panelDOB.add(comboMonth);
        panelDOB.add(comboYear);
        this.add(panelDOB);
        this.add(lblConNo);
        this.add(txtCoNo);
        this.add(lblGConNo);
        this.add(txtGConNo);
        this.add(lblLandLine);
        this.add(txtLandLine);
        this.add(lblSEID);
        this.add(txtSEID);
        this.add(lblGEID);
        this.add(txtGEID);
        this.add(lblAdd);
        this.add(scroll);
        this.add(lblCatagory);
        this.add(combo1);
        this.add(lblBranch);
        this.add(combo2);
        this.add(lblBatch);
        this.add(combo3);
        this.add(lblAdmition);
        this.add(combo4);
        this.add(btnNext);
    }
    
}