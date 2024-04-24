package Abril24;

import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite o número: "); // Entrada de dados
        numero = ler.nextInt();
        
        while (numero % 2 != 0) {
        	System.out.println("O número digitado não é par. Digite novamente!"); //Processamento
        	numero = ler.nextInt();
        }
        System.out.println("O número " + numero + " é par!"); //Saída de dados
        ler.close();
        }
	}


