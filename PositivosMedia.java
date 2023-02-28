import java.io.IOException;
import java.util.Scanner;

public class PositivosMedia {
	
  public static void main(String[] args) throws IOException {
     Scanner leitor = new Scanner(System.in);
     int cont = 0;
     double media = 0;
     double x = 0.0;
     double par = 0;
     double i = 0;


        for (i = 0; i< 6; i++) {
          x = leitor.nextDouble();
        	
        	if ( x > 0.0) {
        	  cont++;
        	  par = par + x;
          }

        	
        }
        
        media = par/cont;
        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));
    }
	
}