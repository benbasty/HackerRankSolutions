import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class javaIfElse {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        int N = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        if(N%2!=0) {
            System.out.println("Weird");
        } else if((N % 2==0) && (N >= 2 && N <= 5)){
            System.out.println("Not Weird");
        } else if ((N % 2==0) && (N >= 6 && N <= 20)) {
            System.out.println("Weird");
        } else if(N % 2==0 && N > 20) {
            System.out.println("Not Weird");
        }


        scan.close();

    }
}