
//---------------------- no return 

// public class TwoSum {
//   static void sum(int arr[], int  target){
//     for(int i=0; i<arr.length;i++){
//       for (int j=i+1; j<arr.length;j++){
//       if(arr[i]+arr[j]==target){
//    System.out.println("Indices are : "+i+" and " + j);
//    return ;
//       }
//       }
//     }
//   }
//   public static void main(String[] args) {
//     int arr[] = {2 ,5, 9,5,3 ,6};
//     int target = 7;
//      sum(arr, target);
//   }
// }



//------------------Return Only Value
// public class TwoSum {
//   static int sum(int arr[], int target) {
//     int k;
//     for (int i = 0; i < arr.length; i++) {
//       for (int j = i + 1; j < arr.length; j++) {
//         if (arr[i] + arr[j] == target) {
//           System.out.println("Indices are : " + i + " and " + j);
//           k = arr[i] + arr[j];
//           return k;
//         }
//       }
//     }
//     return -1;
//   }

//   public static void main(String[] args) {
//     int arr[] = { 2, 5, 9, 5, 3, 6 };
//     int target = 7;
//     int ans = sum(arr, target);
//     System.out.println(ans);
//   }
// }



//--------------------------REturn both 

import java.util.Scanner;

public class TwoSum {
  static int sum(int arr[], int target) {
    int k;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == target) {
          System.out.println("Indices are : " + i + " and " + j);
          k = arr[i] + arr[j];
          return k;
        }
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    // int arr[] = { 2, 5, 9, 5, 3, 6 };
    // int target = 7;

Scanner sc = new Scanner(System.in);
System.out.println("Enter Size of Array");
int n = sc.nextInt();

int arr[] = new int[n];

System.out.println("Enter Array Elaments");

for(int i=0; i<n;i++){
  arr[i]=sc.nextInt();
}

System.out.println("Enter target");
int target = sc.nextInt();




    int ans = sum(arr, target);
    System.out.println("Sum: "+ans);
  }
}
