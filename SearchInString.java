public class SearchInString {
  public static void main(String[] args) {
    String name = "Rahul";
    char target = 'k';

    System.out.println(search(name, target));
  }

  static boolean search(String str, char ch) {
    if (str.length() == 0) {
      return false;
    }

    for (int c = 0; c < str.length(); c++) {
      if (str.charAt(c) == ch) {
        return true;
      }
    }
    return false;
  }

}
