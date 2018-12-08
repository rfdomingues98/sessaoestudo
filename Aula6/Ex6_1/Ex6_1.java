import java.util.*;
import static java.lang.System.*;

public class Ex6_1 {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    out.print("N: ");
    int n = sc.nextInt();

    int[] seq = new int[n];

    for(int i = 0; i < n; i++) {
      seq[i] = sc.nextInt();
    }

    for(int i = n-1; i >= 0; i--) {
      out.printf("%d ", seq[i]);
    }
    out.println();
  }
}