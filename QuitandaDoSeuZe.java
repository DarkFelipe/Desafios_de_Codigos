// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.util.*;

public class QuitandaDoSeuZe {
    public static void main(String[] args) {
    
       Scanner input = new Scanner(System.in);
       int morangos = input.nextInt();
       int macas = input.nextInt();

	   double morango1 = 2.5*morangos;
	   double morango2 = 2.2*morangos;
	   double maca1 = 1.8*macas;
	   double maca2 = 1.5*macas;
       double preco;
       int quantidadeFrutas = morangos + macas;

       if (morangos<= 5 && macas <= 5){
        preco = morango1 + maca1;
       } else if (morangos >5 && macas <= 5){
        preco = morango2 + maca1;
       } else if (morangos <= 5 && macas > 5){
        preco = morango1 + maca2;
       } else {
        preco = morango2 + maca2;
       }

       if (quantidadeFrutas > 8 || preco > 25.0){
        System.out.println(preco - (preco*0.1));
       } else {
        System.out.println(preco);
       }
          
    }
}

