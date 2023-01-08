package org.example;
import lister.MovieLister;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list;
        list=new ArrayList<>();
        list.add("Fast & Furious 1");
        list.add("Fast & Furious 2");
        list.add("Fast & Furious 3");
        list.add("Mission Impossible 1");
        list.add("Mission Impossible 2");
        var lister=new MovieLister(list);
        System.out.println(lister.getMovie("Fast"));
    }
}