package com.springlearning;

import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;

public class App {
    public static void main(String[] args) {
        try {
            // System.out.println("Hello World!");
            Tomcat tomcat = new Tomcat();
            tomcat.setPort(9080);

            // Add the root context
            Context context = tomcat.addContext("", null);

            // Add the HelloServlet to the context
            Tomcat.addServlet(context, "HelloServlet", new HelloServlet());
            context.addServletMappingDecoded("/hello", "HelloServlet");

            // Start the Tomcat server
            tomcat.start();
            tomcat.getServer().await();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
