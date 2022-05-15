import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter range to see the fibonacci number");

    int range = in.nextInt();

    int a = 0;
    int b = 1;
    int count = 2;

    if (range <= 0) {
      System.out.println("please enter a valid range");
    }
    while (count <= range) {
      int temp = b;
      b += a;
      a = temp;
      count++;
    }
    System.out.println("result is --> " + b);
  }
}
