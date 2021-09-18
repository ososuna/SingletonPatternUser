import java.util.Scanner;

import classes.User;
import classes.Window;

public class App {
    public static void main(String[] args) throws Exception {
        
        // String username;
        // String password;

        // User user;
        
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter username: ");
        // username = scanner.nextLine();

        // System.out.println("Enter password: ");
        // password = scanner.nextLine();
        
        // if (username.equals("SniperMonkey123") &&
        //     password.equals("PasswordMonkey")) {
        //         user = User.instance(username, password);
        // } else {

        // }
    
        Window.instance();
        Window.instance(User.instance("oosuna", "123"));
    }
}
