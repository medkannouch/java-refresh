package com.java.refresh.controllers;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.refresh.beans.DtoBean;

@Component
@RestController
@RequestMapping("/home")

public class HomeController {

@RequestMapping(value="/hi/{id}", produces="application/json")
public DtoBean home( @PathVariable String id){

    return new DtoBean("Hello "+ id);
}


@RequestMapping("/devtools")
public String devTools(){

    return "Hello DevTools!!!";
}

}
