package com.secondapplication.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller("/home")
public class HomeController
{
    @Get("/names")
    public List<String> getNames()
    {
        System.out.println("Hiiii");
        System.out.println("Hello");
        "Hi";
        return Arrays.asList("Tushar","Mehul");
    }
}
