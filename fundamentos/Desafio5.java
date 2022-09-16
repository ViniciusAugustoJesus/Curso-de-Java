package fundamentos;

import java.util.Scanner;

public class Desafio5 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor da base do trangulo:");
		double base = entrada.nextDouble();
		System.out.println("Digite o valor da altura do trangulo:");
		double altura = entrada.nextDouble();
		double area = (base * altura) / 2;
		System.out.printf("A area do triangulo e: %.2f centimetro quadrados", area);
		
		
		
		
		
		
		
		
		
		
		entrada.close();
	}
}
