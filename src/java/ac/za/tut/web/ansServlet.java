/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ac.za.tut.web;

import ac.za.tut.business.MathProcess;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
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
@WebServlet(name = "ansServlet", urlPatterns = {"/ansServlet.do"})
public class ansServlet extends HttpServlet {


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
     //start the session
     HttpSession session =request.getSession();
    // get data from the rquest object
    int userAns =Integer.parseInt(request.getParameter("answer"));
    //get the data from the session;
     int num1 = (Integer)session.getAttribute("num1");
     int num2 = (Integer)session.getAttribute("num2");
     String op =(String )session.getAttribute("op");
     //determine the correct answer 
     MathProcess mp =  new MathProcess();
     int correctAnswer =mp.determineCorresctAns(num1,num2,op);
     String outcome=mp.determineOutcome(correctAnswer,userAns);
     //update the sessionb
     mp.updateSessionn(session,correctAnswer,outcome, userAns);
     //send foward
     RequestDispatcher disp = request.getRequestDispatcher("ans.jsp");
     disp.forward(request, response);
    }



}
