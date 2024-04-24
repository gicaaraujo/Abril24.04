package Abril24;

import java.util.Scanner;

public class Ativ3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double numero=0,impar=0, par=0, i=1;


		while (i <= 10) {
				System.out.println("Informe: " +i);
				numero = ler.nextDouble();
				
				i++;
				
			if (numero % 2 ==0)
				par = par + 1 ;  //par +=1
			else 
				impar = impar +1; // ímpar+=1
		}
		System.out.println("A quantidade de números pares é: " + par);
		System.out.println("A quantidade de números ímpares é : " + impar);
		ler.close();




	}

}
