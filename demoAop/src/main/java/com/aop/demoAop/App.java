package com.aop.demoAop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.PayloadApplicationEvent;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.demoAop.service.MypaymenImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("com.aop.demoAop.config.xml");
   MypaymenImpl paymentobj=context.getBean("payment",MypaymenImpl.class);
  paymentobj.makePayment(); 
    }
}
