import java.util.*;
import static java.lang.System.*;

public class Ex3_12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nDias = 0;
    boolean bis = false;
    out.print("Ano: ");
    int a = sc.nextInt();
    out.print("Mês: ");
    int m = sc.nextInt();
    if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) {
      bis = true;
    }
    out.println("Ano começa a:");
    out.println("     1 - Domingo");
    out.println("     2 - Segunda");
    out.println("     3 - Terça");
    out.println("     4 - Quarta");
    out.println("     5 - Quinta");
    out.println("     6 - Sexta");
    out.println("     7 - Sábado");
    out.print("Opção: ");
    int d = sc.nextInt();

    out.println("----------------------");
    switch (m) {
    case 1:
      out.printf("|    January %d    |\n", a);
      break;
    case 2:
      out.printf("|    February %d   |\n", a);
      break;
    case 3:
      out.printf("|     March %d     |\n", a);
      break;
    case 4:
      out.printf("|     April %d     |\n", a);
      break;
    case 5:
      out.printf("|      May %d      |\n", a);
      break;
    case 6:
      out.printf("|      June %d     |\n", a);
      break;
    case 7:
      out.printf("|      July %d     |\n", a);
      break;
    case 8:
      out.printf("|     August %d    |\n", a);
      break;
    case 9:
      out.printf("|   September %d   |\n", a);
      break;
    case 10:
      out.printf("|    October %d    |\n", a);
      break;
    case 11:
      out.printf("|    November %d   |\n", a);
      break;
    case 12:
      out.printf("|    December %d   |\n", a);
      break;
    default:
      out.println("Mês Inválido");
      break;
    }
    switch (m) {
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:
      nDias = 31;
      break;
    case 4:
    case 6:
    case 9:
    case 11:
      nDias = 30;
      break;
    case 2:
      if (bis) {
        nDias = 29;
      } else {
        nDias = 28;
      }
      break;
    default:
      out.println("Mês inválido!");
    }
    out.println("----------------------");
    out.println("|Su Mo Tu We Th Fr Sa|");
    out.println("----------------------");

    int j = 0, c = 0;
    boolean inicio = true;
    for (int i = 1; i <= nDias; i++) {
      if (inicio) {
        out.print("|");
        inicio = false;
      }
      while (j != d - 1) {
        out.print("   ");
        j++;
      }
      if ((j + i) % 7 == 0) {
        out.printf("%2d|\n", i);
        c = 0;
        inicio = true;
      } else {
        out.printf("%2d ", i);
        c++;
      }
    }
    if (c > 0) {
      do {
        out.print("  ");
        if (c == 6) {
          out.printf("|\n");
        } else {
          out.print(" ");
        }
        c++;
      } while (c != 7);
    }
    out.println("----------------------");
  }
}