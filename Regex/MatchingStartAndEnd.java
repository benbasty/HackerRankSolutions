


// The ^ symbol matches the position at the start of a string.
// The $ symbol matches the position at the end of a string.
//You have a test string S. Your task is to match the pattern Xxxxx.
//Here, x denotes a word character, and X denotes a digit.
//S must start with a digit X and end with . symbol.
//S should be 6 characters long only.
public class MatchingStartAndEnd {
    public static void main(String[] args) {
        Regex_Test tester = new Regex_Test();
        tester.checker("^\\d\\w{4}.$"); // Use \\ instead of using \
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