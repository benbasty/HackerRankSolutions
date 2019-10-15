
// The character class [ ] matches only one out of several characters placed inside the square brackets.

public class MatchingSpecificCharacters {
    public static void main(String[] args) {
        Regex_Test tester = new Regex_Test();
        tester.checker("^[123][120][xs0][30Aa][xsu][\\.\\,]$"); 
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