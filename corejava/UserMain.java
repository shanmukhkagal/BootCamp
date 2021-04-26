public class userMain extends Exception {
    /**
     *
     * UC12: exception handling
     *
     * creating objects for every method in the user registration.
     *
     * @param args
     */
    public static void main(String args[]) {
        UserValidation userValidation = new UserValidation();
        userValidation.userValidate();
    }
}
