// \\d matches any digit [0-9]
// The expression \\D matches any character that is not a digit.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//You have a test string S. Your task is to match the pattern xxXxxXxxxx
//Here x denotes a digit character, and X denotes a non-digit character.

public class MatchingDigitsAndNonDigitsCharacters{
    public static void main(String[] args) {
        Regex_Test tester = new Regex_Test();
        tester.checker("\\d{2}\\D\\d{2}\\D\\d{4}"); // Use \\ instead of using \
    }
}
class Regex_Test {

    public void checker(String Regex_Pattern){
    
        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }   
    
}