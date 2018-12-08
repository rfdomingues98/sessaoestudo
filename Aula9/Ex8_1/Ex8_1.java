import java.util.*;
import static java.lang.System.*;

public class Ex8_1 {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    Hora inicio = new Hora(); // tem de definir o novo tipo Hora!
    Hora fim = new Hora();

    inicio.h = 9;
    inicio.m = 23;
    inicio.s = 5;

    out.print("Começou às ");
    printHora(inicio); // crie esta função!
    out.println(".");
    out.println("Quando termina?");
    fim = lerHora(); // crie esta função!
    out.print("Início: ");
    printHora(inicio);
    out.print(" Fim: ");
    printHora(fim);
    out.println();
  }

  public static void printHora(Hora hora) {
    out.printf("%2d:%2d:%2d\n", hora.h, hora.m, hora.s);
  }

  public static Hora lerHora() {
    int h = 0, m = 0, s = 0;
    out.print("Hora: ");
    do {
      h = sc.nextInt();
    } while (h < 0 || h > 23);
    out.print("Minutos: ");
    do {
      m = sc.nextInt();
    } while (m < 0 || m > 60);
    out.print("Segundos: ");
    do {
      s = sc.nextInt();
    } while (s < 0 || s > 60);
    Hora temp = new Hora(h, m, s);
    return temp;
  }
}

class Hora {
  int h, m, s;

  Hora(int h, int m, int s) {
    this.h = h;
    this.m = m;
    this.s = s;
  }

  Hora() {
    this.h = 0;
    this.m = 0;
    this.s = 0;
  }
}