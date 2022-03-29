<%-- 
    Document   : ans
    Created on : Mar 23, 2022, 8:55:10 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>answer jsp page</title>
    </head>
    <body>
        <div>
            <%
             int num1 = (Integer)session.getAttribute("num1");
             int num2 = (Integer)session.getAttribute("num2");
             String name = (String)session.getAttribute("name");
             String op=(String)session.getAttribute("op");
             String outcome= (String)session.getAttribute("outcome");
             int userAns= (Integer)session.getAttribute("answer");
             int  correctAnswer =(Integer)session.getAttribute("correctAnswer");
             int  cnt =(Integer)session.getAttribute("cnt");
            
            %>
            
        </div>
            <div>
                <p>hi mr <%=name%> please see your outcome below .</p> 
                <table>
                    <tr>
                        <td>Question <%=cnt%>:</td>
                        <td><%=num1%> <%=op%> <%=num2%></td>
                    </tr>
                     <tr>
                        <td>your answer:</td>
                        <td><%=userAns%></td>
                    </tr>
                     <tr>
                        <td>correct answer:</td>
                        <td><%=correctAnswer%></td>
                    </tr>
                     <tr>
                        <td>outcome:</td>
                        <td><%=outcome%></td>
                    </tr>
                    
                </table>
                    
                    <div>
                        <p>please click<a href="questionServlet.do"> here</a> if you want continue or <br> click <a href="summary.jsp">here</a> if you want to end</p>
                    </div>
            </div>
     
    </body>
</html>
