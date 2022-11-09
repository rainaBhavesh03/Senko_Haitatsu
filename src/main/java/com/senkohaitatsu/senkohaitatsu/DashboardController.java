package com.senkohaitatsu.senkohaitatsu;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DashboardController {
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String rootView(){   //this gets the http request and returns the 'index' html page
        return "index"; //no need to pre or append to the path for the html file
    }
}
