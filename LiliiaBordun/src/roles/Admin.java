package roles;

import roles.Roles;

public class Admin extends Roles {
    private String login;
    private String password;

Admin (){}
    Admin(String login, String password){
    this.login = login;
    this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
