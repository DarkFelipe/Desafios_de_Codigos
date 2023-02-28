import java.util.Scanner;

public class SomaTermos {

    public static void main(String[] Args) {

     double h = 0;
     Scanner sc = new Scanner(System.in);
     double n = sc.nextDouble();

     for (int i = 1; i <= n; i++) {
     
           h = h + 1d/i;
      }
      System.out.println(Math.round(h));
     
       
   }
}