import java.util.*;
import static java.lang.System.*;

public class Ex6_5 {
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    out.print("N: ");
    int n = sc.nextInt();
    double[] seq = new double[n];
    for(int i = 0; i < n; i++) {
      seq[i] = sc.nextDouble();
    }
    double media = media(seq);
    double desvio = desvio(seq);

    out.printf("-----\nMédia: %.2f | Desvio Padrão: %.2f \n-----\n", media, desvio);
  }

  public static double media(double[] seq) {
    int n = seq.length;
    double soma = 0;
    for(int i = 0; i < n; i++) {
      soma += seq[i];
    }
    return soma/n;
  }

  public static double desvio(double[] seq) {
    double media = media(seq);
    int n = seq.length;
    double soma = 0;
    for(int i = 0; i < n; i++) {
      soma += Math.pow(seq[i] - media, 2);
    }
    return Math.sqrt(soma/n);
  }
} 