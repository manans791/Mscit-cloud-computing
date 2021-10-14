package com.addMulti;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(
    name = "HelloAppEngine",
    urlPatterns = {"/hello"}
)
public class HelloAppEngine extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {
	  int num1 = Integer.parseInt(request.getParameter("num1"));
	  int num2 = Integer.parseInt(request.getParameter("num2"));
	  int sum = num1 + num2;
	  int product = num1 * num2;
	  PrintWriter output = response.getWriter();
	  output.println("The Answer :"+sum +"\n The product :"+product);
  }
}