import java.util.Scanner;

public class CountEvenOddd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of Array");
    int n = sc.nextInt();

    int arr[] = new int[n];
    System.out.println("Enter Array Elements");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int count1 = 0;
    int count2 = 0;

    for (int i = 0; i < n; i++) {

      // Even-----
      if (arr[i] % 2 == 0) {
        count1++;
      }

      // Odd-----
      else {
        count2++;
      }

    }

    System.out.println("Even no are: " + count1);
    System.out.println("Odd no are: " + count2);

  }
}
