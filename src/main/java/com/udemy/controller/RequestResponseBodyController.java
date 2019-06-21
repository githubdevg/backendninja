package com.udemy.controller;

import com.udemy.model.LoginForm;
import com.udemy.model.ResponseTransfer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/requestResponseBody")
public class RequestResponseBodyController {


    @PostMapping("postRequest")
    @ResponseBody
    public ResponseTransfer postResponseController(@RequestBody LoginForm loginForm) {
        return new ResponseTransfer("The user is: " + "'" +
                loginForm.getUserName() + "'" + " and the password is: " + "'" + loginForm.getPassword() + "'");
    }


}
