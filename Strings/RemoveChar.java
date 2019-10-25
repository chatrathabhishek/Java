package Strings;

public class RemoveChar {

    public String remove(String str, char ch){

        StringBuilder newstr = new StringBuilder(str);
        while(str.indexOf(ch) != -1){

            str = newstr.deleteCharAt(str.indexOf(ch)).toString();
        }

        return str;
    }
}
