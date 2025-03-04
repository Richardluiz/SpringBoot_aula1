package com.Tarefa.Controller.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class HelloController {
@GetMapping("/MyTest")
        public String helloWorld(){
             return "Hello, My name is Richard!";
}

    
}
