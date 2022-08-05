package roles;

public class Client extends Roles {
    private String city;
    private String address;
    private String password;

    Client(){}

    Client(String city, String address, String password){
        this.city = city;
        this.address = address;
        this.password = password;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
