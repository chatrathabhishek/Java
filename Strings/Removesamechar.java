package Strings;

public class Removesamechar {

    public String removesame(String str, String str1){

        StringBuilder newstr = new StringBuilder();

        char [] strarr = str.toCharArray();
        char [] str2arr = str1.toCharArray();

        for(char ch : str2arr){
           for(char c : strarr){
               if (ch!=c)
                   newstr.append(c);
           }
           strarr = newstr.toString().toCharArray();
           newstr.setLength(0);
        }
        String res = new String(strarr);
        return res;
    }
}
