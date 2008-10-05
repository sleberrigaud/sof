package com.stackoverflow.spring.autostart;

import com.stackoverflow.spring.autostart.service.FooService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 */
public class Autostart
{
    public static void main(String[] args)
    {
        final ApplicationContext ctx = new ClassPathXmlApplicationContext("/context.xml", Autostart.class);
        final FooService fooService = (FooService) ctx.getBean("fooService");
        fooService.bar();
    }
}
