package arabianLogistics.ArabianLogistics.data.model;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User{
    private String name;
    private String email;
    private String password;
  

    public void addUser(){
        User user = new User();
        user.setName("John");
        System.out.println(user.toString());
      
    }
    
}