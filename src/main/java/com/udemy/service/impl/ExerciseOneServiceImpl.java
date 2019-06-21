package com.udemy.service.impl;

import com.udemy.service.ExerciseOneService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;


@Service("exerciseOneService")
public class ExerciseOneServiceImpl implements ExerciseOneService {

    private static final Log LOG = LogFactory.getLog(ExerciseOneServiceImpl.class);

    public String generateMessage() {
        LOG.info("We are in generateMessage method");

        String message = "First Controller";

        return message;

    }


}