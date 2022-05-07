import java.util.Arrays;
import java.util.Scanner;

public class Hello {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("please enter your name --->");
    String name = input.nextLine();
    System.out.print("Hello ->" + name);

  }
}