package profile_pack;
import java.sql.*;
import user_pack.*;
public class ProfileDAO {
     static Connection currentConnection = null;
    static Statement statement = null;
    static ResultSet rs = null;
   public static boolean changename(UserBean user , String name)throws ClassNotFoundException{
       String updatequery  = "UPDATE user SET username = '" + name + "' WHERE username = '" + user.getusername() + "' AND password = '"
               + user.getpassword() + "';";
        System.out.println(updatequery);
       try{
            Class.forName("com.mysql.jdbc.Driver");
            currentConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_rental","root","localhost");
            statement = currentConnection.createStatement();
            statement.executeUpdate(updatequery);
            user.setusername(name);
       }catch(Exception e){
            return false;
       }
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
       return true;
   }
   public static boolean changeemail(UserBean user , String email) throws ClassNotFoundException {
        String updatequery  = "UPDATE user SET email = '" + email + "' WHERE username = '" + user.getusername() + "' AND password = '"
               + user.getpassword() + "';";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            currentConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_rental","root","localhost");
            statement = currentConnection.createStatement();
            statement.executeUpdate(updatequery);
            user.setemail(email);
        }catch(Exception e){
            return false;
        }
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
        return true;
        
   }
    public static boolean deleteaccount(UserBean user) throws ClassNotFoundException {
        String updatequery  = "DELETE FROM user WHERE username = '" + user.getusername() + "' AND password = '"
               + user.getpassword() + "';";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            currentConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_rental","root","localhost");
            statement = currentConnection.createStatement();
            statement.executeUpdate(updatequery);
           
        }catch(Exception e){
            return false;
        }
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
        return true;
        
   }
     public static boolean changepassword(UserBean user , String pass) throws ClassNotFoundException {
        String updatequery  = "UPDATE user SET password = '" + pass + "' WHERE username = '" + user.getusername() + "' AND password = '"
               + user.getpassword() + "';";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            currentConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_rental","root","localhost");
            statement = currentConnection.createStatement();
            statement.executeUpdate(updatequery);
            user.setpassword(pass);
        }catch(Exception e){
            return false;
        }
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
        return true;
        
   }
}
