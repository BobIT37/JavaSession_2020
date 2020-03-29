package week_7;

public class SiliconeAccount {
	
	private String email;
	private String firstName;
	private String password;
	
	public void setAccountInfo(String email, String firstName, String password) {
		this.email = email;
		this.firstName = firstName;
		setPassword(password);
		
		
	}
	
	public String getAccountInfo() {
		return this.email + " | "+ firstName + " | " + password;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(password.length() < 6) {
			System.out.println("Paswword must be at least 6 characters");
			return;
		}
		this.password = password;
	}
	
	

}
