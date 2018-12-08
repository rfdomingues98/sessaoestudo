import java.util.*;
import static java.lang.System.*;

public class Ex6_4 {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    out.println("Introduza uma sequência de notas.");
    out.print("Quantas deseja introduzir: ");
    int n;
    do{
      out.println("0 a 50");
      n = sc.nextInt();
    } while(n > 50 || n < 0);

    int[] notas = new int[n];
    //inserir valores aleatorios
    for(int i = 0; i < n; i++) {
      notas[i] = (int)(Math.random() * 20);
    }

    // out.println("Notas: ");
    // for(int i = 0; i < n; i++) {
    //   int temp;
    //   do{
    //     temp = sc.nextInt();
    //     if(temp < 0 || temp > 20)
    //       out.println("Entre 0 e 20!");
    //   } while(temp < 0 || temp > 20);
    //   notas[i] = temp;
    // }
    hist(notas);
  }

  public static void hist(int[] notas) {
    int n = notas.length;
    out.println(" Histograma de Notas");
    out.println("-------------------------------------------------------");
    for(int i = 20; i >= 0; i--) {
      out.printf("%2d | ", i);
      for(int j = 0; j < n; j++) {
        if(notas[j] == i)
          out.print("*");
      }
      out.println();
    }
  }
}