package com.clm.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {
     
        //* load config file */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //* get the bean from spring container */
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        //* call a method on the bean */
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        TennisCoach tc = context.getBean("tennisCoach", TennisCoach.class);

        System.out.println(tc.getEmail());
        System.out.println(tc.getTeam());

        //* close the context */
        context.close();
    }
}
