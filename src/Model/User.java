package Model;

/**
 * Created by Sebastian on 27-11-2015.
 */
public class User {
    private long id;
    private String firstname;
    private String lastname;
    private String email;
    private String username;
    private String password;
    private String status;
    private int type;
    private String created;
    /**
     * Getter and setter for user class, so i can get and set them in the other classes.
     */
    public User (){

    }

    public long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getStatus() {
        return status;
    }

    public int getType() {
        return type;
    }

    public String getCreated() {
        return created;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setCreated(String created) {
        this.created = created;
    }
}
