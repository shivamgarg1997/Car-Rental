
package profile_pack;
import user_pack.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class changeemail extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String password = request.getParameter("pass");
        String email = request.getParameter("newemail");
        UserBean user = (UserBean) request.getSession(false).getAttribute("user");
        if (user.getpassword().equals(password)){
         try{
                boolean done = ProfileDAO.changeemail(user , email);
                if(done){
                response.sendRedirect("profile.jsp");
                }
             }catch(Exception e){}
        }
        else{
            response.sendRedirect("invalidemail.jsp");
        }
    }

}
