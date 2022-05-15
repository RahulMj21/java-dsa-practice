import java.util.Scanner;

class SwitchCase {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("input two numbers to make calculation");
    int a = in.nextInt();
    int b = in.nextInt();
    System.out.println("Now enter an operator to perform calculation");
    char opt = in.next().trim().charAt(0);
    switch (opt) {
      case '+':
        System.out.println("plus-->" + (a + b));
      case '-':
        System.out.println("minus-->" + (a - b));
      case '*':
        System.out.println("multiply-->" + (a * b));
      case '/':
        if (a < b) {
          System.out.println("invalid input");
        } else {
          System.out.println("divide-->" + (a / b));
        }
      case '%':
        if (a < b) {
          System.out.println("invalid input");
        } else {
          System.out.println("remainder-->" + (a / b));
        }
      default:
        System.out.println("invalid input");
    }
  }
}