package Abril24;

import java.util.Scanner;

public class Ativ2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double numero, soma=0, media;
		int i=1;

		while (i <= 5) {
			System.out.println("Informe : " + i);
			numero = ler.nextDouble();
			soma = soma + numero;
			i++;
		}
		media = soma/5;
		System.out.println("A soma é : " + soma);
		System.out.println("A média é :" + media);

		ler.close();

	}

}


