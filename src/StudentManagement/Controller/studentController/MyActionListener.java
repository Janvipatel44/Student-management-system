package StudentManagement.Controller.studentController;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.Closeable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import StudentManagement.Common.MyException;
import StudentManagement.Model.studentModel.EducationDetails;
import StudentManagement.Model.studentModel.Student;
import StudentManagement.Model.studentModel.StudentList;
import StudentManagement.View.studentView.AboutUsPanel;
import StudentManagement.View.studentView.ClassDetailsTable;
import StudentManagement.View.studentView.MyGui;
import StudentManagement.View.studentView.ViewDetailsPanel;
import StudentManagement.View.studentView.ViewEducationalDetailsPanel;
import StudentManagement.View.studentView.ViewSearchStudentPanel;

public class MyActionListener implements ActionListener
{
	private MyGui obj;
	private Student myStudent = new Student();
    private StudentList myStudentList = new StudentList();
    private EducationDetails educationDetails = new EducationDetails();
    private ViewDetailsPanel viewDetailsPanel;
    private ViewEducationalDetailsPanel viewEducationalpanel;
    private AboutUsPanel aboutuspanel = new AboutUsPanel();
    private ViewSearchStudentPanel searchStudentDetails = new ViewSearchStudentPanel();

     
    private ClassDetailsTable objTable = new ClassDetailsTable();
        
    public MyActionListener(MyGui frame)
	{
		obj = frame;
	}
    
    public void actionPerformed(ActionEvent e)
	{
    	try
        {
    		if(e.getSource() == obj.btnAboutUs)
        	{
    			aboutuspanel.setVisible(false);
            	obj.add(aboutuspanel, BorderLayout.AFTER_LINE_ENDS);
                obj.searchstudentpanel.setVisible(false);
                  		
              	obj.detailsPanel.setVisible(false);
              	obj.educationdetailspanel.setVisible(false);
              	obj.classdetailspanel.setVisible(false);
              	searchStudentDetails.setVisible(false);
                aboutuspanel.setVisible(true);

            }
            else if(e.getSource() == obj.btnLogOut)
        	{
            	System.exit(0);
        	}
            else if(e.getSource() == obj.btnAddRe)
            {
            	obj.searchstudentpanel.setVisible(false);
            		
        		obj.detailsPanel.setVisible(false);
        		obj.educationdetailspanel.setVisible(false);
        		obj.classdetailspanel.setVisible(false);
              	searchStudentDetails.setVisible(false);

            	obj.detailsPanel.txtFName.setText("");
                obj.detailsPanel.txtMName.setText("");
                obj.detailsPanel.txtLName.setText("");
                obj.detailsPanel.male.setSelected(true);
                obj.detailsPanel.comboDate.setSelectedItem("Date");
                obj.detailsPanel.comboMonth.setSelectedItem("Month");
                obj.detailsPanel.comboYear.setSelectedItem("Year");
                obj.detailsPanel.txtCoNo.setText("");
                obj.detailsPanel.txtGConNo.setText("");
                obj.detailsPanel.txtLandLine.setText("");
                obj.detailsPanel.txtSEID.setText("");
                obj.detailsPanel.txtGEID.setText("");
                obj.detailsPanel.txtAddress.setText("");
                   
                obj.detailsPanel.combo1.setSelectedItem("--none--");
                obj.detailsPanel.combo2.setSelectedItem("--none--");
                obj.detailsPanel.combo3.setSelectedItem("--none--");
                obj.detailsPanel.combo4.setSelectedItem("--none--");
                obj.educationdetailspanel.txtSchool_10.setText("");
                obj.educationdetailspanel.txtSchool_12.setText("");
                obj.educationdetailspanel.txtPer_10.setText("");
                obj.educationdetailspanel.txtPer_12.setText("");
                obj.educationdetailspanel.txtJEE.setText("");
                obj.educationdetailspanel.txtACPC.setText("");
                   
        			
				obj.add(obj.detailsPanel,BorderLayout.AFTER_LINE_ENDS);
                obj.detailsPanel.setVisible(true);
            }
            else if(e.getSource() == obj.btnSearchRe)
            {
            	obj.searchstudentpanel.setVisible(false);
        		obj.detailsPanel.setVisible(false);
              	searchStudentDetails.setVisible(false);

        		obj.educationdetailspanel.setVisible(false);
        		obj.classdetailspanel.setVisible(false);
                obj.add(obj.searchstudentpanel, BorderLayout.AFTER_LINE_ENDS);
        		obj.searchstudentpanel.setVisible(true);	
            }
            else if(e.getSource() == obj.searchstudentpanel.btnSearch)
            {
            	 searchStudentDetails = myStudentList.search(obj.searchstudentpanel.txtRollNumber.getText());
						
            	obj.searchstudentpanel.setVisible(false);
				obj.add(searchStudentDetails,BorderLayout.AFTER_LINE_ENDS);
				searchStudentDetails.setVisible(true);
						
            }
            else if(e.getSource() == obj.searchstudentpanel.btnDropOut)
            {
            	myStudentList.insertStudent(obj.searchstudentpanel.txtRollNumber.getText());
				myStudentList.deleteStudent(obj.searchstudentpanel.txtRollNumber.getText());
				myStudentList.deleteEducation(obj.searchstudentpanel.txtRollNumber.getText());
            }
            
            else if(e.getSource() == obj.btnViewReS)
        	{
            	obj.searchstudentpanel.setVisible(false);
        		obj.detailsPanel.setVisible(false);
              	searchStudentDetails.setVisible(false);

        		obj.educationdetailspanel.setVisible(false);
               	obj.classdetailspanel.setVisible(false);
               	obj.add(obj.classdetailspanel, BorderLayout.AFTER_LINE_ENDS);
               	obj.classdetailspanel.setVisible(true);
            }
            else if(e.getSource() == obj.classdetailspanel.btnView)
            {
               	myStudentList.viewClass((String)obj.classdetailspanel.combobox2.getSelectedItem(),(String) obj.classdetailspanel.combobox1.getSelectedItem(), objTable);
            }
            else if(e.getSource() == obj.detailsPanel.btnNext)
            {
            	if((obj.detailsPanel.txtFName.getText()).equals("") || (obj.detailsPanel.txtMName.getText()).equals("") ||(obj.detailsPanel.txtLName.getText()).equals("")|| (obj.detailsPanel.txtCoNo.getText()).equals("") || (obj.detailsPanel.txtGConNo.getText()).equals("") || (obj.detailsPanel.txtLandLine.getText()).equals("") || (obj.detailsPanel.txtSEID.getText()).equals("") || (obj.detailsPanel.txtGEID.getText()).equals(""))
                {
            		throw new MyException("Null Value Not Allowed");
                }
                if((obj.detailsPanel.combo1.getSelectedItem()).equals("--none--") || (obj.detailsPanel.combo2.getSelectedItem()).equals("--none--") || (obj.detailsPanel.combo3.getSelectedItem()).equals("--none--")|| (obj.detailsPanel.combo4.getSelectedItem()).equals("--none--") )
                {
                	throw new MyException("Null Value Not Allowed");
                }
                if((obj.detailsPanel.comboDate.getSelectedItem()).equals("Date") || (obj.detailsPanel.comboMonth.getSelectedItem()).equals("Month") || (obj.detailsPanel.comboYear.getSelectedItem()).equals("Year"))
                {
                	throw new MyException("Null Value Not Allowed");
                }
                if((obj.detailsPanel.txtCoNo.getText().length() != 10) || (obj.detailsPanel.txtGConNo.getText().length() != 10))
                {
                	throw new MyException("Phone Number's Length Should Be 10 Digit Longer");
                }
                if(obj.detailsPanel.txtLandLine.getText().length() != 11)
                {
                	throw new MyException("Phone Number's Length Should Be 11 Digit Longer");
                }
                if((obj.detailsPanel.comboMonth.getSelectedItem()).equals("02")&&(obj.detailsPanel.comboDate.getSelectedItem()).equals("30") ||(obj.detailsPanel.comboMonth.getSelectedItem()).equals("02")&&(obj.detailsPanel.comboDate.getSelectedItem()).equals("31") )
                {
                	throw new MyException("February month's date can't be 30 or 31");
                }
                else
                {
                	if((obj.detailsPanel.txtSEID.getText().endsWith("@gmail.com") || obj.detailsPanel.txtSEID.getText().endsWith("@yahoo.com"))&& (obj.detailsPanel.txtGEID.getText().endsWith("@gmail.com") || obj.detailsPanel.txtGEID.getText().endsWith("@yahoo.com")))
                	{
                		obj.detailsPanel.setVisible(false);

                        viewDetailsPanel = new ViewDetailsPanel(obj);
                        obj.add(viewDetailsPanel,BorderLayout.AFTER_LINE_ENDS);
                        viewDetailsPanel.setVisible(true);
                        }
                        else
                        {
                         throw new MyException("Invalid Email-id");
                        }
                    }
                }
                else if(e.getSource() == viewDetailsPanel.btnSubmit)
                {
                    myStudent.setFname(obj.detailsPanel.txtFName.getText());
                    myStudent.setMname(obj.detailsPanel.txtMName.getText());
                    myStudent.setLname(obj.detailsPanel.txtLName.getText());
                    if(obj.detailsPanel.male.isSelected())
                    {
                        myStudent.setGender(obj.detailsPanel.male.getLabel());
                    }
                    else if(obj.detailsPanel.female.isSelected())
                    {
                        myStudent.setGender(obj.detailsPanel.female.getLabel());
                    }
                    myStudent.setDob((String) obj.detailsPanel.comboDate.getSelectedItem()+"/"+(String) obj.detailsPanel.comboMonth.getSelectedItem()+"/"+(String) obj.detailsPanel.comboYear.getSelectedItem());
                    myStudent.setStudentContact(obj.detailsPanel.txtCoNo.getText());
                    myStudent.setGuardianContact(obj.detailsPanel.txtGConNo.getText());
                    myStudent.setLandLineNo(obj.detailsPanel.txtLandLine.getText());
                    myStudent.setStudentEmail(obj.detailsPanel.txtSEID.getText());
                    myStudent.setGuardianEmail(obj.detailsPanel.txtGEID.getText());
                    myStudent.setAddress(obj.detailsPanel.txtAddress.getText());
                   
                    myStudent.setCategory((String) obj.detailsPanel.combo1.getSelectedItem());
                    myStudent.setBranch((String) obj.detailsPanel.combo2.getSelectedItem());
                    myStudent.setBatchYear((String) obj.detailsPanel.combo3.getSelectedItem());
                    myStudent.setAdmType((String) obj.detailsPanel.combo4.getSelectedItem());
                    int number = myStudentList.countStudent((String) obj.detailsPanel.combo2.getSelectedItem(), (String) obj.detailsPanel.combo3.getSelectedItem());
                    myStudent.setRollNo(number+1);
            	
                    myStudentList.addRecord(myStudent);
           
                    viewDetailsPanel.setVisible(false);
                    obj.add(obj.educationdetailspanel,BorderLayout.AFTER_LINE_ENDS);
                    obj.educationdetailspanel.setVisible(true);
                }
                else if(e.getSource() == viewDetailsPanel.btnReset)
                {
                    viewDetailsPanel.setVisible(false);
                    obj.detailsPanel.setVisible(true);
                  
                }
                else if(e.getSource() == obj.educationdetailspanel.btnNext1)
                {
                	if((obj.educationdetailspanel.txtSchool_10.getText()).equals("") || (obj.educationdetailspanel.txtSchool_12.getText()).equals("") || (obj.educationdetailspanel.txtPer_10.getText()).equals("") || (obj.educationdetailspanel.txtPer_12.getText()).equals("") ||(obj.educationdetailspanel.txtJEE.getText()).equals("")||(obj.educationdetailspanel.txtACPC.getText()).equals(""))
                    {
                		throw new MyException("Null Value Not Allowed");
                    }
                    if((Double.parseDouble(obj.educationdetailspanel.txtPer_10.getText()))>99.99 || (Double.parseDouble(obj.educationdetailspanel.txtPer_12.getText()))>99.99 )
                    {
                    	throw new MyException("Percentile can't be more than 99.99");
                    }
                    if((Double.parseDouble(obj.educationdetailspanel.txtJEE.getText())) > 360)
                    {
                    	throw new MyException("JEE marks can't be more than 360");
                    }
                    obj.educationdetailspanel.setVisible(false);
                    viewEducationalpanel = new ViewEducationalDetailsPanel(obj);
                    obj.add(viewEducationalpanel,BorderLayout.AFTER_LINE_ENDS);
                    viewEducationalpanel.setVisible(true);
                    System.out.print(obj.educationdetailspanel.txtPer_10.getText());
                        
                }
                else if(e.getSource() == viewEducationalpanel.btnSave1)
                {
                    educationDetails.setSclName_10(obj.educationdetailspanel.txtSchool_10.getText());
                    educationDetails.setSclName_12(obj.educationdetailspanel.txtSchool_12.getText());
                    educationDetails.setPercentile10(Double.parseDouble(obj.educationdetailspanel.txtPer_10.getText()));
                    educationDetails.setPercentile12(Double.parseDouble(obj.educationdetailspanel.txtPer_12.getText()));
                    educationDetails.setJeeMark(Double.parseDouble(obj.educationdetailspanel.txtJEE.getText()));
                    educationDetails.setAcpcNo(Integer.parseInt(obj.educationdetailspanel.txtACPC.getText()));
               
                    myStudentList.addEdu(educationDetails, myStudent.getRollNo());
                
                    viewEducationalpanel.setVisible(false);
                }
                else if(e.getSource() == viewEducationalpanel.btnReset1)
                {
                	viewEducationalpanel.setVisible(false);
                    obj.educationdetailspanel.setVisible(true);

                }
    		
    	        
    	
        }
        catch(MyException s)
        {
        	JOptionPane pane1 = new JOptionPane();
        	pane1.showMessageDialog(null,s.getMessage());
        }catch (SQLException ex) {
            Logger.getLogger(MyActionListener.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyActionListener.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(MyActionListener.class.getName()).log(Level.SEVERE, null, ex);
        }
        
	}




}