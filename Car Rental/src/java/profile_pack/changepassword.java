
package profile_pack;
import user_pack.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class changepassword extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String name = request.getParameter("usename");
        String oldpass = request.getParameter("oldpass");
        String password = request.getParameter("newpass");
        UserBean user = (UserBean) request.getSession(false).getAttribute("user");
        String pass = user.getpassword();
                if(user.getpassword().equals(oldpass)){
             try{
                boolean done = ProfileDAO.changepassword(user , password);
                if(done){
                response.sendRedirect("profile.jsp");
                }
             }catch(Exception e){}   
        }
        else{
            response.sendRedirect("invalidpassword.jsp");
        }
    }

}
