package com.udemy.configuration;


import com.udemy.component.RequestTimeInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;



//If we are using Spring 5.x.x or SpringBoot 2 to resolve the deprecated waring, we can use
// implements WebMvcConfigurer as this interface is compiled in Java 8 and it has defult implementation
//for the methods used in the configuration class
@Configuration
public class WebMvcConfiguration extends WebMvcConfigurerAdapter {


    @Autowired
    @Qualifier("requestTimeInterceptor")
    private RequestTimeInterceptor requestTimeInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(requestTimeInterceptor);
    }
}
