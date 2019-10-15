import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// The challenge here is to read n lines of input until you reach EOF, then number and print all  lines of content.

// Hint: Java's Scanner.hasNext() method is helpful for this problem.

public class javaEndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
            for (int i = 1; sc.hasNext(); i++){
                System.out.println(i + " " + sc.nextLine());
        }
    }
}