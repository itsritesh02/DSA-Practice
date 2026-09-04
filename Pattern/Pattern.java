
// public class Pattern {
//   public static void main(String[] args) {
//     int n = 5;
//     for (int i = 0; i <= n; i++) {
//       for (int j = 0; j <= n; j++) {
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//   }
// }

// Output
// ******
// ******
// ******
// ******
// ******
// ******

// -----------------------------------------------------------

// public class Pattern {
//   public static void main(String[] args) {
//     int n = 5;
//     for (int i = 0; i <= n; i++) {
//       for (int j = 0; j <= i; j++) {
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//   }
// }
// Output
// *
// **
// ***
// ****
// *****
// ******

//-------------Left Align-------------------------------------------------------

// public class Pattern {
//   public static void main(String[] args) {
//     int n = 5;
//     for (int i = n; i >=1; i--) {
//       for (int j = 1; j <=i; j++) {
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//   }
// }
// Output
// *****
// ****
// ***
// **
// *

// -----------------------------------------------------------------

// public class Pattern {
//   public static void main(String[] args) {
//     int n = 5;
//     for (int i = n; i >= 1; i--) {

// for(int j=1;j<=n-i;j++){
//   System.out.print(" ");
// }
//       for (int j = 1; j <= i; j++) {
//         System.out.print("*");
//       }

//       System.out.println();
//     }
//   }
// }

// Output
// *****
//  ****
//   ***
//    **
//     *

// -----------------------------------------------------------------

// public class Pyramid {
//   public static void main(String[] args) {

//     int n = 5;

//     for (int i = 1; i <= n; i++) {

//       // spaces
//       for (int j = 1; j <= n - i; j++) {
//         System.out.print(" ");
//       }

//       // stars
//       for (int j = 1; j <= 2 * i - 1; j++) {
//         System.out.print("*");
//       }

//       System.out.println();
//     }
//   }
// }

// Output
//     *
//    ***
//   *****
//  *******
// *********

// -----------------------------------------------------------------

// public class Pyramid {
//   public static void main(String[] args) {

//     int n = 5;

//     for (int i = n; i >=1; i--) {

//       // spaces
//       for (int j = 1; j <= n - i; j++) {
//         System.out.print(" ");
//       }

//       // stars
//       for (int j = 1; j <= 2 * i - 1; j++) {
//         System.out.print("*");
//       }

//       System.out.println();
//     }
//   }
// }

// Output

// *********
//  *******
//   *****
//    ***
//     *

// -----------------------------------------------------------------

// public class Pyramid {
//   public static void main(String[] args) {

//     int n = 5;

//     for (int i = 1; i <= n; i++) {

//       for (int j = 1; j <= n - i; j++) {
//         System.out.print(" ");
//       }

//       for (int j = 1; j <= 2 * i - 1; j++) {
//         System.out.print("*");
//       }

//       System.out.println();
//     }

//     for (int i = n-1; i >=1; i--) {

//       for (int j = 1; j <= n - i; j++) {
//         System.out.print(" ");
//       }

//       for (int j = 1; j <= 2 * i - 1; j++) {
//         System.out.print("*");
//       }

//       System.out.println();
//     }

//   }
// }

//Pyramid And Inverted Pyramid Ko add kr do 

//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     * 

// -----------------------------------------------------------------

// public class Pattern {
//   public static void main(String[] args) {
//     int n = 5;
//     for (int i = 0; i <= n; i++) {
//       for (int j = 1; j <= i; j++) {
//         System.out.print(j);
//       }
//       System.out.println();
//     }
//   }
// }
// Output
// 1
// 12
// 123
// 1234
// 12345

// -----------------------------------------------------------------

// public class Pattern {
//   public static void main(String[] args) {
//     int n = 5;
//     for (int i = 0; i <= n; i++) {
//       for (int j = 1; j <= i; j++) {
//         System.out.print(i);
//       }
//       System.out.println();
//     }
//   }
// }
// Output
// 1
// 22
// 333
// 4444
// 55555

// -----------------------------------------------------------------

// public class Pattern {
//   public static void main(String[] args) {
//     int n = 5;
//     int num=1;
//     for (int i = 0; i <= n; i++) {
//       for (int j = 1; j <= i; j++) {
//         System.out.print(num +" ");
//         num++;
//       }
//       System.out.println();
//     }
//   }
// }

// Output
// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

// -----------------------------------------------------------------

// public class Pattern {
//   public static void main(String[] args) {
//     int n = 5;

//     for (int i = n; i >=1; i--) {
//       for (int j = 1; j <=i; j++) {
//         System.out.print(j);

//       }
//       System.out.println();
//     }
//   }
// }
// Output
// 12345
// 1234
// 123
// 12
// 1

// -----------------------------------------------------------------

// public class Pattern {
//   public static void main(String[] args) {
//     int n = 5;

//     for (int i = n; i >= 1; i--) {
//       for (int j = i; j >=1; j--) {
//         System.out.print(j);

//       }
//       System.out.println();
//     }
//   }
// }
// Output
// 54321
// 4321
// 321
// 21
// 1

// -----------------------------------------------------------------

// public class Pattern {
// public static void main(String[] args) {
// int n = 5;

// for (int i = 1; i <=n; i++) {
// for (int j = i; j >=1; j--) {
// System.out.print(j);

// }
// System.out.println();
// }
// }
// }
// Output
// 1
// 21
// 321
// 4321
// 54321

// -----------------------------------------------------------------

// public class Pattern {
//   public static void main(String[] args) {
//     int n = 5;

//     for (int i = 1; i <= n; i++) {

//       for (int j = n - i; j >= 1; j--) {
//         System.out.print(" ");
//       }

//       for (int j = 1; j < i; j++) {
//         System.out.print(j);
//       }

//       for (int j = i; j >= 1; j--) {
//         System.out.print(j);
//       }

//       System.out.println();
//     }
//   }
// }

// Output
//  1
//    121
//   12321
//  1234321
// 123454321

// -----------------------------------------------------------------

// public class Pattern {
// public static void main(String[] args) {
// int n = 5;

// for (int i = 1; i <= n; i++) {

// for (int j = n - i; j >= 1; j--) {
// System.out.print(" ");
// }

// for (int j = 1; j < i; j++) {
// System.out.print(j);
// }

// for (int j = i; j >= 1; j--) {
// System.out.print(j);
// }

// System.out.println();
// }
// }
// }

// -----------------------------------------------------------------

// public class Pattern {
//   public static void main(String[] args) {
//     int n = 5;

//     for (int i = 1; i <= n; i++) {

//       for (int j = 1; j < i; j++) {
//         System.out.print(j);
//       }

//       for (int j = i; j >= 1; j--) {
//         System.out.print(j);
//       }

//       System.out.println();
//     }
//   }
// }

// Output
// 1
// 121
// 12321
// 1234321
// 123454321

// -----------------------------------------------------------------

// public class Pattern {
//   public static void main(String[] args) {
//     int n = 5;

//     for (int i = 1; i <= n; i++) {

//       for (char j = 'A'; j < 'A' + i; j++) {
//         System.out.print(j);
//       }

//       System.out.println();
//     }
//   }
// }

// A
// AB
// ABC
// ABCD
// ABCDE

// -----------------------------------------------------------------

public class Pattern {
  public static void main(String[] args) {

    int n = 5;

    for (int i = 1; i <= n; i++) {

      char ch = (char) ('A' + i - 1);

      for (int j = 1; j <= i; j++) {
        System.out.print(ch);
      }

      System.out.println();
    }
  }
}