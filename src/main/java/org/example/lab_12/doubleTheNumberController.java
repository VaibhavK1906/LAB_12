package org.example.lab_12;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class doubleTheNumberController {
    @GetMapping("/double")

    public int doubleTheNumber(@RequestParam("number") int number){
        return  number*2;
    }


}
