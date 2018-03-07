package unidue.ub.services.settingsbackend.model;

public class UserInformation {

    private String username;

    private String email;

    public UserInformation() {}

    public UserInformation(String username, String email) {
        this.email = email;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
