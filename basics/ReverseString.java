
import java.util.Scanner;

// public class ReverseString {
//   public static void main(String[] args) {
//     String str ="helo";
//     String reverse = "";
//     for(int i= str.length()-1;i>=0;i--){
//       reverse += str.charAt(i);
//     }
//     System.out.println(reverse);
//   }
// }


//----------Accept String----------


// public class ReverseString {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter String: ");
//     String str = sc.nextLine();
    
//     String reverse = "";
//     for (int i = str.length() - 1; i >= 0; i--) {
//       reverse += str.charAt(i);
//     }
//     System.out.println(reverse);
//   }
// }


//-------Check Pallindrome

public class ReverseString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter String: ");
    String str = sc.nextLine();
String rev=str;
    String reverse = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      reverse += str.charAt(i);
    }
    if (reverse.equals(rev)){
      System.out.println("Pallindrome");

    }
    else{
      System.out.println("not");
    }
  }
}
