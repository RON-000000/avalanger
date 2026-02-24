package ch.zhaw.avalanger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/avalange")    
public class AvalangeController {
    
    @GetMapping({"", "/{country}"})
    public String getAllAvalanges(@PathVariable(required = false) String country, 
                                  @RequestParam(required = false) String state) {
        if (country == null || country.isEmpty()) {
            return "No Avalanges found";
        }
        return "No Avalanges found for country: " + country + " and state: " + state;
    }
    

}
