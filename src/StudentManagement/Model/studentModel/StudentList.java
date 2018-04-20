
package StudentManagement.Model.studentModel;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import StudentManagement.Connection.studentConnection.StudentConnection;
import StudentManagement.View.studentView.ClassDetailsTable;
import StudentManagement.View.studentView.DetailsPanel;
import StudentManagement.View.studentView.ViewSearchStudentPanel;
public class StudentList 
{ 
	public void addRecord(Student newStudent) throws SQLException, ClassNotFoundException, Exception
	{
		
		   Connection conn = StudentConnection.getConnection();
		   Statement stmt = conn.createStatement();
		   String sql1;
		   
		   
                   sql1 = "INSERT INTO tblpersonaldetails VALUES('" +newStudent.getRollNo()+ "', '" +newStudent.getFname()+"' , '"+newStudent.getMname()+"' ,'"+newStudent.getLname()+"', '"+newStudent.getGender()+"' ,'"+newStudent.getDob() +"' ,'"+newStudent.getStudentContact() +"', '"+ newStudent.getGuardianContact() +"', '"+  newStudent.getLandLineNo()+"', '"+newStudent.getStudentEmail()+"', '"+ newStudent.getGuardianEmail()+"', '"+newStudent.getAddress() +"', '"+newStudent.getCategory()  +"','"+newStudent.getBranch()+"', '"+newStudent.getBatchYear() +"', '"+newStudent.getAdmType()+"')";
                   stmt.execute(sql1);
                  

	}
	public int countStudent(String Branch, String Year) throws SQLException, ClassNotFoundException
	{
		 int cnt = 0;
		   Connection conn = StudentConnection.getConnection();
		   Statement stmt = conn.createStatement();
		   String sql;
		   sql = "SELECT * FROM tblpersonaldetails WHERE Branch = '" + Branch + "' AND BatchYear = '" + Year + "'";
		   ResultSet rs = stmt.executeQuery(sql);

		   while(rs.next())
		   {
			   cnt++;
		   }
		   return cnt;
	}
	
	public void addEdu( EducationDetails eduDetail, String RollNumber) throws SQLException, ClassNotFoundException, Exception
	{
                   Connection conn = StudentConnection.getConnection();
		   Statement stmt = conn.createStatement();
                   String sql2;

                   sql2 = "INSERT INTO tbleducationdetails VALUES('" + RollNumber + "' ,'"+eduDetail.getSclName_10()+ "' ,"+eduDetail.getPercentile10()+", '" + eduDetail.getSclName_12()+"', " +eduDetail.getPercentile12()+","  +eduDetail.getJeeMark()+ "," +eduDetail.getAcpcNo()+")";
		   stmt.execute(sql2);
	}
	public ViewSearchStudentPanel search(String RollNumber) throws SQLException, ClassNotFoundException
	{
		Connection conn = StudentConnection.getConnection();
		   Statement stmt = conn.createStatement();
		   String sql;
		   sql = "SELECT * FROM tblpersonaldetails WHERE RollNo = '" + RollNumber + "'";
		   ViewSearchStudentPanel studentDetails = null;
		   ResultSet rs;
		   rs = stmt.executeQuery(sql);
		   while(rs.next())
		   {
			   studentDetails = new ViewSearchStudentPanel(rs.getString("FirstName"), rs.getString("MiddleName"), rs.getString("LastName"), rs.getString("Gender"), rs.getString("BirthDate"), rs.getString("StudentConNo"), rs.getString("GuardianConNo"), rs.getString("LandLineNo"),rs.getString("StudentEmail"), rs.getString("GuardianEmail"), rs.getString("Address"),rs.getString("Category"), rs.getString("Branch"), rs.getString("BatchYear"), rs.getString("AdmType"));
			   
		   }
		   return studentDetails;
		   
	}	
	public void insertStudent(String RollNumber) throws SQLException, ClassNotFoundException
	{
		Connection conn = StudentConnection.getConnection();
		   Statement stmt = conn.createStatement();
		   String sql1;
	
		   sql1 = "INSERT INTO tbldropedstudent select * from tblpersonaldetails WHERE RollNo = '" + RollNumber + "'";
		   stmt.execute(sql1);
	}
	public void deleteStudent(String RollNumber) throws SQLException, ClassNotFoundException
	{
		Connection conn = StudentConnection.getConnection();
		   Statement stmt = conn.createStatement();
		   String sql1;
	
		   sql1 = "DELETE FROM tblpersonaldetails WHERE RollNo = '" + RollNumber + "'";
		   stmt.execute(sql1);
			
	}
	public void deleteEducation(String RollNumber) throws SQLException, ClassNotFoundException
	{
		Connection conn = StudentConnection.getConnection();
		   Statement stmt = conn.createStatement();
		   String sql1;
	
		   sql1 = "DELETE FROM tbleducationdetails WHERE RollNumber = '" + RollNumber + "'";
		   stmt.execute(sql1);
			
	}
	
	public void viewClass(String Branch, String Batch, ClassDetailsTable o) throws SQLException, ClassNotFoundException
	{
		Connection conn = StudentConnection.getConnection();
		   Statement stmt = conn.createStatement();
		   String sql;
		   sql = "SELECT * FROM tblpersonaldetails WHERE Branch = '" + Branch + "' AND BatchYear = '" + Batch + "'";
		   ResultSet rs = stmt.executeQuery(sql);

		   int i = 1;
			 
		   while(rs.next())
		   {
			   
			   o.model.insertRow(i, new Object[]{rs.getString("RollNo"), rs.getString("FirstName"), rs.getString("MiddleName"), rs.getString("LastName"), rs.getString("Gender"), rs.getString("BirthDate"), rs.getString("StudentConNo"), rs.getString("GuardianConNo"), rs.getString("LandLineNo"),rs.getString("StudentEmail"), rs.getString("GuardianEmail"), rs.getString("Address"),rs.getString("Category"), rs.getString("Branch"), rs.getString("BatchYear"), rs.getString("AdmType")});
			    i++;
		   }
		   
		   o.add(o.table);
		   o.setVisible(true);

	}
		
	}
	

