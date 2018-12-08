import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Ex7_2 {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    if (args.length != 1 || args[0] == "-h") {
      out.printf("USAGE: java Ex7_3 <file_name>\n");
      exit(1);
    }
    String fName = args[0];
    File fin = new File(fName);
    int[] seq = new int[100];
    int c = 0;
    if (fin.exists()) {
      if (fin.isFile() && fin.canRead()) {
        Scanner scf = new Scanner(fin);
        while (scf.hasNextInt()) {
          if (scf.nextInt() >= 0)
            c++;
        }
        scf.close();
        scf = new Scanner(fin);
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
    out.print("Número a contar: ");
    int n = sc.nextInt();
    int k = 0;
    for (int i = 0; i < c; i++) {
      if (seq[i] == n) {
        k++;
      }
    }
    out.printf("O nº. %d aparece %d vezes na sequencia.\n", n, k);
  }
}