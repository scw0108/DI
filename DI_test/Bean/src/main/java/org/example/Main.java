package org.example;

import config.Config;
import lister.MovieLister;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        MovieLister lister = context.getBean(MovieLister.class);
        System.out.println(lister.getMovie("Fast"));

    }
}