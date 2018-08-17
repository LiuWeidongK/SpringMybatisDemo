package com.katarina.spring.main;

import com.katarina.spring.entity.EntityTemplate;
import com.katarina.spring.service.ServiceTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : LiuWeidong
 * @date : 2018/8/17.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ServiceTemplate serviceTemplate = (ServiceTemplate) context.getBean("serviceTemplate");
        EntityTemplate entityTemplate = serviceTemplate.queryTemplate("LWD", "CYC");
        System.err.println(entityTemplate);
    }
}
