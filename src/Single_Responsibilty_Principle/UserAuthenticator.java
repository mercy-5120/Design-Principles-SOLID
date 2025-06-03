package Single_Responsibilty_Principle;
//Handles only authentication
public class UserAuthenticator {
    private Logger logger;

    public UserAuthenticator(Logger logger) {
        this.logger = logger;
    }

    public boolean login(String username, String password) {
        if (username.equals("admin") && password.equals("1234")) {
            logger.log("Login successful for user: " + username);
            return true;
        }
        logger.log("Login failed for user: " + username);
        return false;
    }
}