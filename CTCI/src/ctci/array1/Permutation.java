package ctci.array1;

import java.util.HashMap;

public class Permutation
{
    String str1, str2;

    public HashMap computeHash(char [] charArray)
    {
        HashMap <Character, Integer> charMap = new HashMap<Character, Integer>();
        for (char c : charArray){
            if(charMap.containsKey(c))
            charMap.put(c, charMap.get(c)+1);
            else
                charMap.put(c,1);
        }
        return charMap;
    }

}
