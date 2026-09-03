

import java.util.Scanner;

public class SecondLargest {
  public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter size of Array");
  int n = sc.nextInt();

  int arr[] = new int[n];
System.out.println("Enter Array Elements");
  for (int i = 0; i < n; i++) {
    arr[i] = sc.nextInt();
  }

  int max = arr[0];
  int SecondMax =arr[0];

  for (int i = 0; i < n; i++) {
    if (arr[i] > max) {
      SecondMax=max;
      max = arr[i];
    }

    else if(arr[i]>SecondMax && arr[i]!=max){
      SecondMax= arr[i];
    }
  }
  System.out.print("Second Largest Element is: "+ SecondMax);
}
}
