package ctci.array1;

/*In this program, we are checking to see if a string has unique characters.
* We are looking at the ASCII codes to check for repetition*/

public class Unique {

    public String str;

    private int max_Char = 256;


    public boolean checkunique(String str){

        if(str.length() > 256)
            return false;

        boolean [] charArray = new boolean [max_Char];

        int index;

        for(int i=0; i< str.length(); i++){
            index = (int)str.charAt(i);

            //Check if index in Boolean Array True
            // If true, that means characters repeat
            if(charArray[index])
                return false;

            charArray[index] = true;
        }

        return true;

    }

 /*   public static void main(String args[]){

        Unique unique = new Unique();
        unique.str = "Chatrath";

        if(unique.checkunique(unique.str))
            System.out.println("String has Unique Characters");
        else
            System.out.println("String doesn't have Unique Characters");


    }*/

}



