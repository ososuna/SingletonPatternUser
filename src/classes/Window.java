package classes;

import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Window extends JFrame {
    
    private User user;
    private Date date;
    private SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private JPanel panel;
    private JLabel titleLabel;
    private JLabel dateLabel;

    private Window(User user) {
        
        this.user = user;
        this.date = new Date();

        JLabel usernameLabel;

        setSize(400, 200);
        setTitle("Login Successful");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200, 200));
        
        panel = new JPanel();
        panel.setLayout(null);
        
        titleLabel = new JLabel("Login Successful");
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        titleLabel.setSize(200, 40);
        titleLabel.setLocation(20, 10);
        panel.add(titleLabel);
        
        usernameLabel = new JLabel("User: " + user.getUsername());
        usernameLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        usernameLabel.setSize(200, 20);
        usernameLabel.setLocation(20, 70);
        panel.add(usernameLabel);

        dateLabel = new JLabel("Logged in at " + formatter.format(date));
        dateLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        dateLabel.setSize(300, 20);
        dateLabel.setLocation(20, 110);
        panel.add(dateLabel);

        this.getContentPane().add(panel);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private Window() {

        this.date = new Date();

        setSize(400, 200);
        setTitle("Login Failed");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200, 200));
        
        panel = new JPanel();
        panel.setLayout(null);
        
        titleLabel = new JLabel("Login Failed");
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        titleLabel.setSize(200, 40);
        titleLabel.setLocation(20, 10);
        panel.add(titleLabel);
        
        dateLabel = new JLabel("Login failed at " + formatter.format(date));
        dateLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        dateLabel.setSize(300, 20);
        dateLabel.setLocation(20, 60);
        panel.add(dateLabel);

        this.getContentPane().add(panel);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    static private Window _instance = null;

    static public Window instance(User user) {
        if (_instance == null) {
            _instance = new Window(user);
        }
        return _instance;
    }
    
    static public Window instance() {
        if (_instance == null) {
            _instance = new Window();
        }
        return _instance;
    }



}
