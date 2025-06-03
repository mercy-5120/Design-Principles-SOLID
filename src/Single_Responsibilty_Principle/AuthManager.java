package Single_Responsibilty_Principle;
//Example of code that doesnt follow the single responsibility principle
// The class handles two responsibilities that is authentication and logging hence breaking the principle

public class AuthManager {
    public boolean login(String username, String password) {
        // authenticate user
        if (username.equals("admin") && password.equals("1234")) {
            log("Login successful for user: " + username);
            return true;
        }
        log("Login failed for user: " + username);
        return false;
    }

    public void log(String message) {
        // write to file or console
        System.out.println("LOG: " + message);
    }
}
