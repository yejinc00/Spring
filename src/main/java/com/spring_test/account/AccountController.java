package com.spring_test.account;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {

    @GetMapping("/sign-up")                 // sign-up 요청이 들어오면
    public String signUpForm(Model model){
        return "account/sign-up";              // account/sign-up에 있는 html을 반환
    }

}
