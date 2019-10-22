import java.util.Scanner;

public class javaSubArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        scan.close();
        System.out.println(sumNegativeArrays(arr));
    }

    private static int sumNegativeArrays(int[] arr) {
        int count = 0;
        for (int j = 0; j < arr.length; j++) {
            int sum = 0;
            for(int k = j; k < arr.length; k++){
                sum += arr[k];
                if(sum < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}

