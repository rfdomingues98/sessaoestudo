import java.util.*;
import static java.lang.System.*;

public class Ex6_2 {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int[] seq = new int[100];
    for (int i = 0; i < 100; i++) {
      int temp = sc.nextInt();
      if (temp < 0) {
        break;
      } else {
        seq[i] = temp;
      }
    }
    out.print("Número a contar: ");
    int n = sc.nextInt();
    int c = 0;
    for (int i = 0; i < 100; i++) {
      if (seq[i] == n) {
        c++;
      }
    }
    out.printf("O nÂº. %d aparece %d vezes na sequencia.", n, c);
  }
}