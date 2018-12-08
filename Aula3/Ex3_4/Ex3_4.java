import java.util.*;
import static java.lang.System.*;

public class Ex3_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    out.println("Introduza quantos n números quer somar: ");
    int n = sc.nextInt();
    double sum = 0;
    double val = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 2 != 0) {
        val = 0;
        val = Math.pow(-1, i + 1) * (1 / i);
        sum += val;
        if (i != n) {
          if (val > 0)
            out.printf("%f + ", val);
          else
            out.printf("%f - ", val);
        } else {
          out.printf("%f = ", val);
        }
      }
    }
    out.println(sum);
  }
}