package finder;

import colon.ColonMovieFinder;
import java.util.Iterator;
import java.util.List;

public class MovieFinderImpl implements MovieFinder{
    private ColonMovieFinder colon;
    @Override
    public List findAll(String name){
        List<String> list = colon.getFile();
        Iterator it = list.iterator();
        while(it.hasNext()){
            String str = (String) it.next();
            if(!str.contains(name)){
                it.remove();
            }
        }
        return list;
    }
    public MovieFinderImpl(ColonMovieFinder colon) {
        this.colon=colon;
    }
}
