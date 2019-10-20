import java.util.Scanner;

class javaRegex{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex {
    String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    String pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;


}

// 1) \\d{1,2} catches any one or two digit number, |d{1,2} 1-9, 01-09, 10-99

// 2) (0|1)\\d{2} catches any three digit number starting with 0 or 1. |000-009, 010-099, 100-199

// 3) 2[0-4]\\d catches numbers between 200 and 249. |200-249 --> 2[0-4]\d

// 4) 25[0-5] catches numbers between 250 and 255. |250-255 --> 25[0-5]

// Note that \d represents digits in regular expressions, same as [0-9] |\d <=> [0-9]

