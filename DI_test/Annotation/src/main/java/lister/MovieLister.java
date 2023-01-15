package lister;
import finder.MovieFinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MovieLister {
    @Autowired
    private MovieFinder finder;
    public MovieLister(MovieFinder finder) {
        this.finder = finder;
    }
    public List getMovie(String name){
        return finder.findAll((name));
    }
}
