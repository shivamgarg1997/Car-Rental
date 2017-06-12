package user_pack;
public class UserBean {
    private String username;
    private String password;
    private String position;
    private int count;
    private String email;
    private boolean valid;
   
    public UserBean(){}
    public void setusername(String user){
        username = user;
    }
    public void setpassword(String pass){
        password = pass;
    }
    public void setposition(String pos){
        position = pos;
    }
    public void setvalid(boolean hello){
        valid = hello;
    }
    public boolean isvalid(){
        return valid;
    }
    public String getusername(){
        return username;
    }
    public String getpassword(){
        return password;
    }
    public void setcount(int n){
        count = n;
    }
    public int getcount(){
        return count;
    }
    public void setemail(String mail){
        email = mail;
    }
    public String getemail(){
        return email;
    }
    public String getposition(){
        return position;
    }
     
}
