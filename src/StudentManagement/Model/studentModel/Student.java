package StudentManagement.Model.studentModel;


public class Student
{
        private String rollNo;
	private String fname;
	private String mname;
	private String lname;
	private String gender;
	private String date,month,year,dob;
        private String studentContact;
	private String guardianContact;
	private String landLineNo;
        private String studentEmail;
	private String guardianEmail;
	private String address;
	private String category;
        private String branch;
        private String batchYear;
	private String admType;
	public Student()
	{}
	
	public Student(String fn, String mn, String ln, String gender, String dob, String stuCon, String gurCon, String landLine, String stuEmail, String gurEmail, String address, String category, String branch, String batch, String admType)
	{
		this.fname = fn;
		this.mname = mn;
		this.lname = ln;
		this.gender = gender;
		this.dob = dob;
		this.studentContact = stuCon;
		this.guardianContact = gurCon;
		this.landLineNo = landLine;
		this.studentEmail = stuEmail;
		this.guardianEmail = gurEmail;
		this.address = address;
		this.category = category;
		this.branch = branch;
		this.batchYear = batch;
		this.admType = admType;
	}
	
	
        public void setRollNo(int student)
        {

        	String s=batchYear;
        	
        	if(branch.equals("ICT"))
        		s+="01";
        	if(branch.equals("Chemical"))
        		s+="02";
        	else if(branch.equals("Mechanical"))
        		s+="03";
        	else if(branch.equals("M.Tech"))
        		s+="04";
        	else if(branch.equals("PhD"))
        		s+="05";
        	
        	s += String.format("%03d",student);
        	
        	this.rollNo = s;
        }
	public String getRollNo()
        {
		return rollNo;
	}
        public void setFname(String fname)
        {
            
		this.fname = fname;
	}
	public String getFname() {
		return fname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMname() {
		return mname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getLname() {
		return lname;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGender() {
		return gender;
	}
        public void setDob(String dob) {

		this.dob = dob;
	}
	public String getDob()
        {
                return dob;

        }
	public String getDate() {
		return date;
	}
        
	public String getMonth() {
		return month;
	}
        
	public String getYear() {
		return year;
	}
	public void setStudentContact(String studentContact) {
		this.studentContact = studentContact;
	}
	public String getStudentContact() {
		return studentContact;
	}
	public void setGuardianContact(String guardianContact) {
		this.guardianContact = guardianContact;
	}
	public String getGuardianContact() {
		return guardianContact;
	}
	public void setLandLineNo(String landLineNo) {
		this.landLineNo = landLineNo;
	}
	public String getLandLineNo() {
		return landLineNo;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setGuardianEmail(String guardianEmail) {
		this.guardianEmail = guardianEmail;
	}
	public String getGuardianEmail() {
		return guardianEmail;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCategory() {
		return category;
	}
        public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getBranch() {
		return branch;
	}
        public void setBatchYear(String batchYear) {
		this.batchYear = batchYear;
	}
	public String getBatchYear() {
		return batchYear;
	}
	public void setAdmType(String admType) {
		this.admType = admType;
	}
	public String getAdmType() {
		return admType;
	}
	
}
