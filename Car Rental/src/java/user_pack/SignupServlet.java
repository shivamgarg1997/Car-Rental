package user_pack;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class SignupServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        UserBean user = new UserBean();
        user.setusername(request.getParameter("username"));
        user.setpassword(request.getParameter("password"));
        user.setemail(request.getParameter("email"));
        user.setposition(request.getParameter("position"));
        System.out.println("start");
        try{
            user = UserDAO.signup(user);
            if(user.isvalid()){
                request.getSession(true).setAttribute("user", user);
                if(user.getposition().equals("owner")){
                response.sendRedirect("carentry.jsp");
                }
            }
            else{
                response.sendRedirect("invalidsignup.jsp");
            }
        }catch(ClassNotFoundException e){}
    }    
}
