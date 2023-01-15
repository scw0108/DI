package finder;
import colon.ColonMovieFinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.List;

@Component
public class MovieFinderImpl implements MovieFinder{
    @Autowired
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
