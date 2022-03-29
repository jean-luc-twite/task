<%-- 
    Document   : summary
    Created on : Mar 23, 2022, 9:30:14 PM
    Author     : HP
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>summary JSP page</title>
    </head>
    <body>
        <div>
               <h1>summary</h1>
               <%
              int numbCorrectNumber=(Integer)session.getAttribute("numCorrectAns");
              int numbWrongNumber=(Integer)session.getAttribute("numWrongAns"); 
              int cnt =(Integer)session.getAttribute("cnt");
              String name =(String)session.getAttribute("name");
              DecimalFormat df = new DecimalFormat("0");
         
               %>
               <div>
                   <p>hi <%=name%> here is your summary</p>
                   <form action="StopSessionServlet.do" method="GET">
                   <table>
                  
                <tr>
                    <td>number of question :</td>
                    <td><%=cnt%></td>
                </tr>
                
                <tr>
                    <td>tot number correct answer :</td>
                    <td><%=numbCorrectNumber%></td>
                </tr>
                 <tr>
                    <td>tot number Wrong answer :</td>
                    <td><%=numbWrongNumber%></td>
                </tr>
                
                  <tr>
                    <td>percentage marks obtained :</td>
                    <td><%=df.format(((double)numbCorrectNumber /cnt)*100)%></td>
                </tr>
                
                  <tr>
                    <td></td>
                    <td><input type="SUBMIT" value ="CLICK TO END "/></td>
                </tr>
            </table>
                   </form>
               </div>
        </div>
    
    </body>
</html>
