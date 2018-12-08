import java.util.*;
import static java.lang.System.*;

public class Ex8_2 {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    Ponto2D o = new Ponto2D();
    Ponto2D maxDistPoint = o;
    double maxDist = 0;
    Ponto2D temp;
    double dist;
    double soma = 0;
    int c = 0;
    do {
      temp = lerPonto();
      if (temp.x != 0 || temp.y != 0) {
        c++;
        dist = dist(temp, o);
        soma += dist;
        if (dist > maxDist) {
          maxDist = dist;
          maxDistPoint = temp;
        }
      }
    } while (temp.x != 0 || temp.y != 0);

    out.printf("A soma das distâncias dos %d pontos à origem é %.2f.\n", c, soma);
    out.printf("O ponto mais afastado da origem foi %s.\n", escreverPonto(maxDistPoint));
  }

  public static Ponto2D lerPonto() {
    out.println("Introduza um ponto:");
    out.print("x: ");
    double x = sc.nextDouble();
    out.print("y: ");
    double y = sc.nextDouble();
    Ponto2D p = new Ponto2D(x, y);
    return p;
  }

  public static String escreverPonto(Ponto2D p) {
    return String.format("(%.2f, %.2f)", p.x, p.y);
  }

  public static double dist(Ponto2D p1, Ponto2D p2) {
    return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
  }
}

class Ponto2D {
  double x;
  double y;

  Ponto2D() {
    this.x = 0;
    this.y = 0;
  }

  Ponto2D(double x, double y) {
    this.x = x;
    this.y = y;
  }
}