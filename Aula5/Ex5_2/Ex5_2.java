import java.util.*;
import static java.lang.System.*;

public class Ex5_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    out.print("Palavra: ");
    String str = sc.nextLine();
    out.print("Nº de vezes: ");
    int n = sc.nextInt();
    printNTimes(n, str);
  }

  public static void printNTimes(int n, String str) {
    for (int i = 0; i < n; i++) {
      out.print(str);
    }
    out.println();
  }
}