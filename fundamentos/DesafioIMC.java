package fundamentos;

import java.util.Scanner;

public class DesafioIMC {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe seu peso: ");
		double peso = entrada.nextDouble();
		
		System.out.println("Informe sua altura em centimetros: ");
		double altura = entrada.nextDouble();
		
		double IMC = peso / (altura * altura);
		
		System.out.printf("O seu IMC é de %.2f", IMC );

		
		
		
		
		
		
		
		
		
		entrada.close();
	}
}
