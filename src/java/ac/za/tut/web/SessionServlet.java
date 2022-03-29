/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ac.za.tut.web;

import ac.za.tut.business.MathClass;
import ac.za.tut.business.MathProcess;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author HP
 */
@WebServlet(name = "SessionServlet", urlPatterns = {"/SessionServlet.do"})
public class SessionServlet extends HttpServlet {


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
      //start sesion
      HttpSession session =request.getSession(true);
      //get the data from the request object 
      String name =request.getParameter("name");
      String op =request.getParameter("op");
      //initialise the session 
      MathClass mc = new MathClass(name,op);
      MathProcess mp = new MathProcess(mc);
      mp.initialiseSession(session,name,op);
      // we need now to redirect the flow the servlet that will generate the two numbers
      response.sendRedirect("questionServlet.do");
    }

  

}
