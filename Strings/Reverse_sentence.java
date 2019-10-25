package Strings;

public class Reverse_sentence {

    public String reverse(String str){

        if(!str.contains(" "))
            return str;

        String [] arr = str.split(" ");
        String temp;
        int j = arr.length-1;
        for(int i =0; i<j;i++){
             temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
             j--;
        }
        str = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            str = str + " " + arr[i];
        }

        return str;

    }
}
