package ctci.array1;

import ctci.array1.Permutation;

import java.util.HashMap;

public class String_compress {

    String st1;
    private StringBuilder comp = new StringBuilder();
    private int count=0;

    String compress(String st1){
         int len = st1.length();
         for(int i =0; i<len;i++){
             count++;

             if(i+1>=len || st1.charAt(i+1) != st1.charAt(i))
             {
                 comp.append(st1.charAt(i));
                 comp.append(count);
                 count=0;

             }

         }
         return comp.toString();

    }
}
