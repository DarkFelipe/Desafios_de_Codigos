import java.io.IOException;
import java.util.Scanner;

public class TaxaDeImpostoDeRenda {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double renda = leitor.nextDouble();
    
        
    
        if (renda <= 2000.0){
            System.out.println("Isento");
        } else if (renda > 2000.0 && renda<=3000.0){
            System.out.printf("R$ %, .2f", +((renda-2000.0)*0.08));
        } else if (renda >3000.0 && renda <= 4500.0){
            System.out.printf("R$ %, .2f", +(1000*0.08+(renda-3000.0)*0.18));
        } else {
            System.out.printf("R$ %, .2f", +(1000*0.08+1500.0*0.18+(renda-4500.0)*0.28));
        }
        //TODO: Agora utilizando estrutura condicional implemente em seu código as condições necessárias para o cálculo da taxa de imposto de renda:

    }
	
}

 
      

 

    

