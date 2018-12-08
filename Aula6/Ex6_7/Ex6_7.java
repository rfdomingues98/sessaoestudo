import java.util.*;
import static java.lang.System.*;

public class Ex6_7 {
  static Scanner sc = new Scanner(System.in);
  static int totalCount;
  public static void main(String[] args) {
    out.println("Insira o intervalo [a,b], a<b: ");
    int a = 0, b = 0;
    do {
      out.print("a: ");
      a = sc.nextInt();
      out.print("b: ");
      b = sc.nextInt();
    } while (a > b);

    out.print("Gerar quantos valores: ");
    int n = sc.nextInt();
    int[] seq;
    int count;
    seq = randGen(a, b, n);
    for (int i = 0; i < n; i++) {
      if (i == 0) {
        out.printf("{ %d, ", seq[i]);
      } else if (i == n - 1) {
        out.printf("%d }\n", seq[i]);
      } else {
        out.printf("%d, ", seq[i]);
      }
    }
    duplicate(seq);
  }

  public static int[] randGen(int a, int b, int n) {
    int[] seq = new int[n];
    for (int i = 0; i < n; i++) {
      seq[i] = (int) (Math.random() * (b - a + 1)) + a;
    }
    return seq;
  }

  public static void duplicate(int[] a){
		int j = 0, count, recount, temp;
		for(int i = 0; i < a.length; i++){
			count = 1;
			recount = 0;
			j = i + 1;
			while(j < a.length){
				if(a[i] == a[j]){
					count++;
				}
				j++;
			}
			if(count > 0){
				temp = a[i];
				for(int x = 0; x < i; x++){
					if(a[x] == temp){
						recount++;
					}
				}
				if(recount == 0){
					totalCount++;
					if(count > 1){
						System.out.println(+a[i]+" ocorre "+count+" vezes.");
					} else {
						System.out.println(+a[i]+" ocorre "+count+" vez.");
					}
					
				}
			}
		}
	}
}