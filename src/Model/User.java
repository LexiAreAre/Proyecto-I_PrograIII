package Model;

// this class will be used in a future to get better data savings while writing on external files or data bases

public class User {
    private String username;
    private String password;

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public String print(){
        return "Username: " + username + "\n"
                + "Password: " + password + "\n";
    }
}
