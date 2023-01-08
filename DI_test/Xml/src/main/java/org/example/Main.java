package org.example;

import lister.MovieLister;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("config.xml");
        MovieLister lister = context.getBean(MovieLister.class);
        System.out.println(lister.getMovie("Fast"));
    }
}