package com.msazure.learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StartController {

  @GetMapping("/message")
  public String showMessage(){
    return "Hi Divya, this is my first project with Azure!";
  }


}
