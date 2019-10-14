//The dot (.) matches anything (except for a newline).
// Note: If you want to match (.) in the test string, you need to escape the dot by using a slash \..
// In Java, use \\. instead of \..
public class MatchingAnythingButaNewLine{
    public static void main(String[] args) {
        
        Tester tester = new Tester();
        tester.check("...\\....\\....\\...."); 
    
    }
}

class Tester {

    public void check(String pattern){
    
        Scanner scanner = new Scanner(System.in);
      	String testString = scanner.nextLine();
        Pattern p = Pattern.compile(pattern);
 		Matcher m = p.matcher(testString);
 		boolean match = m.matches();
        
        System.out.format("%s", match);
    }   
    
}