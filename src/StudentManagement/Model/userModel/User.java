package StudentManagement.Model.userModel;


public class User
{
	private String name;
	private String password;
	private String email;
	private String contact;
	private String userID;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setContact(String contact){
		this.contact = contact;
	}

	public String getContact() {
		return contact;
	}

	public void setUser(String user){
		this.userID = user;
	}

	public String getUser() {
		return userID;
	}
	
}

