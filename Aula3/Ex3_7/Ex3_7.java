import java.util.*;
import static java.lang.System.*;

public class Ex3_7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int c, l;

    out.println("Comprimento: ");
    c = sc.nextInt();
    out.println("Largura: ");
    l = sc.nextInt();

    for (int i = 0; i < l; i++) { // for para criar as linhas do quadrado
      out.print("*"); // insere o primeiro * de cada linha
      for (int j = 1; j < c - 1; j++) { // for para criar as colunas interiores do quadrado (todas menos a primeira e
                                        // ultima)
        if (i == 0 || i == l - 1) { // verifica se estás na primeira ou ultima linha, se sim
          out.print("*"); // preenche com *
        } else { // se não
          out.print(" "); // preenche com espaços vazios
        }
      }
      out.println("*"); // insere o ultimo * de cada linha
    }
  }
}