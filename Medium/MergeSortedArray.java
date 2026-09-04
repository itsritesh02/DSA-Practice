import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter size of first array: ");
    int n1 = sc.nextInt();

    int[] arr1 = new int[n1];

    System.out.println("Enter first sorted array:");
    for (int i = 0; i < n1; i++) {
      arr1[i] = sc.nextInt();
    }

    System.out.print("Enter size of second array: ");
    int n2 = sc.nextInt();

    int[] arr2 = new int[n2];

    System.out.println("Enter second sorted array:");
    for (int i = 0; i < n2; i++) {
      arr2[i] = sc.nextInt();
    }

    int ans[] = new int[n1 + n2];

    for (int i = 0; i < n1; i++) {
      ans[i] = arr1[i];
    }

    for (int i = 0; i < n2; i++) {
      ans[n1 + i] = arr2[i];
    }

    Arrays.sort(ans);

    System.out.println(" Array After Merged");

    for (int i = 0; i < ans.length; i++) {
      System.out.print(ans[i] + " ");
    }

  }
}
