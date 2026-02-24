package ch.zhaw.avalanger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/avalange")    
public class AvalangeController {
    
    @GetMapping("")
    public String getAllAvalanges() {
        return "No Avalanges found";
    }
    

}
