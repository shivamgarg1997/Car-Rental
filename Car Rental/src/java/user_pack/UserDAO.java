package user_pack;
import static java.awt.Event.INSERT;
import java.sql.*;
public class UserDAO{
    static Connection currentConnection = null;
    static Statement statement = null;
    static ResultSet rs = null;
    public static UserBean login(UserBean user) throws ClassNotFoundException{
         String searchQuery = "SELECT * FROM `car_rental`.user WHERE username='" + user.getusername() 
                + "' AND password='" + user.getpassword() + "'";
         
         try{
             Class.forName("com.mysql.jdbc.Driver");
            currentConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_rental","root","localhost");
            statement = currentConnection.createStatement();
            rs = statement.executeQuery(searchQuery);
            System.out.println(searchQuery);
            if(rs.next()){
                user.setusername(rs.getString("username"));
                user.setpassword(rs.getString("password"));
                user.setposition(rs.getString("position"));
                user.setemail(rs.getString("email"));
                user.setcount(rs.getInt("count"));
                user.setvalid(true);
                System.out.println(user.getusername());
                System.out.println(user.isvalid());
                
            }
            else{
                user.setvalid(false);
            }
         }catch(SQLException ex){}
            finally{
              if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {System.out.println(e);}
                rs = null;
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {System.out.println(e);}
                statement = null;
            }
            if (currentConnection != null) {
                try {
                    currentConnection.close();
                } catch (SQLException e) {System.out.println(e);}
                currentConnection = null;
            }
         }
    return user;
    }
    public static UserBean signup(UserBean user) throws ClassNotFoundException{
        String insertquery = "INSERT INTO user (username,password,position,email,count) VALUES ('" + user.getusername() +"','"
                + user.getpassword() + "','" + user.getposition() + "','" + user.getemail() + "',0);" ;
                System.out.println(insertquery);
        try{
            System.out.println("hi");
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("hello");
            currentConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_rental","root","localhost");
            System.out.println("okay1");
            statement = currentConnection.createStatement();
            System.out.println("okay2");
            statement.executeUpdate(insertquery);
            System.out.println("okay3");
            user.setvalid(true);
            
        }catch(SQLException ex){}
        finally{
              if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {System.out.println(e);}
                rs = null;
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {System.out.println(e);}
                statement = null;
            }
            if (currentConnection != null) {
                try {
                    currentConnection.close();
                } catch (SQLException e) {System.out.println(e);}
                currentConnection = null;
            }
         }
        return user;
    }
}

