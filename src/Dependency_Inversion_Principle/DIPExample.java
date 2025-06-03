package Dependency_Inversion_Principle;
//This code adheres to the principle

public class DIPExample {

    // Abstraction (interface)
    interface MessageService {
        void sendMessage(String message);
    }

    // Low-level module #1
    static class EmailService implements MessageService {
        public void sendMessage(String message) {
            System.out.println("Sending EMAIL: " + message);
        }
    }

    // Low-level module #2
    static class SMSService implements MessageService {
        public void sendMessage(String message) {
            System.out.println("Sending SMS: " + message);
        }
    }

    // High-level module depends on the abstraction, not the concrete service
    static class NotificationManager {
        private MessageService messageService;

        public NotificationManager(MessageService messageService) {
            this.messageService = messageService;
        }

        public void notify(String message) {
            messageService.sendMessage(message);
        }
    }

    // Main method to run the example
    public static void main(String[] args) {
        // You can swap out EmailService with SMSService without changing NotificationManager
        MessageService email = new EmailService();
        MessageService sms = new SMSService();

        NotificationManager notifier1 = new NotificationManager(email);
        notifier1.notify("Your booking is confirmed!");

        NotificationManager notifier2 = new NotificationManager(sms);
        notifier2.notify("Your OTP code is 123456");
    }
}
