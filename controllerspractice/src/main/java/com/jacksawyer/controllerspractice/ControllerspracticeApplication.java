package com.jacksawyer.controllerspractice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

@RestController
public class ControllerspracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControllerspracticeApplication.class, args);
	}
		
    @RequestMapping ("/")
    public String hello() {
        return "Hello World!";
    }
    @RequestMapping("/world")
    public String world() {
            return "I have now created a 'Class Level Annotation.' ";
    }
}