package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by synergisticit on 2/25/2016.
 */
public class addSameKeyMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1,"abc");
        map.put(2,"abc");
        map.put(1,"Sangram");

        Iterator<Integer> itr= map.keySet().iterator();

        while (itr.hasNext()){
            int key = itr.next();
            System.out.println(key + "  -  " + map.get(key) );
        }
    }
}
