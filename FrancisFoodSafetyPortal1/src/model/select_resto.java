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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "select_resto", urlPatterns = {"/select_resto"})
public class select_resto extends HttpServlet {
    private String i;

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
"<title>Restaurants</title>\n" +
"<meta charset=\"utf-8\">\n" +
"<meta name = \"format-detection\" content = \"telephone=no\" />\n" +
"<link rel=\"icon\" href=\"images/favicon.ico\">\n" +
"<link rel=\"shortcut icon\" href=\"images/favicon.ico\" />\n" +
"<link rel=\"stylesheet\" href=\"css/stuck.css\">\n" +
"<link rel=\"stylesheet\" href=\"css/style.css\">\n" +
"<link rel=\"stylesheet\" href=\"css/touchTouch.css\">\n" +
"<script src=\"js/jquery.js\"></script>\n" +
"<script src=\"js/jquery-migrate-1.1.1.js\"></script>\n" +
"<script src=\"js/script.js\"></script> \n" +
"<script>  \n" +
"var request;  \n" +
"function sendInfo()  \n" +
"{  \n" +
"var v=document.vinform.state.value;  \n" +
"var url=\"select_city?val=\"+v;  \n" +
"  \n" +
"if(window.XMLHttpRequest){  \n" +
"request=new XMLHttpRequest();  \n" +
"}  \n" +
"else if(window.ActiveXObject){  \n" +
"request=new ActiveXObject(\"Microsoft.XMLHTTP\");  \n" +
"}  \n" +
"  \n" +
"try  \n" +
"{  \n" +
"request.onreadystatechange=getInfo;  \n" +
"request.open(\"GET\",url,true);  \n" +
"request.send();  \n" +
"}  \n" +
"catch(e)  \n" +
"{  \n" +
"alert(\"Unable to connect to server\");  \n" +
"}  \n" +
"}  \n" +
"  \n" +
"function getInfo(){  \n" +
"if(request.readyState===4){  \n" +
"var val=request.responseText;  \n" +
"document.getElementById('cities').innerHTML=val;  \n" +
"}  \n" +
"}  \n" +
"  \n" +
"</script> \n" +
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
"<script>  \n" +
"var request;  \n" +
"function sendInfo1()  \n" +
"{  \n" +
"var v=document.vinform.cities.value;  \n" +
"var url=\"select_resto?val=\"+v;  \n" +
"  \n" +
"if(window.XMLHttpRequest){  \n" +
"request=new XMLHttpRequest();  \n" +
"}  \n" +
"else if(window.ActiveXObject){  \n" +
"request=new ActiveXObject(\"Microsoft.XMLHTTP\");  \n" +
"}  \n" +
"  \n" +
"try  \n" +
"{  \n" +
"request.onreadystatechange=getInfo;  \n" +
"request.open(\"GET\",url,true);  \n" +
"request.send();  \n" +
"}  \n" +
"catch(e)  \n" +
"{  \n" +
"alert(\"Unable to connect to server\");  \n" +
"}  \n" +
"}  \n" +
"  \n" +
"function getInfo(){  \n" +
"if(request.readyState===4){  \n" +
"var val=request.responseText;  \n" +
"document.getElementById('resto').innerHTML=val;  \n" +
"}  \n" +
"}  \n" +
"  \n" +
"</script> \n"+
"\n" +
"</head>\n" +
"\n" +
"<body class=\"page1\" id=\"top\">\n" +
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
"          <div class=\"navigation\">\n" +
"            <nav>\n" +
"              <ul class=\"sf-menu\">\n" +
"               <li><a href=\"index.jsp\">Home</a></li>\n" +
"               <li class=\"current\"><a href=\"index-1.jsp\">Restaurants</a></li>\n" +
"               <li><a href=\"index-2.jsp\">Report Problem</a></li>\n" +
"               <li><a href=\"index-3.jsp\">Blogs</a></li>\n" +
"               <li><a href=\"index-4.jsp\">Contacts</a></li>\n" +
"               <li><a href=\"index-5.jsp\">Keep your food safe</a></li>");
        
            
                   
        out.println("</ul>\n" +
"            </nav>        \n" +
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
"======================-->\n" );
        

                
                
out.println("<section class=\"content gallery pad1\">\n" +
"  <div class=\"container\">\n" +
"    <div class=\"row\">\n" );
        out.println("<form name=\"vinform\" action=\"select_resto\">" );
                    out.print("<h5>SEARCH RESTURANT</H5>\n" +
"                <table>\n" +
"                    <tr>\n" +
"                        <td>");
                    PreparedStatement pstmt,stmt;
                    ResultSet rs=null,rs1=null;
        try {
            pstmt = con.prepareStatement("select distinct states from fsp_states");
            rs=pstmt.executeQuery();
            ResultSetMetaData rsmd=rs.getMetaData();
        } catch (SQLException ex) {
            Logger.getLogger(index1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            out.println("<select name=\"state\" onChange=\"sendInfo();\">");
            out.println("<option value=\"\">....SELECT....</option>");

            while(rs.next()){      
                   out.println("<option value=\""+rs.getString(1)+"\" name=\""+rs.getString(1)+"\">"+rs.getString(1)+"</option>");                   
            }
            out.println("</select>");
        } catch (SQLException ex) {
            Logger.getLogger(index1.class.getName()).log(Level.SEVERE, null, ex);
        }
        String city=request.getParameter("cities");
                    int i=2,f=0;

                    if(city.equals("RANCHI"))
                    {
                         RequestDispatcher reqd;
            reqd = request.getRequestDispatcher("resto_ranchi.jsp");
            reqd.forward(request, response);
                    }
                    else
                    {
                    
                    
        try {
            stmt=con.prepareStatement("select * from fsp_resto where city='"+city+"'");
            rs1=stmt.executeQuery();

        } catch (SQLException ex) {
            Logger.getLogger(select_resto.class.getName()).log(Level.SEVERE, null, ex);
        }
        out.println("<br/>");
        try {
            while(rs1.next())
            {
                f++;
                 out.println("  <div class=\"grid_4\">\n" +
    "        <div class=\"gall_block\">\n" +
    "          <div class=\"maxheight\">\n" +
    "              <a ><img src=\"images/"+i+".jpg\" alt=\"\" height=\"268\" width=\"365\"></a>\n" +
    "            <div class=\"gall_bot\">\n" +
    "            <div class=\"text1\"><a href=\"#\">");
            try {
                out.println(rs1.getString(2));
            } catch (SQLException ex) {
                Logger.getLogger(select_resto.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                out.println(" </a></div>\n" +
    "           Address:- "+rs1.getString(3)+"<br><br>\n" +
    "           Ratings:- "+rs1.getString(7)+"of 5 \n" +
    "                      \n" +
    "            <br>\n" +
    "            <a href=\"Menu"+i+".html\" class=\"btn\">Menu</a>\n" +
    "            </div>\n" +
    "          </div>\n" +
    "        </div>\n" +
    "      </div>\n" );
            } catch (SQLException ex) {
                Logger.getLogger(select_resto.class.getName()).log(Level.SEVERE, null, ex);
            }
            i++;
            if(i==4)
            {
                i=2;
            }
            }
        } catch (SQLException ex) {
            Logger.getLogger(select_resto.class.getName()).log(Level.SEVERE, null, ex);
        }
             
         }
                    if(f==0)
                    {
                        out.println("sorry for inconvinience. This page will be added soon");
                    }
                          
                    
out.println("</form> </td> ");
out.println("<td> &nbsp&nbsp&nbsp&nbsp<span id=\"cities\"> </span><span id=\"resto\"> </span></td>\n" +
"                    </tr>\n" +
"                </table>  " +
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
"</footer> \n" +
"</body>\n" +
"</html>\n" +
"\n" +
"");
       
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
