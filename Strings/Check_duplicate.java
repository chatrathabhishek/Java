package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Check_duplicate {

    private HashMap <Character,Integer> hash = new HashMap<>();
    private ArrayList<Character> charlist = new ArrayList<>();

    public ArrayList<Character> duplicate(String str){

        Gethashmap gethash = new Gethashmap();
        hash = gethash.frequency(str);

        for(Map.Entry<Character,Integer> entry : hash.entrySet()){
            if(entry.getValue()>1){
                charlist.add(entry.getKey());
            }

        }
        return charlist;
    }
}
