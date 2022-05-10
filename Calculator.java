import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter two numbers to calculate --> ");
    int a = in.nextInt();
    int b = in.nextInt();
    System.out.print("Please enter an Operator to perform a calculation --> ");
    char opt = in.next().trim().charAt(0);

    if (opt == '+') {
      System.out.println("plus result is --> " + (a + b));
    } else if (opt == '-') {
      System.out.println("minus result is --> " + (a - b));
    } else if (opt == '*') {
      System.out.println("multiply result is --> " + (a * b));
    } else if (opt == '/') {
      if (a < b) {
        System.out.println("cannot perform because divident is smaller than divider");
      } else {
        System.out.println("divided result is --> " + (a / b));
      }
    } else if (opt == '%') {
      if (a < b) {
        System.out.println("cannot perform because divident is smaller than divider");
      } else {
        System.out.println("remainder result is --> " + (a % b));
      }
    }
  }
}
