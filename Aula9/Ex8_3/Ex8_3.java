import java.util.*;
import static java.lang.System.*;

public class Ex8_3 {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    // Cria um registo de estatisticas:
    Statistics xstat = new Statistics();

    // Enquanto houver um valor para ler:
    while (sc.hasNextDouble()) {
      // Lê um valor:
      double x = sc.nextDouble();
      // Atualiza o registo de estatisticas:
      updateStats(xstat, x);
    }

    // Escreve resultados:
    System.out.printf("numero de valores = %d\n", xstat.num);
    System.out.printf("soma dos valores = %f\n", xstat.sum);
    System.out.printf("soma dos quadrados = %f\n", xstat.sum2);

    if (xstat.num > 0) {
      System.out.printf("min = %f\n", xstat.min);
      System.out.printf("max = %f\n", xstat.max);
      System.out.printf("m�dia = %f\n", mean(xstat));
      System.out.printf("variancia = %f\n", variance(xstat));
    } else {
      System.out.printf("Lista vazia!\n");
    }
  }

  // Definir funções updateStats, mean e variance!
  public static void updateStats(Statistics stat, double x) {
    stat.num++;
    if (x > stat.max) {
      stat.max = x;
    }
    if (stat.min > x) {
      stat.min = x;
    }
    stat.sum += x;
    stat.sum2 += Math.pow(x, 2);
  }

  public static double mean(Statistics stat) {
    return stat.sum / stat.num;
  }

  public static double variance(Statistics stat) {
    return stat.sum2 / (stat.num - Math.pow(mean(stat), 2));
  }
}

class Statistics {
  int num;
  double max, min, sum, sum2;
}