import java.util.*;
import static java.lang.System.*;

public class Ex3_8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b;
    out.println("Introduza um intervalo [a,b], a,b > 0");
    out.print("a: ");
    do {
      a = sc.nextInt();
    } while (a < 0);
    out.print("b: ");
    do {
      b = sc.nextInt();
    } while (b < 0);
    for (int i = a; i <= b; i++) {
      if (i % 2 != 0) {
        out.print(i + " ");
      }
    }
  }
}