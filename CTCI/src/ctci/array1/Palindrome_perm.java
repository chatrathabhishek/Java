package ctci.array1;

import sun.font.TrueTypeFont;

import java.util.HashMap;
import java.util.Scanner;

public class Palindrome_perm {

    String str;

    Boolean checkPallindrome(String str){

        char [] strArray1 = str.toCharArray();
        Permutation perm = new Permutation();
        int count=0;

        HashMap<String, Integer> strmap = perm.computeHash(strArray1);

        for(Integer i : strmap.values()){
            if(i %2 != 0)
                count++;
        }

        if(count==1)
            return true;
        else
            return false;
    }

/*    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string");
        str = in.nextLine();
        str = str.toLowerCase();
        str = str.replaceAll("\\s+","");
        Boolean b = checkPallindrome(str);
        System.out.println(b);
    }*/

}
