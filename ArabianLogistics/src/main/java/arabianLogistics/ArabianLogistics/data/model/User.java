package arabianLogistics.ArabianLogistics.data.model;
import lombok.*;


@Setter
@Getter
public class User{
    private String name;
    private String email;
    private String password;



    public void addUser(){
        User user = new User();
        user.setName("John");
      
    }
    
}