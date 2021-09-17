package classes;

public class User {

    private String username;
    private String password;

    private User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    static private User _instance = null;

    static public User instance(String username, String password) {
        if (_instance == null) {
            _instance = new User(username, password);
        }
        return _instance;
    }

    @Override
    public String toString() {
        return "User [username=" + username + ", password=" + password + "]";
    }

}
