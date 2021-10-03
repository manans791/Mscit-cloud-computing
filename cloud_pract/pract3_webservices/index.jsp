<%-- 
    Document   : index
    Created on : Sep 4, 2021, 9:35:47 PM
    Author     : yashchandra05
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
            <%-- start web service invocation --%><hr/>
    <%
    try {
	org.me.calculator.CalculatorWSApplication_Service service = new org.me.calculator.CalculatorWSApplication_Service();
	org.me.calculator.CalculatorWSApplication port = service.getCalculatorWSApplicationPort();
	int i = 3;
	int j = 4;
	int result_add = port.add(i, j);
	out.println("Result_add = "+result_add);
    } catch (Exception ex) {
        out.println("Exception" + ex);
    }
    %>
    <%-- end web service invocation --%><hr/>
        <%-- start web service invocation --%><hr/>
    <%
    try {
	org.me.calculator.CalculatorWSApplication_Service service = new org.me.calculator.CalculatorWSApplication_Service();
	org.me.calculator.CalculatorWSApplication port = service.getCalculatorWSApplicationPort();
	int i = 3;
	int j = 4;
	int result_sub = port.sub(i, j);
	out.println("Result_sub = "+result_sub);
    } catch (Exception ex) {
        out.println("Exception" + ex);
    }
    %>
    <%-- end web service invocation --%><hr/>

    </body>
</html>