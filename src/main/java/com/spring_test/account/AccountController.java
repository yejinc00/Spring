package com.spring_test.account;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class AccountController {

    @GetMapping("/sign-up")                 // sign-up 요청이 들어오면
    public String signUpForm(Model model){
        model.addAttribute(new SignUpForm());
        return "account/sign-up";              // account/sign-up에 있는 html을 반환
    }

    @PostMapping("/sign-up")
    public String signUpSubmit(@Valid @ModelAttribute SignUpForm signUpForm, Errors errors){
        if(errors.hasErrors()){
            return "account/sign-up";           // error 발생시 form을 다시 보여준다
        }

    }


}
