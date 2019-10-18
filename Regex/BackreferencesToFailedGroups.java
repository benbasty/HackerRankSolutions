import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BackreferencesToFailedGroups {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("^((\\d{8})|(\\d{2}-\\d{2}-\\d{2}-\\d{2}))$"); // Use \\ instead of using \ 
    
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

// Backreference to a capturing group that match nothing is different from backreference to a capturing group that did not participate in the match at all.
// Here, b? is optional and matches nothing.
//Thus, (b?) is successfully matched and capture nothing.

// **************************** //
// Here, (b) fails to match at all. Since, the whole group is optional the regex engine does proceed to match o.