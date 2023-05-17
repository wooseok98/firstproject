package com.example.firstproject.controller;


import org.springframework.stereotype.Controller;//@Controller만들면 생성됨
import org.springframework.ui.Model;//클래스 Model을 만들면서 생성됨
import org.springframework.web.bind.annotation.GetMapping;//@GetMapping만들면 생성됨

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String niceTomeetyou(Model model){
        model.addAttribute("username","hongpack");
        return "greetings"; // templates/greetings.mustache ->브라우저로 전송
    }
    @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("nickname","홍길동");
        return "goodbye";
    }
}
