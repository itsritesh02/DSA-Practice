
//------------No Return-Type

// public class Palindrome {

//   static void check(int n) {
//     int orig = n;
//     int reverse = 0;
//     while (n > 0) {
//       int rem = n % 10;
//       reverse = reverse * 10 + rem;
//       n = n / 10;
//     }
//     if (orig == reverse) {
//       System.out.println("pallindrome");
//     } else {
//       System.out.println("Not pallindrome");
//     }
//   }

//   public static void main(String[] args) {

//     int n = 1421;
//     check(n);
//   }

// }

//-----------------------------Boolean type

// public class Palindrome {
//   static boolean check(int n){
//     int orig = n;
//     int reverse = 0;
//     while(n>0){
//       int rem =n%10;
//       reverse= reverse*10+rem;
//       n=n/10;
//     }
//     return orig ==reverse;
//   }

//   public static void main(String[] args) {
//     int n=121;
// System.out.println(check(n));
//   }
// }


//-------------------String----------------

public class Palindrome{
  static void check (String str){
String reverse ="";
for(int i = str.length()-1;i>=0;i--){
  reverse+=str.charAt(i);
}
if(str.equals(reverse)){
  System.out.println("pallindrome");
}else{
  System.out.println("Not pallindrome");
}
  }

  public static void main(String[] args) {
    String str = "madam";
    check(str);
  }
}