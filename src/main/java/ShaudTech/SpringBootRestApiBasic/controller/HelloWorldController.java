package ShaudTech.SpringBootRestApiBasic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    // Get Requests
    @GetMapping("/hello")
    public String helloWorld()
    {
       return "Hello World!";
    }
}
