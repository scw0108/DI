package colon;

import java.util.List;


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
