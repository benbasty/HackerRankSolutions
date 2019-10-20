import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HTMLTags {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your               class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        Pattern p = Pattern.compile("<([^<>/\\s]+)[\\s>]");
        // <([^<>/\\s]+) no opening and closing tags, no slash/, no whitespace character            and be matched 1 or more times +
        // \\s no whitespace, no closing tag
        TreeSet<String> list = new TreeSet();
        while (0 <= --n) {
            String str = scan.nextLine();
            Matcher m = p.matcher(str);
            while(m.find()){
            list.add(m.group(1));
            }
        }
        while(!list.isEmpty()){
            System.out.print(list.pollFirst());
            System.out.print((!list.isEmpty()) ? ";" : "");
            
        }
    }
}