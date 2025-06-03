package Dependency_Inversion_Principle;
//without dependency inversion

public class BadDip {
    public class EmailService {
        public void sendEmail(String message) {
            System.out.println("Sending email: " + message);
        }
    }

    public class NotificationManager {
        private EmailService emailService = new EmailService(); // Tight coupling!

        public void send(String message) {
            emailService.sendEmail(message);
        }
    }
}
