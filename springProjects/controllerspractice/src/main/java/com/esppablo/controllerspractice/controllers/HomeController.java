package com.esppablo.controllerspractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@RestController
//public class HomeController {
//        @RequestMapping("/")
//        public String home() {
//                return "Hello World!";
//        }
//}

//@RestController
//@RequestMapping("/hello")
//public class HomeController {
//        @RequestMapping("")
//        public String home() {
//                return "Hello World!";
//        }
//        @RequestMapping("/world")
//        public String world() {
//                return "Class level annotations are cool too!";
//        }
//}

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {
    	// return "index.html";
        return "forward:/index.html";
    }
}