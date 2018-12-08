import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Ex7_5 {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    String iName = sc.next();
    String oName = sc.next();
    File fIn = new File(iName);
    File fOut = new File(oName);
    Scanner scf = new Scanner(fIn);
    PrintWriter pw = new PrintWriter(fOut);

    while (scf.hasNextLine()) {
      String line = scf.nextLine();
      if (!line.contains("//") && !line.contains("/*") && !line.contains("*/")) {
        pw.println(line);
      }
      if (line.contains("/*")) {
        do {
          line = scf.nextLine();
        } while (line.contains("*/"));
      }
    }
    pw.close();
    scf.close();

  }
}