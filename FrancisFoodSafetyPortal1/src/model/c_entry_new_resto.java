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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "c_entry_new_resto", urlPatterns = {"/c_entry_new_resto"})
public class c_entry_new_resto extends HttpServlet {

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
            String address=request.getParameter("address");
            String contact=request.getParameter("contact");
            String url=request.getParameter("url");
            String email=request.getParameter("email");
            String rating=request.getParameter("rating");
            String famous=request.getParameter("famous");
            String state=request.getParameter("state");
            String city=request.getParameter("city");
            Double contact1 = Double.parseDouble(contact);

            try {
            Connection con=null;
            con=connection.getConnectivity();
            PreparedStatement pstmt=con.prepareStatement("insert into food_safety_portal.fsp_resto"
                    + "(name,address,contact,url,email,rating,famous,state,city)"
                    + "values(?,?,?,?,?,?,?,?,?)");
            
                        
            pstmt.setString(1,name);
            pstmt.setString(2,address);
            pstmt.setDouble(3,contact1);
            pstmt.setString(4,url);
            pstmt.setString(5,email);
            pstmt.setString(6,rating);
            pstmt.setString(7,famous);
            pstmt.setString(8,state);
            pstmt.setString(9,city);

            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(c_entry_new_resto.class.getName()).log(Level.SEVERE, null, ex);
        }
            out.println("<center><h1><font color=\"blue\">Restaurant entered successfully<font></h1></center>");
            RequestDispatcher reqd;
            reqd = request.getRequestDispatcher("c_entry_new_resto.jsp");
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
