package Strings;

import java.util.HashMap;

public class Gethashmap {

    public HashMap<Character,Integer> frequency(String str){
        HashMap<Character, Integer> charhash = new HashMap<>();
        char [] char_Arr = str.toCharArray();

        for(char c : char_Arr){
            if(charhash.containsKey(c)){
                charhash.put(c, charhash.get(c)+1);
            }
            else
                charhash.put(c,1);
        }

        return charhash;
    }

}
