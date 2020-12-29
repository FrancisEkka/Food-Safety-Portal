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


@WebServlet(name = "select_city", urlPatterns = {"/select_city"})
public class select_city extends HttpServlet {

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
         String state=request.getParameter("val");
        Connection con=null;
        con=connection.getConnectivity();
        PreparedStatement stmt;
                    ResultSet rs2=null;
        try {
            stmt= con.prepareStatement("select cities from fsp_states where states='"+state+"'");
            rs2=stmt.executeQuery();
            ResultSetMetaData rsmd=rs2.getMetaData();
        } catch (SQLException ex) {
            Logger.getLogger(index1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            out.println( );
            out.println(""
                    + "<select name=\"cities\" onchange=\"\">");
            out.println("<option value=\"\">....SELECT....</option>");

            while(rs2.next()){      
                   out.println("<option value=\""+rs2.getString(1)+"\" name=\""+rs2.getString(1)+"\">"+rs2.getString(1)+"</option>");                   
            }
            out.println("</select>"
                    + "<input type=\"submit\" name=\"submit\" value=\"search\"> ");
        } catch (SQLException ex) {
            Logger.getLogger(index1.class.getName()).log(Level.SEVERE, null, ex);
        }
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
