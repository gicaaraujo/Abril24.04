package Abril24;

import java.util.Scanner;

public class Ativ1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero, i=1;

		System.out.println("Digite um número: "); // Entrada de dados
		numero = ler.nextInt();

		while (i <=numero) {
			if (i%2!=0) {
				System.out.println( i + "  - números ímpares");
			}
			
			i++;
			ler.close();
		}

	}
}

