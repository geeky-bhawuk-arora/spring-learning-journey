package com.springlearning._SpringBootWeb;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    public String home() {
        return "index.jsp";
    }
}