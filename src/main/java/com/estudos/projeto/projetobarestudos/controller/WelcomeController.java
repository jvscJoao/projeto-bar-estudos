package com.estudos.projeto.projetobarestudos.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;




@RestController
@RequestMapping("/")
public class WelcomeController {
    
    @GetMapping()
    public String firstPage() {
        return "Sistema Online!";
    }
    
}
