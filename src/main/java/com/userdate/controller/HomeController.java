package com.userdate.controller;

import org.apache.http.HttpHost;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public ModelAndView helloWorld()
    {
        ModelAndView mv = new
                ModelAndView("welcome");
        mv.addObject("message","Hello World!!!");
        mv.addObject("title", "Welcome to GC Coffee Shop");
        return mv;
    }

    @RequestMapping("/register")
    public ModelAndView register () {
        return new ModelAndView("register", "inst",
                "Please enter info: ");
    }

    //action that gets called>
    @RequestMapping("/formhandler")
        public ModelAndView formhandler(
                @RequestParam("firstname") String firstname,
                @RequestParam("lastname") String lastname,
                @RequestParam("email") String email,
                @RequestParam("phonenumber") String phonenumber,
                @RequestParam("password") String password)

        {
            ModelAndView mv = new ModelAndView("AddUser");
            mv.addObject("firstname", firstname);
            mv.addObject("lastname", lastname);
            mv.addObject("email", email);
            mv.addObject("phonenumber", phonenumber);
            mv.addObject("password", password);

            return mv;
        }

        @RequestMapping("/weather")
        public ModelAndView weather () {

            //java object that is going to talk across the internet for us.
            // This HttpClient will make requests from the other server
            HttpClient http = HttpClientBuilder.create().build();
            //HttpHost holds connection info
            HttpHost host = new HttpHost("forecast.weather.gov", 80, "http");

            //HttpGet will actually retrieves the information from the specific URI
            HttpGet getPage = new HttpGet("/MapClick.php?lat=42.331427&lon=-83.045754&FcstType=json");
            //this actually returns a JSON object
        }
    }
