package config;

import colon.ColonMovieFinder;
import colon.ColonMovieFinderImpl;
import finder.MovieFinder;
import finder.MovieFinderImpl;
import lister.MovieLister;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class Config {
    @Bean
    MovieLister lister(){
        var l=new MovieLister(finder());
        return l;
    }
    @Bean
    MovieFinder finder(){
        var f=new MovieFinderImpl(colon());
        return f;
    }
    @Bean
    ColonMovieFinder colon(){
        List<String> list;
        list=new ArrayList<>();
        list.add("Fast & Furious 1");
        list.add("Fast & Furious 2");
        list.add("Fast & Furious 3");
        list.add("Mission Impossible 1");
        list.add("Mission Impossible 2");
        var c=new ColonMovieFinderImpl(list);
        return c;
    }

}
