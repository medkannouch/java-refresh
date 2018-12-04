package com.trans.yago.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trans.yago.beans.DtoBean;

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
