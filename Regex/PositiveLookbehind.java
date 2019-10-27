import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PositiveLookbehind {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("(?<=[13579])\\d"); //Use '\\' instead of '\'.
    
    }
}

class Regex_Test {

    public void checker(String Regex_Pattern){
    
        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        int Count = 0;
        while(m.find()){
            Count += 1;
        }
        System.out.format("Number of matches : %d",Count);
    }   
    
}

// The positive lookbehind (?<=) asserts regex_1 to be immediately preceded by regex_2.
// (?<=reg_2)reg_1