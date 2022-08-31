package edu.wctc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainThing {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        ((ApplicationThing)context.getBean("applicationThing")).generateReport();
    }
}
