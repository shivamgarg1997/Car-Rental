
package ride_pack;
import car_pack.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RideBook extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String fdate = request.getParameter("fdate");
        String tdate = request.getParameter("tdate");
       
        try{
            ArrayList availcar = CarDAO.searchcar(String fdate, String tdate);
        }catch(Exception e){}
  
    }
}
