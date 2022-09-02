package com.example.sogetispringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class MessageController {
    private String message;
    private String demo;

    @Autowired
    public MessageController(String message, String demo){
        this.message = message;
        this.demo = demo;
    }

    @GetMapping("/monMessage")
    @ResponseStatus(code = HttpStatus.OK)
    public String getMessage(){
        return message;
    }

    @PutMapping("/{value}")
    @ResponseStatus(code = HttpStatus.OK)
    public String putMessage(@PathVariable String value){
        message = value;
        return message;
    }

    @PatchMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public String patchMessage(@PathVariable int id, @RequestBody String item){
        message = item;
        return message;
    }

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public String postMessage(@RequestBody String newMessage){
        message += message + newMessage;
        return message;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public String deleteMessage(){
        message = "";
        return message;
    }


}
