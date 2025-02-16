package arabianLogistics.ArabianLogistics.data.model;
import lombok.*;



public class User{
    private String name;
    private String email;
    private String password;

@Setters
@Getter

    public void addUser(){
        User user = new User();
        user.setName("John");
      
    }
    
}