package classes;

public class User {

    private String name;
    private String password;

    private User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    static private User _instance = null;

    static public User instance(String name, String password) {
        if (_instance == null) {
            _instance = new User(name, password);
        }
        return _instance;
    }

}
