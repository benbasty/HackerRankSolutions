import java.io.*;
import java.util.*;

public class javaStringIntroduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum = A.length() + B.length();
        System.out.println(sum);
        if(A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        char a1 = A.toUpperCase().charAt(0);
        char b1 = B.toUpperCase().charAt(0);
        System.out.println(a1 + A.substring(1) + ' ' + b1 + B.substring(1));
        
    }
}
