import java.util.Scanner;

public class CheckEvenOdd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  System.out.println("Enter size of Array");
  int n = sc.nextInt();

  int arr[] = new int[n];
System.out.println("Enter Array Elements");
  for (int i = 0; i < n; i++) {
    arr[i] = sc.nextInt();
  }



  for(int i = 0; i<n ;i++){
    if(arr[i]%2==0){
      System.out.println("Even");
    }
    else{
      System.out.println("Odd");
    }
  }


  }
}
