package Strings;

import java.util.HashMap;

public class Anagram {

    private HashMap<Character, Integer> map1 = new HashMap<>();
    private HashMap<Character, Integer> map2 = new HashMap<>();

    public Boolean checkAnagram(String str1, String str2){

        //Check if strings are of equal length
        if (str1.length() != str2.length())
            return false;
        Gethashmap hashme = new Gethashmap();
        map1 = hashme.frequency(str1);
        map2 = hashme.frequency(str2);

        return map1.equals(map2);
    }
}
