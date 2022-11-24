package com.clm.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigDemoApp {
    public static void main(String[] args) {
     
        //* load config java class */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

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