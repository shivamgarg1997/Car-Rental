package car_pack;
import java.awt.List;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import user_pack.*;
public class CarDAO {
     static Connection currentConnection = null;
    static Statement statement = null;
    static ResultSet rs = null;
    public static ArrayList carinfo(UserBean user){
        String searchquery = "SELECT FROM CAR WHERE owner = '" + user.getusername() + "' and password = '"
                + user.getpassword() + "';";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            currentConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_rental","root","localhost");
            statement = currentConnection.createStatement();
            rs = statement.executeQuery(searchquery);
            ArrayList car = new ArrayList();
            while(rs.next()){
                String car_info = rs.getString("carname") + rs.getString("carstat");
                car.add(car_info);
            }
            return car;
           
        }catch(Exception e){ return null;}
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
    }
    public static ArrayList searchcar(String fdate, String tdate){
         DateFormat format = new SimpleDateFormat("MM, dd, yyyy");
         try {
             Date date = format.parse(fdate);
         } catch (ParseException ex) {
             Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
         
        return avcar;
        }
}
