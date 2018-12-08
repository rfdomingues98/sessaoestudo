import java.util.*;
import static java.lang.System.*;

import java.io.*;

public class Ex7_4 {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    out.println("Introduza uma sequência de notas.");
    out.print("Quantas deseja introduzir: ");
    int n;
    do {
      out.println("0 a 50");
      n = sc.nextInt();
    } while (n > 50 || n < 0);

    int[] notas = new int[n];
    // inserir valores aleatorios
    for (int i = 0; i < n; i++) {
      notas[i] = (int) (Math.random() * 20);
    }

    // out.println("Notas: ");
    // for(int i = 0; i < n; i++) {
    // int temp;
    // do{
    // temp = sc.nextInt();
    // if(temp < 0 || temp > 20)
    // out.println("Entre 0 e 20!");
    // } while(temp < 0 || temp > 20);
    // notas[i] = temp;
    // }
    hist(notas);
  }

  public static void hist(int[] notas) throws IOException {
    out.printf("\nIntroduza o nome do ficheiro para gravar o histograma: ");
    String fName = sc.next();
    File fOut = new File(fName);
    PrintWriter pw = new PrintWriter(fOut);
    int n = notas.length;
    out.println();
    pw.println(" Histograma de Notas");
    pw.println("-------------------------------------------------------");
    for (int i = 20; i >= 0; i--) {
      pw.printf("%2d | ", i);
      for (int j = 0; j < n; j++) {
        if (notas[j] == i)
          pw.print("*");
      }
      pw.println();
    }
    pw.close();
  }
}