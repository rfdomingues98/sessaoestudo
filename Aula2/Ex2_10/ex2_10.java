import java.util.*;
import static java.lang.System.*;

public class ex2_10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    final int d, m, a;
    boolean b = false;
    int numDias = 31;

    out.print("Dia (1-31): ");
    d = sc.nextInt();
    out.print("M�s (1-12): ");
    m = sc.nextInt();
    out.print("Ano (1900+): ");
    a = sc.nextInt();

    if (a % 400 == 0 || (a % 4 == 0 && a % 100 != 0)) {
      b = true;
    }

    switch (m) {
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:
      numDias = 31;
      break;
    case 4:
    case 6:
    case 9:
    case 11:
      numDias = 30;
      break;
    case 2:
      if (b) {
        numDias = 29;
      } else {
        numDias = 28;
      }
      break;
    default:
      out.println("M�s inv�lido!");
      break;
    }

    if (d == numDias && m == 12) {
      out.printf("O dia seguinte � %d/%d/%d\n", 1, 1, a + 1);
      out.printf("O dia anterior � %d/%d/%d\n", d - 1, m, a);
    } else if (d == numDias && m != 12) {
      out.printf("O dia seguinte � %d/%d/%d\n", 1, m + 1, a);
      out.printf("O dia anterior � %d/%d/%d\n", (d - 1), m, a);
    } else if (d == 1 && m != 1) {
      out.printf("O dia seguinte � %d/%d/%d\n", (d + 1), m, a);
      if (m == 3) {
        if (b) {
          out.printf("O dia anterior � %d/%d/%d\n", 29, m - 1, a);
        } else {
          out.printf("O dia anterior � %d/%d/%d\n", 28, m - 1, a);
        }
      } else {
        out.printf("O dia anterior � %d/%d/%d\n", numDias, m - 1, a);
      }
    } else if (d == 1 && m == 1) {
      out.printf("O dia seguinte � %d/%d/%d\n", (d + 1), m, a);
      out.printf("O dia anterior � %d/%d/%d\n", numDias, 12, a - 1);
    }

    sc.close();
  }
}