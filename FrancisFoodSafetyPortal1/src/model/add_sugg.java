/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import control.connection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Manish
 */
@WebServlet(name = "add_sugg", urlPatterns = {"/add_sugg"})
public class add_sugg extends HttpServlet {

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
            String name=request.getParameter("name");
            String email=request.getParameter("email");
            String mobile=request.getParameter("mobile");
            String msg=request.getParameter("message");
            Double mobile1 = Double.parseDouble(mobile);

            try {
            Connection con=null;
            con=connection.getConnectivity();
            PreparedStatement pstmt=con.prepareStatement("insert into food_safety_portal.fsp_sugg"
                    + "(NAME,EMAIL,MOBILE,message,date)"
                    + "values(?,?,?,?,?)");
            
            java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
            
            pstmt.setString(1,name);
            pstmt.setString(2,email);
            pstmt.setDouble(3,mobile1);
            pstmt.setString(4,msg);
            pstmt.setDate(5, sqlDate);

            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(add_sugg.class.getName()).log(Level.SEVERE, null, ex);
        }
            out.println("<center><h1><font color=\"blue\">Thank you for your valuable suggestion<font></h1></center>");
            RequestDispatcher reqd;
            reqd = request.getRequestDispatcher("index-4.jsp");
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
