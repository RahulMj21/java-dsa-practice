import java.util.Scanner;

public class CaseCheck {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a charecter to check it's uppercase or lowercase--> ");
    char letter = input.next().trim().charAt(0);

    if (letter >= 'a' && letter <= 'z') {
      System.out.println("lowercase");
    } else if (letter >= 'A' && letter <= 'Z') {
      System.out.println("Uppercase");
    } else {
      System.out.println("invalid input");
    }
  }
}
