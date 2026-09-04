// import java.util.Scanner;

// public class ThreeSum {
//   public static void main(String[] args) {

//     Scanner sc = new Scanner(System.in);

//     System.out.print("Enter size of array: ");
//     int n = sc.nextInt();

//     int[] arr = new int[n];

//     System.out.println("Enter array elements:");
//     for (int i = 0; i < n; i++) {
//       arr[i] = sc.nextInt();
//     }

//     // 3Sum
//     for (int i = 0; i < arr.length - 2; i++) {

//       for (int j = i + 1; j < arr.length - 1; j++) {

//         for (int k = j + 1; k < arr.length; k++) {

//           if (arr[i] + arr[j] + arr[k] == 0) {

//             System.out.println(
//                 "Triplet: " +
//                     arr[i] + " " +
//                     arr[j] + " " +
//                     arr[k]);
//           }
//         }
//       }
//     }

//     sc.close();
//   }
// }


import java.util.Arrays;

public class ThreeSum {
  public static void main(String[] args) {

    int[] arr = { -1, 0, 1, 2, -1, -4 };

    Arrays.sort(arr);

    for (int i = 0; i < arr.length - 2; i++) {

      int left = i + 1;
      int right = arr.length - 1;

      while (left < right) {

        int sum = arr[i] + arr[left] + arr[right];

        if (sum == 0) {
          System.out.println(
              arr[i] + " " + arr[left] + " " + arr[right]);

          left++;
          right--;

        } else if (sum < 0) {
          left++;

        } else {
          right--;
        }
      }
    }
  }
}