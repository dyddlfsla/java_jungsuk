package chapter.six;

public class Ex6_15 {

  static int[] arr = new int[10];

  static {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int) (java.lang.Math.random() * 10) + 1;
    }
  }

  public static void main(String[] args) {
    for (int i = 0; i < arr.length; i++) {
      System.out.printf("arr[" + "%d" + "] : %d%n", i, arr[i]);
    }
  }
}
