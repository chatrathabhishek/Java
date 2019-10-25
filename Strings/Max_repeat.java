package Strings;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Max_repeat {

    public char maxduplicate(String str){

        HashMap<Character, Integer> maxhash = new HashMap<>();
        Gethashmap gethashmap = new Gethashmap();
        maxhash = gethashmap.frequency(str);
        int maxValue = Collections.max(maxhash.values());
        for(Map.Entry<Character,Integer> entry : maxhash.entrySet()){
            if(entry.getValue() == maxValue)
                return entry.getKey();
        }
        return 0;
    }
}
