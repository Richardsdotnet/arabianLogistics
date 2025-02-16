package arabianLogistics.ArabianLogistics.data.model;



@Setter
@Getter
public class User{
    private String name;
    private String email;
    private String password;
  
public void setName(String name){
    this.name = name;
}
public String getName(){
    return this.name;
}

    public void addUser(){
        User user = new User();
        user.setName("John");
        System.out.println(user);
      
    }
    
}