package org.example;

import configuration.movieconfiguration;
import lister.MovieLister;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(movieconfiguration.class);
        MovieLister lister = context.getBean(MovieLister.class);
        System.out.println(lister.getMovie("Fast"));
    }
}