package com.psl.OnlineKYC.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerificationController {
    @GetMapping("/")
    public String index(){
        return "Index page";
    }
}
