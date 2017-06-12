
package car_pack;
import user_pack.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class carinfo extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        UserBean user = (UserBean) request.getSession(false).getAttribute("user");
        String name = user.getusername();
        ArrayList car = CarDAO.carinfo(user);
            request.getSession(true).setAttribute("car", car);
            response.sendRedirect("carinfo.jsp");
    }

}
