package roles;

abstract public class Roles {
    private String typeOfAccess;//can be enum
    private int id;
    private String fullname;
    private String emailaddress;
    private String phoneNumber;

    Roles(){}

    Roles(String typeOfAccess,int id, String fullname, String emailaddress, String phoneNumber){
        this.typeOfAccess = typeOfAccess;
        this.id = id;
        this.fullname = fullname;
        this.emailaddress = emailaddress;
        this.phoneNumber = phoneNumber;
    }

    public String getTypeOfAccess() {
        return typeOfAccess;
    }

    public void setTypeOfAccess(String typeOfAccess) {
        this.typeOfAccess = typeOfAccess;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
