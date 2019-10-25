package Strings;

import Dynamic.Fibonacci;
import Sort.Merge;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String [] args){

        String str = "javaiscool";
        String str2 = "asci";
        //Check Duplicates
        ArrayList<Character> charlist;
        Check_duplicate dupl = new Check_duplicate();
        charlist = dupl.duplicate(str);
        System.out.println(charlist);

        //Check Anagram
        Anagram anagram = new Anagram();
        System.out.println(anagram.checkAnagram(str,str2));

        //Get first unique character
        Getunique unique = new Getunique();
        System.out.println(unique.unique(str));

        //Reverse a string
        Reverse reverse = new Reverse();
        System.out.println(reverse.reverse(str));

        //Get maximum repeated character
        Max_repeat max_repeat = new Max_repeat();
        System.out.println(max_repeat.maxduplicate(str));

        //Remove character of first string from the other
        Removesamechar remove = new Removesamechar();
        System.out.println(remove.removesame(str,str2));

        //Reverse a sentece
        Reverse_sentence re = new Reverse_sentence();
        String sent = "I Am Awesome";
        System.out.println(re.reverse(sent));

        //Remove char from a string
        RemoveChar rm = new RemoveChar();
        System.out.println(rm.remove(str,'a'));

        //Finanacci
        int n=10;
        int memo[] = new int[n+1];
        Fibonacci fib = new Fibonacci();
        System.out.println(fib.fibonacci(n,memo));

        //MergeSort
        int [] A = {1,5,3,9,0,6};
        Merge merge = new Merge();
        System.out.println(Arrays.toString(merge.mergesort(A)));



    }
}
