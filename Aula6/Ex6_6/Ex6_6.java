import java.util.*;
import static java.lang.System.*;

public class Ex6_6 {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    out.println("Escreva uma frase: ");
    String str = sc.nextLine();
    int size = str.length();
    char[] arr = new char[size];
    boolean exists = false;
    for (int i = 0; i < size; i++) {
      exists = false;
      for (char c : arr) {
        if (c == str.charAt(i)) {
          exists = true;
        }
      }
      if (exists == false) {
        for (int j = 0; j < size; j++) {
          if (arr[j] == 0) {
            if (str.charAt(i) != ' ') {
              arr[j] = str.charAt(i);
              break;
            }
          }
        }
      }
    }

    out.println("As letras que aparecem são: ");
    for (int i = 0; i < arr.length; i++) {
      out.printf("%c ", arr[i]);
    }
    out.println();
  }
}