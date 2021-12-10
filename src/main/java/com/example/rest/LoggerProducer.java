package com.example.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import java.io.Serializable;

@ApplicationScoped
public class LoggerProducer implements Serializable {

    @Produces
    public Logger buildLogger(InjectionPoint ip){
        return LoggerFactory.getLogger(ip.getBean().getBeanClass().getName());
    }
}
