package user_pack;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/loginservlet"})
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        UserBean user = new UserBean();
        user.setusername(request.getParameter("uid"));
        user.setpassword(request.getParameter("pass"));
        System.out.println("username is " + user.getusername() + "password is " + user.getpassword());
        try{
             user = UserDAO.login(user);
             if(user.isvalid()){
                 request.getSession(true).setAttribute("user", user);
                response.sendRedirect("welcome.jsp");
             }
             else{
                 response.sendRedirect("Invalidlogin.jsp");
             }
        }catch(ClassNotFoundException e){}
        
    }
}
