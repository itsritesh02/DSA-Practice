// import java.util.Scanner;

// public class ReverseArray {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter size of Array");
//     int n = sc.nextInt();

//     int arr[] = new int[n];
//     System.out.println("Enter Array Elements");
//     for (int i = 0; i < n; i++) {
//       arr[i] = sc.nextInt();
//     }

//     System.out.println("Reversed Array");
//    for(int i =n-1; i>=0;i--){
//     System.out.print( arr[i] +" ");
//    }

//   }

// }

// Two Pointer Approach 

import java.util.Scanner;

public class ReverseArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of Array");
    int n = sc.nextInt();

    int arr[] = new int[n];
    System.out.println("Enter Array Elements");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int i = 0;
    int j = n - 1;

    while (i < j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }

    System.out.println("Reversed Array:");
    for (int k = 0; k < n; k++) {
      System.out.print(arr[k]+" ");
    }

  }

}