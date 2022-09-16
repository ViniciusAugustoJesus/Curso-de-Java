package fundamentos;

import java.util.Scanner;

public class Desafio4 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		double num1 = entrada.nextDouble();
		double quad = Math.pow(num1, 2);
		double cubo = Math.pow(num1, 3);
		System.out.printf("O quadrado desse numero e igual: %.2f e o cubo e: %.2f", quad, cubo );
		
		entrada.close();
	}
}
