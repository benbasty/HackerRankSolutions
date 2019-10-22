import java.util.Scanner;

class java2DArray{


	public static void main(String []argh){
		 int[][] arr = new int[10][10];
		 Scanner sc = new Scanner(System.in);
		 for(int i=0;i<6;i++){
			 for(int j=0;j<6;j++){
				 arr[i][j]=sc.nextInt();

			 }
		 }
		 int maxi=-100000;
		 for(int i=0;i<6;i++){
			 for(int j=0;j<6;j++){
				 if(i<=3 && j<=3){
					 int sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+(arr[i+1][j+1])+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
					 if(sum>maxi) maxi=sum;
				 }
			 }
		 }
		 System.out.println(maxi);
	}
}


// another solution

// public static void main(String[] args) {
//         int[][] arr = new int[6][6];

//         for (int i = 0; i < 6; i++) {
//             String[] arrRowItems = scanner.nextLine().split(" ");
//             scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//             for (int j = 0; j < 6; j++) {
//                 int arrItem = Integer.parseInt(arrRowItems[j]);
//                 arr[i][j] = arrItem;
//             }
//         }

//         scanner.close();
//     }