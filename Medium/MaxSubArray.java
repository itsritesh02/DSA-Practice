import java.util.Scanner;

public class MaxSubArray {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }



        int max= arr[0];
        int sum=0;
        for (int i = 0; i < n; i++) {
             sum+=arr[i];
if(sum>max){
  max=sum;
}
if(sum<0){
  sum=0;
}


        }

        System.out.println("MaxSum: "+ max);
  }
}
