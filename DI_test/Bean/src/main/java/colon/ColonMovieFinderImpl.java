package colon;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ColonMovieFinderImpl implements ColonMovieFinder{
    private List<String> list;
    public ColonMovieFinderImpl(List<String> list) {
        this.list = list;
    }
    @Override
    public List getFile(){
        return list;
    }
}
