import java.io.*;
import java.sql.*;
import java.util.Enumeration;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author Swapnil
 */
@WebServlet(urlPatterns = {"/reg"})
public class reg extends HttpServlet{
Connection con=null;
PreparedStatement pst=null;
    @Override
    public void init(ServletConfig config) throws ServletException {
        try{
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        con=DriverManager.getConnection("jdbc:derby://localhost:1527/Student","aptech","aptech");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet reg</title>");            
            out.println("</head>");
            out.println("<body>");
            /*Enumeration en=request.getParameterNames();
                    while(en.hasMoreElements())
                    {
                        String parameter=(String)en.nextElement();
                        String parameterValue =request.getParameter(parameter);
                        out.println(parameterValue);
                    }*/
            String fn=request.getParameter("first_name");
            String ln=request.getParameter("last_name");
            String pass=request.getParameter("password");
            String dob=request.getParameter("birthday");
            String gen=request.getParameter("gender");
            String email=request.getParameter("email");
            String phone=request.getParameter("phone");
            String sub=request.getParameter("subject");
            String name=fn+" "+ln;
            
            try
            {
                pst=con.prepareStatement("Insert into UserInfo values(?,?,?,?,?,?,?)");
                pst.setString(1, name);
                pst.setString(2, pass);
                pst.setString(3, dob);
                pst.setString(4, gen);
                pst.setString(5, email);
                pst.setString(6, phone);
                pst.setString(7, sub);
               
                int i=pst.executeUpdate();
                if(i>0)
                {
                out.println("Record Inserted Successfully");
                response.sendRedirect("index.html");
                }
            }
            catch(Exception e)
            {
                out.println(e.getMessage());
            }
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }



    // </editor-fold>

}
