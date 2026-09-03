import java.util.Scanner;

public class RemoveDuplicates {


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  System.out.println("Enter size of Array");
  int n = sc.nextInt();

  int arr[] = new int[n];
System.out.println("Enter Array Elements");
  for (int i = 0; i < n; i++) {
    arr[i] = sc.nextInt();
  }

int j=1;

for(int i=1; i<n;i++){
if(arr[i]!=arr[i-1]){
  arr[j]=arr[i];
  j++;
}
}
System.out.println("Array after remove duplicaates");
for(int i=0;i<j;i++){
  System.out.print(arr[i] + " ");
}


  }
}
