package com.nice.ironbankstarterfornice;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */

public class HelloService {

    @Scheduled(fixedDelay = 30000)
    public void sayHello(){
        System.out.println("Hello cruel world!!!");
    }
}
