import java.math.BigDecimal;
import java.util.*;
class javaBigDecimal{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();

        //Write your code here
        Comparator<String> customComparator = new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                BigDecimal a = new BigDecimal(s1);
                BigDecimal b = new BigDecimal(s2);
                return b.compareTo(a);
            }
        };
        Arrays.sort(s,0,n,customComparator);
        

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}



// All you need is a comparator. Why? Because you need to keep the strings in the array, but still compare the strings by their BigDecimal values. This is achieved through the comparator. 
//Converting the strings to BigDecimals and storing the BigDecimal values will lead to the problem of losing leading zeros on certain string values, so you need the comparator.