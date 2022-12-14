package Model;

import java.io.Serializable;

public class Profile implements Serializable {
    private String name;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Profile() {
        name = "";
    }
    public Profile(String n, String e) {
        name = n;
        email =e;
    }
}
