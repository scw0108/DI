package colon;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ColonMovieFinderImpl implements ColonMovieFinder{
    private List<String> list;
    public ColonMovieFinderImpl() {
        list=new ArrayList<>();
        list.add("Fast & Furious 1");
        list.add("Fast & Furious 2");
        list.add("Fast & Furious 3");
        list.add("Mission Impossible 1");
        list.add("Mission Impossible 2");

    }
    @Override
    public List getFile(){
        return list;
    }
}
