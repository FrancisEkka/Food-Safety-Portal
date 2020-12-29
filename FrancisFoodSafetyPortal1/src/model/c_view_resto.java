/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import control.connection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "c_view_resto", urlPatterns = {"/c_view_resto"})
public class c_view_resto extends HttpServlet {

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
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Connection con=null;
        con=connection.getConnectivity();
        
                out.println("<!DOCTYPE html>\n" +
"<html lang=\"en\">\n" +
"<head>\n" +
"    \n" +
"<title>View User</title>\n" +
"<meta charset=\"utf-8\">\n" +
"<meta name = \"format-detection\" content = \"telephone=no\" />\n" +
"<link rel=\"icon\" href=\"images/favicon.ico\">\n" +
"<link rel=\"shortcut icon\" href=\"images/favicon.ico\" />\n" +
"<link rel=\"stylesheet\" href=\"css/stuck.css\">\n" +
"<link rel=\"stylesheet\" href=\"css/style.css\">\n" +
"<link rel=\"stylesheet\" href=\"css/touchTouch.css\">\n" +
"<link rel=\"stylesheet\" href=\"css/style_1.css\" type=\"text/css\"/>\n" +
"<link rel=\"stylesheet\" href=\"css/niceforms-default.css\" type=\"text/css\">\n" +
"<link rel=\"stylesheet\" href=\"css/niceforms-default.css\" type=\"text/css\"/>\n" +
"\n" +
"\n" +
"\n" +
"<script src=\"js/jquery.js\"></script>\n" +
"<script src=\"js/jquery-migrate-1.1.1.js\"></script>\n" +
"<script src=\"js/script.js\"></script> \n" +
"<script src=\"js/superfish.js\"></script>\n" +
"<script src=\"js/jquery.equalheights.js\"></script>\n" +
"<script src=\"js/jquery.mobilemenu.js\"></script>\n" +
"<script src=\"js/jquery.easing.1.3.js\"></script>\n" +
"<script src=\"js/tmStickUp.js\"></script>\n" +
"<script src=\"js/jquery.ui.totop.js\"></script>\n" +
"<script src=\"js/touchTouch.jquery.js\"></script>\n" +
"\n" +
"<script>\n" +
" $(document).ready(function(){\n" +
"\n" +
"  $().UItoTop({ easingType: 'easeOutQuart' });\n" +
"  $('#stuck_container').tmStickUp({});\n" +
"  $('.gallery .gall_item').touchTouch();\n" +
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
"              <img src=\"images/logo.png\" alt=\"Logo alt\" height=\"150\" width=\"200\">\n" +
"          </a>\n" +
"        </h1>  \n" +
"          <div class=\"navigation \">\n" +
"            <nav>\n" +
"              <ul class=\"sf-menu\">\n" +
"               <li><a href=\"index.jsp\">Home</a></li>\n" +
"               <li><a href=\"index-1.jsp\">Restaurants</a></li>\n" +
"               <li><a href=\"index-2.jsp\">Report Problem</a></li>\n" +
"               <li><a href=\"index-3.jsp\">Blogs</a></li>\n" +
"               <li><a href=\"index-4.jsp\">Contacts</a></li>\n" +
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
"<section class=\"content gallery pad1\">\n" +
"  <div class=\"container\">\n" +
"      <div class=\"left_content\">\n" +
"          \n" +
"            <div class=\"sidebarmenu\">\n"
                        + " <div class=\"submenu\">\n" +
"                    <ul>\n" +
"                        <li><h2><a href=\"city_employee_home.jsp\">City Employee Home</a></h2></li>\n" +
"                        \n" +
"                    </ul>\n" +
"                </div>" +
"          \n" +
"                <div class=\"submenu\">\n" +
"                    <ul>\n" +
"                        <li><h2><a href=\"#\">New Entries</a></h2></li>\n" +
"                    <li><a href=\"c_entry_new_resto.jsp\">Restaurants</a></li>\n" +
"                    </ul>\n" +
"                </div>\n" +
"                <br/><br/>\n" +
"                <div class=\"submenu\">\n" +
"                    <ul>\n" +
"                        <li class=\"current1\"><h2><a href=\"#\">Views</a></h2></li>\n" +
"                        <li><a href=\"c_view_user\">User</a></li>\n" +
"                    <li class=\"current2\"><a href=\"c_view_resto\">Restaurants</a></li>\n" +
"                    <li><a href=\"c_view_report\">Reports</a></li>\n" +
"                    <li><a href=\"c_view_sugg\">Suggestions</a></li>\n" +
"                    </ul>\n" +
"                </div>\n" +
"                \n" +
"                <a href=\"city_employee_edit\"><font style=\" color:  springgreen\">Edit Profile</font></a>\n" +
"                <br/>\n" +
"                <a href=\"logout\"><font style=\" color: tomato\">Logout</font></a>\n" +
"                    \n" +
"            </div>\n" +
"      </div>\n" +
"      <div class=\"right_content\">\n" +
"          <a><h1 align=\"center\"><font style=\"font-size: 16px\">View Restaurants</font></h1></a><br/><br/><br/>\n" +
"          <table style=\"text-align: center; width:1000px;\">\n" +
"              <th ><a>S.no</a></th>\n" +
"              <th><a>Name</a></th>\n" +
"              <th><a>Address</a></th>\n" +
"              <th><a>Contacts</a></th>\n" +
"              <th><a>url</a></th>\n" +
"              <th><a>Email Id</a></th>\n" +
"              <th><a>Rating</a></th>\n" +
"              <th><a>Famous Food</a></th>\n" +
"              <th><a>State</a></th>\n" +
"              <th><a>City</a></th>\n" +
"              <th><a>Edit</a></th>\n" +
"              <th><a>Delete</a></th>\n"); 
        
        try {        
        PreparedStatement pstmt;
            pstmt = con.prepareStatement("select"        
                     + " * from fsp_resto");
            ResultSet rs=pstmt.executeQuery();
            ResultSetMetaData rsmd=rs.getMetaData();
            
            while(rs.next())
            {
        
        out.println("              <tr>                  \n" );
        out.println("    <td>"+rs.getString(1)+"</td>\n" +
"                  <td>"+rs.getString(2)+"</td>\n" +
"                  <td>"+rs.getString(3)+"</td>\n" +
"                  <td>"+rs.getString(4)+"</td>\n" +
"                  <td>"+rs.getString(5)+"</td>\n" +
"                  <td>"+rs.getString(6)+"</td>\n" +
"                  <td>"+rs.getString(7)+"</td>\n" +
"                  <td>"+rs.getString(8)+"</td>\n" +
"                  <td>"+rs.getString(9)+"</td>\n" +
"                  <td>"+rs.getString(10)+"</td>\n" );

        out.println("<td><img src=\"images/trash.png\"/></td>\n" +
"                  <td><img src=\"images/user_edit.png\"/></td>\n" +
"              </tr>\n" );
            }
        } catch (SQLException ex) {
            Logger.getLogger(view_user.class.getName()).log(Level.SEVERE, null, ex);
        }
        out.println("          </table>\n" +
"      </div>\n" +
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
"        <div class=\"copyright\"><span class=\"brand\">Food Safety Portal </span> &copy; <span id=\"copyright-year\"></span> | <a href=\"#\">Privacy Policy</a> <div>Website designed by <a href=\"#\">Manish, Vivek, Xavier</a></div>\n" +
"        </div>\n" +
"      </div>\n" +
"    </div>\n" +
"  </div> \n" +
"</footer> \n" +
"</body>\n" +
"</html>");
        
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
