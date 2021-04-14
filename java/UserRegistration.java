import java.util.ArrayList;
import java.util.regex.Pattern;

public class UserRegistration {
	
	// UC-1:This method is used validating first name
	public static boolean validateFirstName(String firstName)
	{
		return Pattern.matches("^[A-Z]{1}[a-z]{2,}", firstName);
	}

	// UC-2: This method is used validating last name
	 
	public static boolean validateLastName(String lastName) { 
		return Pattern.matches("^[A-Z]{1}[a-z]{2,}", lastName);
	}

	// UC-3 & 9: This method is used validating email
	
	public static String validateEmail(String email) {
		if(Pattern.matches("^(?!\\.)[A-Za-z0-9]+([._%+-]?[0-9])*@[A-Za-z0-9-]+\\.[a-zA-Z]{2,}(\\.[A-Za-z]{2,})?$",email))
		{
			return "valid";
		}
		else
		{
			return "invalid";
		}
	}

	// UC-4:This method is used validating predefined mobile number
	 
	public static boolean validatePhoneNumber(String phoneNumber) {
		return Pattern.matches("^[91]{2}[0-9]{10}",phoneNumber);
	}

	// UC-5: This method is used validating password
	 
	public static boolean validatePassWord(String passWord) {

		/** Rule1: minimum 8 characters
	         * Rule2: at least 1 upper-case
	         * Rule3: at least 1 numeric
		 * Rule4: atleast 1 special char
	         */
		return Pattern.matches("(?=.[A-Z])(?=.[a-z])(?=.[0-9])(?=.[-+!@#$%^&*()]).{8,}", passWord);
	}

	/*
	 * UC-6: This method is used validating multiple of email
	 */
	//adding email to array-list and calling validateEmail method
	public static void addToEmailList(String emailToAdd) {
		ArrayList<String> email = new ArrayList<String>();

		email.add(emailToAdd);

		for(int i=0;i<email.size();i++)
		{
			System.out.println(email.get(i)+": "+validateEmail(email.get(i)));
		}
	}

	//main method
	public static void main(String[] args) {
		String firstName = "Anusha";
		String lastName = "yadav";
		long phoneNumber = 8951627807L;
		String passWord = "raja#@%ji()*&nagar";

		System.out.println("first name: "+validateFirstName(firstName));
		System.out.println("last name: "+validateLastName(lastName));

		System.out.println("phone numbar: "+validatePhoneNumber(Long.toString(phoneNumber)));
		System.out.println("password: "+validatePassWord(passWord));

		//valid email
		addToEmailList("Anusha@gmail.com");
		addToEmailList("Anusha-100@gmail.com");
		addToEmailList("Anusha.100@gmail.com");
		addToEmailList("Anusha-100@Rahul.com");
		addToEmailList("Anusha-100@Rahul.net");
		addToEmailList("Anusha.100@Rahul.com.au");
		addToEmailList("Anusha@1.com");
		addToEmailList("Anusha@gmail.com.com");
		addToEmailList("Anusha+100@yahoo.com");

		//invalid email
		addToEmailList("Anusha@.com.kl");
		addToEmailList("Anusha123@gmail.sds");
		addToEmailList("Anusha567@.mom");
		addToEmailList("Anusha876@.got0");
		addToEmailList(".Anusha,@tiger838");
		addToEmailList("Anusha()*@gmail.com");
		addToEmailList("Anushal@%*.com");
		addToEmailList("Anusha..@rediff");
		addToEmailList("Anusha.@gmail.com");
		addToEmailList("Anusha@Anusha@gmail.com");
		addToEmailList("Anusha@gmail.com.ol");
		}
}
