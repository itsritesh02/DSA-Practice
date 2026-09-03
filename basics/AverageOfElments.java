
import java.util.Scanner;

public class AverageOfElments {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of Array");
    int n = sc.nextInt();

    double arr[] = new double[n];
    System.out.println("Enter Array Elements");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextDouble();
    }

    double sum = 0;

    for (int i = 0; i < n; i++) {
      sum += arr[i];
    }
    double avg = (double) sum / n;
    System.out.println("Average Elements are : " + avg);
  }
}
