package pl.store;

public class User {
    private long id;
    private String login;
    private String password;

    public User (long id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "USER{"
                + "id='" + id + '\''
                + "login='" + login + '\''
                + "}";
    }
}
