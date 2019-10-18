import java.util.Scanner;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String sequence = s.substring(0,k);
         smallest = sequence;
        largest = sequence;

        for(int i = 1; i < (s.lenght())-k; i++){
            if(sequence.compareTo(smallest) < 0){
                smallest = sequence;
            }
            if(sequence.compareTo(smallest) < 0){
                largest = sequence;
            }
        }
        
        return smallest + "\n" + largest;
    }

