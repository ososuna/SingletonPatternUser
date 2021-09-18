import java.util.Scanner;

import classes.User;
import classes.Window;

public class App {
    public static void main(String[] args) throws Exception {
        
        String username;
        String password;

        User user;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter username: ");
        username = scanner.nextLine();

        System.out.print("Enter password: ");
        password = scanner.nextLine();
        
        scanner.close();

        if (username.equals("SniperMonkey123") &&
            password.equals("PasswordMonkey")) {
            user = User.instance(username, password);
            Window.instance(user);    
        } else {
            Window.instance();
        }
    
    }
}
