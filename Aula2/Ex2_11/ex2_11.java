import java.util.*;
import static java.lang.System.*;

public class ex2_11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a, b, c, res1, res2;
    double delta;

    out.print("a: ");
    a = sc.nextDouble();
    out.print("b: ");
    b = sc.nextDouble();
    out.print("c: ");
    c = sc.nextDouble();

    delta = Math.pow(b, 2) - (4 * a * c);
    res1 = ((-b) + Math.sqrt(delta) / (2 * a));
    res2 = ((-b) - Math.sqrt(delta) / (2 * a));

    if(delta < 0) {
      out.printf("x = ");
    }
    
  }
}