/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import control.EmailSessionBean;
import control.connection;
import control.problem_save;
import control.random_no;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "report_problem", urlPatterns = {"/report_problem"})
public class report_problem extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    @EJB
    private EmailSessionBean emailBean;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String name=request.getParameter("name");
        String email=request.getParameter("email");
        String mobile=request.getParameter("mobile");
        String problem=request.getParameter("problem");
        problem_save ps=new problem_save();
        if(!ps.emailCheck(email))
        {
        random_no rn=new random_no();
        int n=rn.getnum();
        String n1=Integer.toString(n);
                         HttpSession session=request.getSession();
            session.setAttribute("n1", n1);
            
            emailBean.sendEmail(email, "varification code", n1);

            

        Connection con=null;
        con=connection.getConnectivity();
        out.println("<!DOCTYPE html>\n" +
"<html lang=\"en\">\n" +
"<head>\n" +
"<title>Report Problem</title>\n" +
"<meta charset=\"utf-8\">\n" +
"<meta name = \"format-detection\" content = \"telephone=no\" />\n" +
"<link rel=\"icon\" href=\"images/favicon.ico\">\n" +
"<link rel=\"shortcut icon\" href=\"images/favicon.ico\" />\n" +
"<link rel=\"stylesheet\" href=\"booking/css/booking.css\">\n" +
"<link rel=\"stylesheet\" href=\"css/stuck.css\">\n" +
"<link rel=\"stylesheet\" href=\"css/style.css\">\n" +
"<script src=\"js/jquery.js\"></script>\n" +
"<script src=\"js/jquery-migrate-1.1.1.js\"></script>\n" +
"<script src=\"js/script.js\"></script> \n" +
"<script src=\"js/superfish.js\"></script>\n" +
"<script src=\"js/jquery.equalheights.js\"></script>\n" +
"<script src=\"js/jquery.mobilemenu.js\"></script>\n" +
"<script src=\"js/jquery.easing.1.3.js\"></script>\n" +
"<script src=\"js/tmStickUp.js\"></script>\n" +
"<script src=\"js/jquery.ui.totop.js\"></script>\n" +
"    <script src=\"booking/js/booking.js\"></script>\n" +
"\n" +
"<script>\n" +
" $(document).ready(function(){\n" +
"\n" +
"  $().UItoTop({ easingType: 'easeOutQuart' });\n" +
"  $('#stuck_container').tmStickUp({});\n" +
"\n" +
"  }); \n" +
"</script>\n" +
"\n" +
"</head>\n" +
"\n" +
"<body>\n" +
"<!--==============================\n" +
"              header\n" +
"=================================-->\n" +
"<header>\n" +
"<!--==============================\n" +
"            Stuck menu\n" +
"=================================-->\n" +
"  <section id=\"stuck_container\">\n" +
"    <div class=\"container\">\n" +
"      <div class=\"row\">\n" +
"        <div class=\"grid_12\">\n" +
"        <h1>\n" +
"          <a href=\"index.html\">\n" +
"            <img src=\"images/logo.png\" alt=\"Logo alt\" height=\"150\" width=\"200\">\n" +
"          </a>\n" +
"        </h1>  \n" +
"          <div class=\"navigation \">\n" +
"            <nav>\n" +
"              <ul class=\"sf-menu\">\n" +
"               <li><a href=\"index.jsp\">Home</a></li>\n" +
"               <li><a href=\"index1\">Restaurants</a></li>\n" +
"               <li class=\"current\"><a href=\"index-2.jsp\">Report Problem</a></li>\n" +
"               <li><a href=\"index-3.jsp\">Blogs</a></li>\n" +
"               <li><a href=\"index-4.jsp\">Contacts</a></li>\n" +
"               <li>");
                

                    String id=(String) session.getAttribute("id");
                   if(id!=null)
                    {
                      out.println("welcome : "+id+"<br><a href=logout>logout</a>");
                  } 
                   else{
                       out.println("<a href=user_login.jsp>login</a>");
                   }
out.println("                   </li>\n" +
"             </ul>\n" +
"            </nav>       \n" +
"            <div class=\"clear\"></div>\n" +
"          </div>\n" +
"        </div>\n" +
"      </div>\n" +
"    </div>\n" +
"  </section> \n" +
"</header>        \n" +
"\n" +
"<!--=====================\n" +
"          Content\n" +
"======================-->\n" +
"<section class=\"content\">\n" +
"  <div class=\"container\">\n" +
"    <div class=\"row\">\n" +
"      <div class=\"grid_8\">\n" +
"        <h2>Express your view</h2>\n" +
"        <img src=\"images/11.jpg\" alt=\"\" class=\"img_inner fleft inn__1\">\n" +
"        <div class=\"extra_wrapper\">\n" +
"          <div class=\"text1 tx__1\"><a href=\"#\">We would welcome suggestions and complains </a></div>\n" +
"               <form name=\"f1\" action=\"report_prob_check\" method=\"post\">\n" +
"                <fieldset>\n" +
"                     <dl>\n" +
"                        <dt><label >Name:</label></dt>\n" +
"                        <dd><input type=\"text\" name=\"name\" value=\""+name+"\" id=\"name_id\" size=\"54\" required maxlength=\"30\" readonly required pattern=\"[a-zA-Z ]+\" title=\"only alphabet and space\"/><font color=\"#FF0000\"></font>						\n" +
"						</dd>\n" +
"                    </dl>\n" +
"                     <dl>\n" +
"                        <dt><label >Email Id:</label></dt>\n" +
"                        <dd><input type=\"email\" name=\"email\" value=\""+email+"\" id=\"email_id\" size=\"54\" readonly required /><font color=\"#FF0000\"></font>						\n" +
"						</dd>\n" +
"                    </dl>\n" +
"                     <dl>\n" +
"                        <dt><label >Mobile:</label></dt>\n" +
"                        <dd><input type=\"text\" name=\"mobile\" value=\""+mobile+"\" id=\"mobile_id\" size=\"54\" readonly required pattern=\"[0-9]{10}\" size=\"54\" maxlength=\"10\" required title=\"valid mobile no\"/><font color=\"#FF0000\"></font>						\n" +
"						</dd>\n" +
"                    </dl>\n" +
"                     <dl>\n" +
"                        <dt><label >Problem</label></dt>\n" +
"                        <dd><textarea name=\"problem\" maxlength=\"200\" style=\" height:100px; width: 340px;\" readonly required>"+problem+"</textarea><font color=\"#FF0000\"></font>						\n" +
"						</dd>\n" +
"                    </dl><br/>\n" +
"                    <dl>\n" +
"                        <dt><label >enter verification code</label></dt>\n" +
"                        <dd><input type=\"text\" name=\"code\" min=\"1\" max=\"99999999\" maxlength=\"8\" required pattern=\"[0-9]+\" title=\"enter valid code\"/><font color=\"#FF0000\"></font>						\n" +
"						</dd>\n" +
"                    </dl><br/>\n" +
"                     <dl class=\"submit\">\n" +
"                         <input type=\"submit\" name=\"submit\" id=\"submit\" value=\"submit\" /> &nbsp;&nbsp;&nbsp;&nbsp;\n" +
"                         \n" +
"                     </dl>\n" +
"                    \n" +
"                </fieldset>\n" +
"                \n" +
"         </form>\n" +
"        </div>\n" +
"        <div class=\"clear\"></div>\n" +
"        \n" +
"      </div>\n" +
"      <div class=\"grid_4\">\n" +
"\n" +
"      </div>\n" +
"    </div>\n" +
"  </div>\n" +
"</section>\n" +
"<!--==============================\n" +
"              footer\n" +
"=================================-->\n" +
"<footer id=\"footer\">\n" +
"  <div class=\"container\">\n" +
"    <div class=\"row\">\n" +
"      <div class=\"grid_12\">  \n" +
"        <div class=\"socials\">\n" +
"          <a href=\"#\">Site Map</a>\n" +
"\n" +
"        </div>\n" +
"        <div class=\"copyright\"><span class=\"brand\">Food Safety Portal </span> &copy; <span id=\"copyright-year\"></span>  <div>Website designed by <a href=\"#\">Manish, Vivek, Xavier</a></div>\n" +
"        </div>\n" +
"      </div>\n" +
"    </div>\n" +
"  </div> \n" +
"</footer>  \n" +
"</body>\n" +
"</html>\n" +
"\n" +
"");
        }
        else
        {
            random_no rn=new random_no();
            int p=rn.getnum();
            String s = Integer.toString(p);
            ps.insertProb(s, name, email, mobile, problem);
            out.println("<center><h1><font color=\"blue\">your problem reported</font></h3><center>");
            RequestDispatcher reqd;
            reqd = request.getRequestDispatcher("index-2.jsp");
            reqd.include(request, response);
        }
//        try {    
//            PreparedStatement pstmt=con.prepareStatement("insert into problems ()");
//            ResultSet rs=pstmt.executeQuery();
//            ResultSetMetaData rsmd=rs.getMetaData();
//            
//            rs.next();            
//                            
//            RequestDispatcher reqd;
//            reqd = request.getRequestDispatcher("admin_edit.jsp");
//            reqd.forward(request, response);
//        } catch (SQLException ex) {
//            Logger.getLogger(admin_edit.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
