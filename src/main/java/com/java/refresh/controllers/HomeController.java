package com.java.refresh.controllers;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.refresh.beans.DtoBean;

@Component
@RestController
@RequestMapping("/home")

public class HomeController {

@RequestMapping(value="/hi", produces="application/json")
public DtoBean home(){

    return new DtoBean("Hello Spring Boot!!!");
}


@RequestMapping("/devtools")
public String devTools(){

    return "Hello DevTools!!!";
}

}
