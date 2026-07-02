package com.setterspring.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("configmetadata.xml");
    	
    	Customer com=  (Customer) context.getBean("cus");
    	System.out.println(com.getName());
    	System.out.println(com.getNumber());
    	System.out.println(com.getAddress());
    	
        System.out.println( "Hello World!" );
    }
}
