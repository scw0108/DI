package lister;
import finder.MovieFinder;
import java.util.List;

public class MovieLister {
    private MovieFinder finder;

    public MovieLister(List<String> list) {
        this.finder = new MovieFinder(list);
    }
    public List getMovie(String name){
        return finder.findAll((name));
    }


}
