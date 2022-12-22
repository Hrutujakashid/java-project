package com.JPA.SpringSimpleApplication1;

import org.springframework.context. ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( );
       
        //ApplicationContext factory=new ClassPathApplicationContext("spring.xml");
        ApplicationContext factory=new ClassPathXmlApplicationContext("spring.xml");
        
        Actor obj=(Actor)factory.getBean("a");
        obj.show();
    }
}
