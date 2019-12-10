package com.nice.ironbankstarterfornice;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Aspect
public class ExceptionHandlerAspect {

    @Autowired
    private RavenProps ravenProps;

    @AfterThrowing(pointcut = "execution(* com.nice.niceironbankapp.iron_bank.services..*.*(..))",throwing = "ex")
    public void handleMoneyException(NotEnoughMoneyException ex) {
        System.out.println("Sending raven with exception message to "+ravenProps.getDestination());
        System.out.println(ex.getMessage());
    }
}



