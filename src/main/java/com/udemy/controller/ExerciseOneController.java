package com.udemy.controller;


import com.udemy.service.ExerciseOneService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Date;

@Controller
@RequestMapping("/exerciseOne")
public class ExerciseOneController {

    private static final Log LOG = LogFactory.getLog(ExerciseOneController.class);

    private static final String EJERCICIO1_VIEW = "exerciseOne";


    @Autowired
    @Qualifier("exerciseOneService")
    private ExerciseOneService ejercicio1Service;



    @RequestMapping("/method1")
    public RedirectView method1() {

        return new RedirectView("/exerciseOne/method2");

    }


    @GetMapping("/method2")
    public ModelAndView method2() {
        long starTime = System.currentTimeMillis();

        ModelAndView mav = new ModelAndView(EJERCICIO1_VIEW);
        mav.addObject("message", ejercicio1Service.generateMessage());

        long endTime = System.currentTimeMillis();

        LOG.info("The time elapsed in method2 of 'Exercise1Controller' is: " + (endTime-starTime) + "ms");

        return mav;

    }

}