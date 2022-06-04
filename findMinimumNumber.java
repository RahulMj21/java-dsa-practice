public class findMinimumNumber {
  public static void main(String[] args) {
    int[] myArr = { 3, 5, 2, 75, -3, 34, 235, -1243 };
    System.out.println(findMinimum(myArr));
    System.out.println(findMaximum(myArr));
  }

  static int findMinimum(int[] arr) {
    int result = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < result)
        result = arr[i];
    }
    return result;
  }

  static int findMaximum(int[] arr) {
    int result = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > result)
        result = arr[i];
    }
    return result;
  }
}
