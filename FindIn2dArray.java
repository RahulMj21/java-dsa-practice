public class FindIn2dArray {
  public static void main(String[] args) {
    int[][] myArr = {
        { 1, 3, 5, 65, 34 },
        { 65, 6, 39, },
        { 22, 46, 66, 84 },
    };

    System.out.println(search(myArr, 66));
  }

  static String search(int[][] arr, int target) {
    for (int row = 0; row < arr.length; row++) {
      for (int column = 0; column < arr[row].length; column++) {
        if (arr[row][column] == target)
          return "arr[" + row + "][" + column + "]";
      }
    }
    return "Not Found";
  }

}
