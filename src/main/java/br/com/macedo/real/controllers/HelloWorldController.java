package br.com.macedo.real.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class HelloWorldController {

    @GetMapping("/helloworld")
    public ResponseEntity<String> getHelloWorld(@RequestBody Object body) {
        return new ResponseEntity<String>("Hello World",  HttpStatus.OK);
    }

}
