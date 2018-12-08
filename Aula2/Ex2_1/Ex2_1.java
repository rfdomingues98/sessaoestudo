import java.util.*;
import static java.lang.System.*;

public class Ex2_1 {
  static Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args) {
    out.print("TPG1: ");
    int tpg1 = sc.nextInt();
    out.print("TPG2: ");
    int tpg2 = sc.nextInt();
    out.print("EI: ");
    int ei = sc.nextInt();
    boolean passou;
    double nota = tpg1*0.2 + tpg2*0.3 + ei*0.5;
    passou = (nota > 9.5) ? true : false;

    if(passou) {
      out.println("Aprovado");
    } else {
      out.println("Reprovado");
    }
  }
}