package com.tsupryk.springsample.app;

import com.tsupryk.springsample.entity.FirstClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * The Class SpringSample.
 * Date: 02.09.13
 */
public class SpringSample {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        FirstClass firstClass = (FirstClass) context.getBean("firstClass");

        String message = firstClass.getHello();
        System.out.println(message);

    }
}
