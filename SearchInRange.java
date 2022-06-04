// Q.-> Search in the range of 3 to 9
public class SearchInRange {
  public static void main(String[] args) {
    int[] myArr = { 2, 3, 6, 65, 73, 64, 63, 23, 24, 53, 62, 71, 12 };
    System.out.println(search(3, 9, 63, myArr));
  }

  static boolean search(int start, int end, int target, int[] arr) {
    if (start > end)
      return false;

    if (target == arr[start] || target == arr[end])
      return true;

    for (int i = start; i <= end; i++) {
      if (arr[i] == target)
        return true;
    }
    return false;
  }
}
