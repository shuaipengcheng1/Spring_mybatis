package COM.PROVIDER.Domain;

import java.io.Serializable;

public class User implements Serializable {
    public String password;
    public int id;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "password='" + password + '\'' +
                ", id=" + id +
                ", user='" + user + '\'' +
                '}';
    }

    public String user;
}
