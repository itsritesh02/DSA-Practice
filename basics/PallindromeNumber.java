
import java.util.Scanner;

public class PallindromeNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter No's");
    int n = sc.nextInt();

    int rev = 0;
    int original = n;
    while (n > 0) {
      int rem = n % 10;
      rev = rev * 10 + rem;
      n = n / 10;
    }


    if(rev==original){

      System.out.print("Pallindrome");
    }
    else{
      System.out.println("Not ");
    }
  }
}