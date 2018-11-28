package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gi
 * @date 11/28/18
 */

@RestController
@RequestMapping(value = "/home")
public class HomeController {

    @GetMapping(value = "/")
    public String Hello(){
        return "hello";
    }
}
