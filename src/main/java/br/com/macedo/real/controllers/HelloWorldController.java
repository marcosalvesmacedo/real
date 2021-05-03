package br.com.macedo.real.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/v1")
public class HelloWorldController {

    @GetMapping("/hello-world")
    public ResponseEntity<String> getHelloWorld() {
        log.info("Acessou o Hello World via Get");
        return new ResponseEntity<String>("Hello World", HttpStatus.OK);
    }

    @PostMapping("/hello-world")
    public ResponseEntity<String> postHelloWorld(@RequestBody Object body) {
        log.info("Acessou o Hello World via Post");
        return new ResponseEntity<String>("HelloWorld", HttpStatus.OK);
    }
}
