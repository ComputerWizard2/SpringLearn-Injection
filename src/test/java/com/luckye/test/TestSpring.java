package com.luckye.test;

import com.luckye.*;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.annotation.SystemProfileValueSource;


public class TestSpring {
    @Test
    public void testAdd(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("bean1.xml");
        User user = (User) applicationContext.getBean("user");
        Books book = (Books) applicationContext.getBean("book");
        Magezine magezine =(Magezine)applicationContext.getBean("magezine");
        UserService userService =(UserService) applicationContext.getBean("userService");
        Employee emp = (Employee) applicationContext.getBean("emp");
        System.out.println(emp.toString());
        userService.updateService();
        System.out.println(magezine.toString());
        System.out.println(book.toString());

        user.addUser();


        Stu bean = applicationContext.getBean(Stu.class);
        Car bean1 = applicationContext.getBean(Car.class);
        System.out.println(bean1.toString());

        System.out.println(bean.toString());
    }
}
