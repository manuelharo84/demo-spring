package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@SpringBootApplication
@RestController
public class Application {

  @RequestMapping("/")
  public String home() {
    return "Hello Docker World";
  }

  @GetMapping("/saludo/{name}/{lastName}")
  public String saludo(@PathVariable("name") String name, @PathVariable("lastName") String lastName){
    return "Bienvenido estimado "+lastName+" "+name;
  }

  @GetMapping("/saludo")
  public String saludo(@RequestParam("name") String name, @RequestParam("age") int age){
    return "Hola "+name+" tienes "+age+" años";
  }




  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

}