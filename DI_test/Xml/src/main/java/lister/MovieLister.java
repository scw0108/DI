package lister;
import finder.MovieFinder;

import java.util.List;

public class MovieLister {
    private MovieFinder finder;
    public MovieLister(MovieFinder finder) {
        this.finder = finder;
    }
    public List getMovie(String name){
        return finder.findAll((name));
    }
}
