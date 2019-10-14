// \s matches any whitespace character [ \r\n\t\f ].
// \S matches any non-white space character.
// You have a test string S. Your task is to match the pattern XXxXXxXX
//Here, x denotes whitespace characters, and X denotes non-white space characters.

public class MatchingWhitespaceAndNonWhitespaceCharacters{
    public static void main(String[] args) {
        Regex_Test tester = new Regex_Test();
        tester.checker("\\S{2}\\s\\S{2}\\s\\S{2}"); // Use \\ instead of using \ 
    
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