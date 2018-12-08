import java.util.*;
import static java.lang.System.*;

public class Ex2_9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double temp1, temp2;
    int op;
    out.print("Introduza uma temperatura: ");
    temp1 = sc.nextDouble();
    out.println("Opção: 0 - Celsius | 1 - Boolean");
    op = sc.nextInt();
    switch (op) {
    case 0:
      temp2 = (temp1 - 32) / 1.8;
      out.printf("%.2f ºF é equivalente a %.2f ºC.", temp1, temp2);
      break;
    case 1:
      temp2 = (temp1 * 1.8) + 32;
      out.printf("%.2f ºC é equivalente a %.2f ºF.", temp1, temp2);
      break;
    default:
      out.println("Valor desconhecido...");
      break;
    }
  }
}