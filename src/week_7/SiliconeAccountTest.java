package week_7;



public class SiliconeAccountTest {

	public static void main(String[] args) {
		
		SiliconeAccount account1 = new SiliconeAccount();
		account1.setEmail("account1@sample.com");
		account1.setFirstName("Adam");
		account1.setPassword("adam12");
		
		System.out.println("Account1 pass: "+ account1.getEmail());
		System.out.println(account1.getAccountInfo());
		
		SiliconeAccount account2 = new SiliconeAccount();
		account2.setAccountInfo("ilhan@sample.com", "ilhan", "qwer345");
		System.out.println(account2.getAccountInfo());

	}

}
