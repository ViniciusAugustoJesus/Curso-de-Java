package EstruturaDeControle;

import java.util.Scanner;

public class Desafio3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		
		int contadorDeDivisores = 0;
		System.out.println("Digite um numero inteiro: ");
		int num = entrada.nextInt();
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				contadorDeDivisores++;
			}
		}

		if (contadorDeDivisores == 0) {
			System.out.println("\nO numero " + num + " é primo.");
		} else {
			System.out.println("\nO numero " + num + " não é primo.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		entrada.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
