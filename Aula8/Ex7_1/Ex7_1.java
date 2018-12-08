import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Ex7_1 {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    String fName;
    File fIn;
    do {
      out.println("Nome do ficheiro: ");
      fName = sc.nextLine();
      fIn = new File(fName);
      if(!fIn.isFile()) {
        out.println("File not found!");
      } else if(!fIn.canRead()) {
        out.println("Cannot read file!");
      } else {
        Scanner scf = new Scanner(fIn);
        while(scf.hasNextLine()) {
          out.println(scf.nextLine());
        }
        scf.close();
        sc.close();
      }
    } while(!fIn.canRead());
  }
}