import Controllers.AuthenticationController;

public class Main {
    public static void main(String[] args) {
        AuthenticationController authController = new AuthenticationController();
        //Example usage
        authController.signUp("user1", "password123");
        authController.login("user1", "password123");
        authController.forgotPassword("user1");
        authController.login("user1", "NewPassword123");
        authController.guestLogin();
    }
}