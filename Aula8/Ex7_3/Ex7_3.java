import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Ex7_3 {
  static Scanner sc = new Scanner(System.in);
  static int[] seq;
  static int maxSize = 50;
  static File fIn;
  static File fOut;
  static String fName;

  public static void main(String[] args) throws IOException {
    showMenu();
  }

  public static void showMenu() throws IOException {
    clrscr();
    out.printf("Análise de uma sequência de números inteiros\n");
    out.printf("\t 1 - Ler a sequência\n");
    out.printf("\t 2 - Escrever a sequência\n");
    out.printf("\t 3 - Calcular o máximo da sequência\n");
    out.printf("\t 4 - Calcular o mínimo da sequência\n");
    out.printf("\t 5 - Calcular a média da sequência\n");
    out.printf("\t 6 - Detetar se é uma sequência só constituída por números pares\n");
    out.printf("\t 7 - Ler sequência dum ficheiro\n");
    out.printf("\t 8 - Adicionar números à sequência existente\n");
    out.printf("\t 9 - Gravar sequência atual num ficheiro\n");
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
    case 7:
      readSeqFile();
      break;
    case 8:
      addToSeq();
      break;
    case 9:
      saveToFile();
      break;
    case 10:
      exit(1);
    }
  }

  public static void readSeq() throws IOException {
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

  public static void readSeqFile() throws IOException {
    out.println("File Name: ");
    fName = sc.next();
    fIn = new File(fName);
    if (fIn.exists()) {
      if (fIn.isFile() && fIn.canRead()) {
        Scanner scf = new Scanner(fIn);
        int c = 0;
        while (scf.hasNextInt()) {
          if (scf.nextInt() >= 0)
            c++;
        }
        scf.close();
        maxSize = c;
        scf = new Scanner(fIn);
        seq = new int[c];
        int i = 0;
        while (scf.hasNextInt()) {
          int temp = scf.nextInt();
          if (temp >= 0) {
            seq[i] = temp;
            i++;
          }
        }
        scf.close();
      }
    }
    out.printf("---\nSequência lida com sucesso!\n---\n");
    wfk();
    showMenu();
  }

  public static void writeSeq() throws IOException {
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

  public static void max() throws IOException {
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

  public static void min() throws IOException {
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

  public static void media() throws IOException {
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

  public static void par() throws IOException {
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

  public static void addToSeq() throws IOException {
    out.print("Quantos digitos quer adicionar à sequência: ");
    int x = sc.nextInt();
    int[] tempArray = seq;
    seq = new int[seq.length + x];
    for (int i = 0; i < tempArray.length; i++) {
      seq[i] = tempArray[i];
    }
    for (int i = tempArray.length; i < seq.length; i++) {
      int temp = sc.nextInt();
      if (temp != 0)
        seq[i] = temp;
    }
    maxSize = seq.length;
    wfk();
    showMenu();
  }

  public static void saveToFile() throws IOException {
    out.print("Nome do ficheiro a guardar: ");
    fName = sc.next();
    fOut = new File(fName);
    PrintWriter pw = new PrintWriter(fOut);
    for (int i = 0; i < seq.length; i++) {
      int temp = seq[i];
      pw.println(temp);
    }
    pw.close();
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