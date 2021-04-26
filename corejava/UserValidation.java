import java.util.Scanner;
import java.util.regex.Pattern;

public class UserValidation {

    /**
     * patterns created for every method.
     */
    final String FIRST_NAME_PATTERN = "[A-Z]{1}[a-z]{2,10}";
    final String LAST_NAME_PATTERN = "[A-Z]{1}[a-z]{2,10}";
    final String EMAIL_PATTERN = "^[A-Za-z0-9+_.]+@[A-Za-z0-9+_.]+$";
    final String MOBILE_PATTERN = "^[0-9]{2}[\\s][0-9]{10}$";
    final String PASSWORD_PATTERN = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";


    public void userValidate() {

        /**
         * performed userValidation method here..
         * included exception handling
         */
        user userRegistration = (checkPattern, givenInput) -> {

            try {
                if (givenInput == null) {
                    throw new userException("Give valid input :");
                } else if (!(Pattern.matches(checkPattern, givenInput))) {
                    throw new userException("Give valid input:");
                }
                System.out.println("Given input is Valid:" + givenInput);
            } catch (userException e) {
                String printMessage = e.errorMessage;
                System.out.println(printMessage);
                userValidate();
            }
        };

        /**
         * @return FIRST_NAME_PATTERN with valid input
         */
        System.out.println("Enter the correct userFirstName");
        Scanner sc = new Scanner(System.in);
        String FirstName = sc.nextLine();
        userRegistration.validateUser(FIRST_NAME_PATTERN, FirstName);

        /**
         * @return LAST_NAME_PATTERN with valid input
         */
        System.out.println("Enter the correct userLastName");
        String LastName = sc.nextLine();
        userRegistration.validateUser(LAST_NAME_PATTERN, LastName);

        /**
         * @return EMAIL_PATTERN with valid input
         */
        System.out.println("Enter the correct userEmail");
        String Email = sc.nextLine();
        userRegistration.validateUser(EMAIL_PATTERN, Email);

        /**
         * @return MOBILE_NUMBER_PATTERN with valid input
         */
        System.out.println("Enter the correct userMobileNumber");
        String MobileNumber = sc.nextLine();
        userRegistration.validateUser(MOBILE_PATTERN, MobileNumber);

        /**
         * @return PASSWORD_PATTERN with valid input
         */
        System.out.println("Enter the correct userPassword");
        String Password = sc.nextLine();
        userRegistration.validateUser(PASSWORD_PATTERN, Password);
    }
}
