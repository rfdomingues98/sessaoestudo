import java.util.*;

public class Ex4_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double n, prod = 1;
    int c = 0; // contador de elementos da "lista"
    do {
      System.out.println("Introduza uma sequência de números (0 para parar): ");
      n = sc.nextDouble();
      if (n != 0) {
        prod *= n;
        c++; // incrementador de elementos da lista
      }
    } while (n != 0);

    if (c == 0)
      System.out.println("Lista vazia...");
    else {
      System.out.println("Produto: " + prod);
    }
    sc.close();
  }
}