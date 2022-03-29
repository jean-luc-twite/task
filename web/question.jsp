<%-- 
    Document   : question
    Created on : Mar 23, 2022, 7:19:02 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> question pages </title>
    </head>
    <body>
        <div>
            
            <%
             int num1 =(Integer)session.getAttribute("num1");
             int num2 =(Integer)session.getAttribute("num2");
             String name =(String)session.getAttribute("name");
             String op =(String)session.getAttribute("op");
             int cnt =(Integer)session.getAttribute("cnt");
            %>
            <h1>Question <%=cnt%></h1>
            
            <p>
                hi mr <%=name%> please answer to the question below
            </p>
            <div>
                <form action="ansServlet.do"  method ="POST">
                    <table>
                        <tr>
                            <td>Question:</td>
                            <td><%=num1%> <%=op%> <%=num2%> = ?</td>
                        </tr>
                        <!-- provide answer below -->
                         <tr>
                            <td>answer:</td>
                            <td><input type ="text" name ="answer" placeholder="provide your answer"/></td>
                        </tr>
                        <!-- submit your answer -->
                         <tr>
                            <td></td>
                            <td><input type="SUBMIT" value="submit"/></td>
                        </tr>
                    </table>
                </form>
            </div>
        </div> 
   
    </body>
</html>
