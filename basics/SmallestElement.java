

import java.util.Scanner;

public class SmallestElement {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of Array");
    int n = sc.nextInt();

    int arr[] = new int[n];
    System.out.println("Enter Array Elements");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int min = arr[0];

    for (int i = 0; i < n; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    System.out.print("smallest Element is: " + min);
  }

}
