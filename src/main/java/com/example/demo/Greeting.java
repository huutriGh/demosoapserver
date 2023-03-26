package com.example.demo;


import jakarta.jws.WebMethod;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

@WebService
public class Greeting {

    @WebMethod()
    public String sayGreeting(String name){
        return  "Greeting " + name;
    }

   @WebResult(name = "student")
    public Student getStudent(){
       Student student = new Student();
       student.setId("ST100");
       student.setName("Tri");
       student.setBirthday("1990-06-01");
       return  student;
    }
}
