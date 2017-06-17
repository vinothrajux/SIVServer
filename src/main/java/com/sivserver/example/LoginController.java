package com.sivserver.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Vinoth Joshua on 13-May-17.
 */

@RestController
public class LoginController {
    @RequestMapping("/test")
    public String index (){
        return "Hello World";
    }
}
