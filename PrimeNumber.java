import java.util.Scanner;

public class PrimeNumber {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number to check is it Prime Number or not");
    int num = in.nextInt();
    boolean isPrime = checkPrime(num);
    System.out.println(num + " isPrime= " + isPrime);

  }

  static boolean checkPrime(int num) {
    if (num < 2) {
      return true;
    }
    int count = 2;
    while ((count * count) < num) {
      int remainder = num % count;
      if (remainder == 0) {
        return false;
      }
      count++;
    }
    return true;
  }
}