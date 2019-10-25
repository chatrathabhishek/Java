package ctci.array1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        int x;
        String str;

        System.out.println("Select the question");
        System.out.println("1) 1.1 Is Unique");
        System.out.println("2) 1.2 Check Permutation");
        System.out.println("3) 1.3 URLify");
        System.out.println("4) 1.4 Palindrome Permutation");
        System.out.println("5) 1.5 One Way");
        System.out.println("6) 1.6 String Compression");
        System.out.println("7) 1.7 Rotate matrix");
        System.out.println("8) 1.8 Zero matrix");
        x = in.nextInt();

        switch (x){
            case 1: Unique unique = new Unique();
                    unique.str = in.next();
                    if(unique.checkunique(unique.str))
                        System.out.println("String has Unique Characters");
                    else
                        System.out.println("String doesn't have Unique Characters");
                    break;
            case 2: Permutation perm = new Permutation();
                    System.out.println("Enter String 1");
                    perm.str1 = in.next();
                    System.out.println("Enter String 2");
                    perm.str2 = in.next();

                    char [] strArray1 = perm.str1.toCharArray();
                    char [] strArray2 = perm.str2.toCharArray();

                    HashMap strMap1 = perm.computeHash(strArray1);
                    HashMap  strMap2 = perm.computeHash(strArray2);

                    if (strMap1.equals(strMap2))
                        System.out.println("Yes it is a permutation");
                    else
                        System.out.println("It is not a permutation");
                    break;

            case 3: URLify url = new URLify();
                    System.out.println("Enter a string");
                    url.str1 = in.next();
                    System.out.println(url.str1.length());
                    url.str1 = url.str1.replaceAll("\\s+", "%20");
                    System.out.println(url.str1);
                    break;

            case 4: Palindrome_perm palPerm = new Palindrome_perm();
                    System.out.println("Enter a string");
                    in.nextLine();
                    palPerm.str = in.nextLine();
                    palPerm.str = palPerm.str.toLowerCase();
                    palPerm.str = palPerm.str.replaceAll("\\s+","");
                    Boolean b = palPerm.checkPallindrome(palPerm.str);
                    System.out.println(b);
                    break;

            case 5: Oneway oneedit = new Oneway();
                    System.out.println("Enter String 1");
                    oneedit.s1 = in.next();
                    System.out.println("Enter String 2");
                    oneedit.s2 = in.next();
                    Boolean edit = oneedit.oneEdit(oneedit.s1,oneedit.s2);
                    System.out.println(edit);
                    break;

            case 6: String_compress comp = new String_compress();
                    System.out.println("Enter a String");
                    comp.st1 = in.next();
                    str = comp.compress(comp.st1);
                    System.out.println(str);
                    break;

            case 7: Rotation rot = new Rotation();
                    System.out.println("Enter the size of the matrix:");
                    int n = in.nextInt();
                    int [][] mat = new int[n][n];
                    for (int i=0; i<n;i++){
                        for(int j=0; j<n;j++)
                            mat[i][j] = in.nextInt();
                    }

                    mat = rot.matrixRotation(mat,n);
                    for (int[] row : mat)
                        System.out.println(Arrays.toString(row));
                    break;

            case 8: Zeromatrix zero = new Zeromatrix();
                    //Size of matrix row x columns or mXn where m=5 and n=4
                    int row =5, col =4;
                    int [][] matrix = {{1,2,3,4},
                                       {5,6,0,8},
                                       {9,10,11,12},
                                       {0,14,15,16},
                                       {17,18,19,20}};
                    System.out.println("The input matrix is\n [1,2,3,4]\n" +
                            "[5,6,0,8] \n" +
                            "[9,10,11,12]\n" +
                            "[0,14,15,16]\n" +
                            "[17,18,19,20]");
                    matrix = zero.zeromat(matrix, row, col);
                    for (int[] rows : matrix)
                        System.out.println(Arrays.toString(rows));
                    break;




        }

    }
}
