package model;

public class User {
    private int id;
    private String name;
    private String password;
    private String email;
    private String phone;
    private String address;

    public User(String address, String phone, String email, String password, String name, int id) {
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.name = name;
        this.id = id;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
