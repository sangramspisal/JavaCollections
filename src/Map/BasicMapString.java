package Map;

import java.util.*;

/**
 * Created by synergisticit on 2/25/2016.
 */
public class BasicMapString {
    public static void main(String[] args) {

        // With Integer, no need to override hashCode ansd equals
        // With Tree set it will sort to DNSO

        // Sorted values while iterating
        Map<Integer,String> map = new TreeMap<Integer, String>();

        map.put(1,"Abcd");
        map.put(2,"sangram");
        map.put(3,"A");
        map.put(4,"sa");
        map.put(5,"Abc");
        map.put(6,"sangrampisal");

        //printMapUsingSet(map);
        System.out.print("Longest Key is-----");
        System.out.print(findLongString(map));
    }

    private static String findLongString(Map<Integer, String> map) {

        //KeySet is a method in map which RETURNSD A SET OF KEYS
        Set<Integer> key = map.keySet();

        Iterator itr = key.iterator();
        String ret = null;
        int strlength=-1;
        while (itr.hasNext()) {
            Integer tempKey = (Integer) itr.next();
            String tempValue=map.get(tempKey);

            if (tempValue.length()>=strlength) {
                strlength=tempValue.length();
                ret=tempValue;
            }
        }
        return ret;
    }

    /**
     * Map is not a part of Collection thus Iterator is not available
     *
     * There are two ways to iterate a map
     * 1. Using Set (for loop)
     * 2. Using EntrySet (for each)
     * @param map
     */
    private static void printMapUsingSet(Map<Integer, String> map) {
        //KeySet is a method in map which RETURNSD A SET OF KEYS
        Set<Integer> key = map.keySet();

        Iterator itr = key.iterator();
        while(itr.hasNext()) {
            Integer tempKey = (Integer)itr.next();
            System.out.print("Value is : "+map.get(tempKey) + ", key is : "+ tempKey + "\n");
        }
    }
}
