package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite seu primeiro salario");
		String prim = entrada.next().replace(",", ".");
		
		System.out.print("Digite seu segundo salario");
		String seg = entrada.next().replace(",", ".");
		
		System.out.print("Digite seu terceiro salario");
		String ter = entrada.next().replace(",", ".");
		
		double num1 = Double.parseDouble(prim);
		double num2 = Double.parseDouble(seg);
		double num3 = Double.parseDouble(ter);
		double media = (num1 + num2 + num3) / 3;
		
		System.out.println("A media entre os tres salarios é de " + media);
		
												
		entrada.close();
	}
}
