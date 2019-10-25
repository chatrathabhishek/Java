package Strings;

import java.util.HashMap;
import java.util.Map;

public class Getunique {

    public char unique(String str){

        Gethashmap gethash = new Gethashmap();
        HashMap<Character,Integer> map1 = new HashMap<>();

        map1 = gethash.frequency(str);

        char [] chararray = str.toCharArray();

        for(int i=0; i < str.length(); i++)
        {
            if(map1.get(str.charAt(i))== 1)
                return str.charAt(i);
        }
        return 0;
    }
}
