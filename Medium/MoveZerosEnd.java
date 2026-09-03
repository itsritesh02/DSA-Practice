
import java.util.Scanner;

public class MoveZerosEnd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of Array");
    int n = sc.nextInt();

    int arr[] = new int[n];
    System.out.println("Enter Array Elements");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int k = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] != 0) {
        int temp = arr[k];
        arr[k] = arr[i];
        arr[i] = temp;
        k++;
      }
    }
    System.out.println(" Zeroes after moving to end");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }

  }
}
