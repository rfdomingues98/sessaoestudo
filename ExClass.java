import java.util.*;
import static java.lang.System.*;

public class ExClass {
  public static void main(String[] args) {
    Aluno[] alunos = new Aluno[3]; 
    Scanner sc = new Scanner(System.in);
    String nome = sc.nextLine();
    int idade = sc.nextInt();
    int nmec = sc.nextInt();
    alunos[0] = new Aluno();
    alunos[1] = new Aluno("Adalberto", 15, 12123);
    alunos[2] = new Aluno(nome, idade, nmec);

    for(int i = 0; i < 3; i++) {
      out.printf("%s - %d - %d\n", alunos[i].nome, alunos[i].idade, alunos[i].nmec);
    }
  }
}
class Aluno {
  String nome;
  int idade;
  int nmec;
  Aluno(String n, int i, int nm) {
    this.nome = n;
    this.idade = i;
    this.nmec = nm;
  }
  Aluno() {
    this.nome = "João";
    this.idade = 20;
    this.nmec = 00000;
  }
}