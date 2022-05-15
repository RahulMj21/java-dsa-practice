import java.util.Scanner;

public class ArmstrongNumber {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number to check it's armstrong or not");
    int num = in.nextInt();
    int length = Integer.toString(num).length();
    checkArmstrong(num, length);
  }

  static void checkArmstrong(int num, int multiplyTiming) {
    if (num <= 0 || multiplyTiming < 2) {
      System.out.println("please enter a valid number to check");
    }
    int copy = num;
    int total = 0;
    while (num > 0) {
      int a = num % 10;
      int sum = a * a;
      for (int i = 1; i < (multiplyTiming - 1); i++) {
        sum *= a;
      }
      total += sum;
      sum = 0;
      num /= 10;
    }
    if (copy == total) {
      System.out.println(copy + " is an Armstrong number");
    } else {
      System.out.println(copy + " is not an Armstrong number");
    }
  }
}
