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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {

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
        HttpSession session=request.getSession();
        
         String id=request.getParameter("id");
        String pw=request.getParameter("pw");
        out.println("hello");
         try
        {
        Connection con=null;
        con=connection.getConnectivity();
        PreparedStatement pstmt=con.prepareStatement("select"
                + " name,password from fsp_user");
        ResultSet rs=pstmt.executeQuery();
        ResultSetMetaData rsmd=rs.getMetaData();
       while(rs.next())
       {
           
           if(id.equals(rs.getString(1)) && pw.equals(rs.getString(2)))
           {
               session.setAttribute("id", id);
               session.setAttribute("pw", pw);
               
               RequestDispatcher reqd;
            reqd = request.getRequestDispatcher("index.jsp");
            reqd.forward(request, response);
            
           }
           
       }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
               out.println("<h1 align=\"center\"><font style=\" color: #f00; \">Invalid User name OR Password</font></h1>");
             RequestDispatcher reqd;
            reqd = request.getRequestDispatcher("user_login.jsp");
            reqd.include(request, response);
        
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
