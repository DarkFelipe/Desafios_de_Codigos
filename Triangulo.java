import java.io.IOException;
import java.util.Scanner;

public class Triangulo {
    
   
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		double A = leitor.nextDouble();
		double B = leitor.nextDouble();
		double C = leitor.nextDouble();
				

		
		if ((A+B)>C && (A+C)>B && (B+C)>A){
            System.out.println("Perimetro = " + (A+B+C));
            
        }else{

            System.out.println("Area = " +((A+B)*C/2));

        } 

    } 
}
	


