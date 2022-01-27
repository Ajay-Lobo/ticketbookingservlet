/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.*;

/**
 *
 * @author Ajay
 */
@WebServlet(urlPatterns = {"/bill"})
public class bill extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
           
           
            
             
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link rel=icon href=.\bus-solid.svg type=image/x-icon>");
            out.println("<title>Servlet bill</title>");  
                           out.println("<style>");
                            out.println("h1{color:rgb(129, 6, 252); margin-left:550px;}");
                            out.println("h4{ background-color: red;text-align:center; color:white;padding:15px;font-size: large; font-family:'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif ;}");
                            out.println("a{color:white; text-decoration:none;} a:hover{color:rgb(129, 6, 252);}");
                            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
                           
              out.println("<h1>4-STEPS BUS BOOKING</h1>");
             
             out.println("<h4><a href=loaction.html>STEP-1 : SELECT LOCATION</a></h4><br>");
             
               
             
             out.println("<h4><a href=bustime.html>STEP-2 : TIMINGS</a></h4><br>"); 
            
                                 
              
             out.println("<h4><a href=seat.html>STEP-3 : SELECT SEAT</a></h4><br>");
 
             
             out.println("<h4><a href=personal.html>STEP-4 : GIVE CONTACT</a></h4><br>");
            
             
                          

        
              

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
