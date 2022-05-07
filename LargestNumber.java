import java.util.Scanner;

public class LargestNumber {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter 5 numbers to find the largest one --> ");
    // int[] arr=new int[5];
    int val = 0;
    for (int i = 0; i < 5; i++) {
      int max = in.nextInt();
      if (max > val) {
        val = max;
      }
    }

    System.out.println(val + " is the largest number");

  }
}