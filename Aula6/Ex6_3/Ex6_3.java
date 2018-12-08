import java.util.*;
import static java.lang.System.*;

public class Ex6_3 {
  static Scanner sc = new Scanner(System.in);
  static int[] seq;
  static int maxSize = 50;

  public static void main(String[] args) {
    showMenu();

  }

  public static void showMenu() {
    clrscr();
    out.printf("Análise de uma sequência de números inteiros\n");
    out.printf("\t 1 - Ler a sequência\n");
    out.printf("\t 2 - Escrever a sequência\n");
    out.printf("\t 3 - Calcular o máximo da sequência\n");
    out.printf("\t 4 - Calcular o mínimo da sequência\n");
    out.printf("\t 5 - Calcular a média da sequência\n");
    out.printf("\t 6 - Detetar se é uma sequência só constituída por números pares\n");
    out.printf("\t10 - Terminar o programa\n");
    out.printf("Opção -> ");
    int op;
    do {
      op = sc.nextInt();
    } while (op < 1 || op > 10);

    switch (op) {
    case 1:
      readSeq();
      break;
    case 2:
      writeSeq();
      break;
    case 3:
      max();
      break;
    case 4:
      min();
      break;
    case 5:
      media();
      break;
    case 6:
      par();
      break;
    case 10:
      exit(1);
    }
  }

  public static void readSeq() {
    seq = new int[maxSize];
    out.println("0 para terminar a sequência");
    for (int i = 0; i < maxSize; i++) {
      int temp = sc.nextInt();
      if (temp == 0) {
        break;
      } else {
        seq[i] = temp;
      }
    }
    out.printf("---\nSequência lida com sucesso!\n---\n");
    wfk();
    showMenu();
  }

  public static void writeSeq() {
    out.print("\nSequência:\n----\n");
    for (int i = 0; i < maxSize; i++) {
      if (seq[i] == 0) {
        break;
      }
      out.printf("%d ", seq[i]);
    }
    out.print("\n----\n");
    wfk();
    showMenu();
  }

  public static void max() {
    int max = 0;
    for (int i = 0; i < maxSize; i++) {
      if (seq[i] == 0) {
        break;
      }
      if (seq[i] > max) {
        max = seq[i];
      }
    }
    out.printf("\nMáximo:\n----\n%d\n----\n", max);
    wfk();
    showMenu();
  }

  public static void min() {
    int min = seq[0];
    for (int i = 0; i < maxSize; i++) {
      if (seq[i] == 0) {
        break;
      }
      if (seq[i] < min) {
        min = seq[i];
      }
    }
    out.printf("\nMínimo:\n----\n%d\n----\n", min);
    wfk();
    showMenu();
  }

  public static void media() {
    double soma = 0, n = 0;
    for (int i = 0; i < maxSize; i++) {
      if (seq[i] != 0) {
        soma += seq[i];
        n++;
      }
    }
    double media = soma / n;
    out.printf("\nMédia:\n----\n%.2f\n----\n", media);
    wfk();
    showMenu();
  }

  public static void par() {
    boolean par = true;
    for (int i = 0; i < maxSize; i++) {
      if (seq[i] == 0) {
        break;
      }
      if (seq[i] % 2 != 0) {
        par = false;
        break;
      }
    }
    if (!par)
      out.print("\n----\nA sequência não tem apenas elementos pares!\n----\n");
    else
      out.print("\n----\nA sequência tem apenas elementos pares!\n----\n");
    wfk();
    showMenu();
  }

  public static void wfk() {
    out.printf("\nPress any key to continue...\n");
    try {
      in.read();
    } catch (Exception e) {
      out.println("Error!");
    }
  }

  public final static void clrscr() {
    System.out.printf("\033[H\033[2J");
  }
}