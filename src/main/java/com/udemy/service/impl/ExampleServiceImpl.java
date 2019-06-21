package com.udemy.service.impl;

import com.udemy.model.Person;
import com.udemy.service.ExampleService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


@Service("exampleService")
public class ExampleServiceImpl implements ExampleService {

    public static final Log LOG = LogFactory.getLog(ExampleServiceImpl.class);

    @Override
    public List<Person> getListPeople() {

        LOG.info("HELLO FROM SERVICE");
        return Arrays.asList(new Person("Jon", 23), new Person("Mikel", 30),
                new Person("Eva", 43), new Person("Peter", 18));
    }


}
