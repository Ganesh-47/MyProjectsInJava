package com.aspire.request;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestServlet
 */
public class RequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RequestServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

response.setContentType("text/html");
  PrintWriter p = response.getWriter();
  try{
  Enumeration e = request.getAttributeNames();
  String name="";
  p.println("*********<br>");
  while(e.hasMoreElements()){
   name = (String) e.nextElement();
   p.println(name + " - " + request.getAttribute(name) + "<br>");
  }
  p.println("**********************<br>");
  p.println("Encoding: " + request.getCharacterEncoding() + "<br>");
  p.println("Content length: " + request.getContentLength() + "<br>");
  p.println("Content type: " + request.getContentType() + "<br>");
  p.println("Input stream: " + request.getInputStream() + "<br>");
  p.println("Protocol: " + request.getProtocol() + "<br>");
  p.println("Scheme: " + request.getScheme() + "<br>");
  p.println("Server Name: " + request.getServerName() + "<br>");
  p.println("Port: " + request.getServerPort() + "<br>");
  p.println("Remote Addr:" + request.getRemoteAddr() + "<br>");
  p.println("Host: " + request.getRemoteHost() + "<br>");
  p.println("Locale: " + request.getLocale() + "<br>");
  //java.util.Enumeration getLocales();
  p.println("Secure? " + request.isSecure() + "<br>");
  p.println("Real path: " + request.getRealPath("/NewServlet") + "<br>");
  p.println("AuthType: " + request.getAuthType() + "<br>");

  p.println("**************************<br>");
  e = request.getHeaderNames();
  while(e.hasMoreElements()){
   name = (String) e.nextElement();
   p.println(name + " - " + request.getHeader(name) + "<br>");
  }
  p.println("************************<br>");
  p.println("Method: " + request.getMethod() + "<br>");
  p.println("Path Info: " + request.getPathInfo() + "<br>");
  p.println("Path translated: " + request.getPathTranslated() + "<br>");
  p.println("Context Path: " + request.getContextPath() + "<br>");
  p.println("Query String: " + request.getQueryString() + "<br>");
  p.println("Remote user: " + request.getRemoteUser() + "<br>");
  p.println("Principal: " + request.getUserPrincipal() + "<br>");
  p.println("SId:"+ request.getRequestedSessionId() + "<br>");
  p.println("URI: " + request.getRequestURI() + "<br>");
  p.println("URL: " + request.getRequestURL() + "<br>");
  p.println("Servlet Path: " + request.getServletPath() + "<br>");
  p.println("Session: " + request.getSession() + "<br>");
  p.println("Session is valid: " + request.isRequestedSessionIdValid() + "<br>");
  p.println("From cookie? " + request.isRequestedSessionIdFromCookie() + "<br>");
  p.println("From URL? " + request.isRequestedSessionIdFromURL() + "<br>");
  //p.println("From Url? " + request.isRequestedSessionIdFromUrl() + "<br>");
  p.println("<p>Parameter : "+request.getParameter("txt1"));
  p.println("<form method=post><input type=text name=txt1><input type=submit name=btn1 value=ok></form>");
  } catch(Exception e){ p.println(e.getMessage());}

	}

}
