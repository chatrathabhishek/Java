package ctci.array1;

import com.sun.xml.internal.fastinfoset.util.CharArray;

public class Oneway {

    String s1, s2, first, second;

    Boolean b;

    int len,edit=0;



    Boolean oneEdit(String st1, String st2){

        if (st1.length() != st2.length())
              b = oneInsDel(st1, st2);
        else b = oneReplace(st1, st2);

        return b;
    }

    private Boolean oneInsDel(String st1, String st2){
        if (st1.length() > st2.length())
        {
            first = st1;
            second = st2;
            len = st2.length();
        }
        else
        {
            first = st2;
            second = st1;
            len = st1.length();
        }
        if (first.length() - second.length() == 1)
        {
            for(int i =0; i<len-1; i++)
            {
                if(first.charAt(i) != second.charAt(i))
                    edit++;
            }
            if (edit==0)
                edit++;
        }
        else return false;

        if (edit == 1)
            return true;
        else
            return false;
    }

    private Boolean oneReplace(String st1, String st2){
        len = st1.length();
        for(int i =0; i<len-1; i++)
        {
            if(st1.charAt(i) != st2.charAt(i))
                edit++;
        }
        if (edit==1)
            return true;
        else return false;
    }
}
