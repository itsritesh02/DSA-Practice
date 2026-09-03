
import java.util.Scanner;

public class CountOccurence {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of Array");
    int n = sc.nextInt();

    int arr[] = new int[n];
    System.out.println("Enter Array Elements");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("Enter target Element");
    int target = sc.nextInt();

    int count =0;
    for (int i = 0; i < n; i++) {
      if (arr[i] == target) {
      count++;
      }
    }
    System.out.println("Count is: " + count); 
  }
}
