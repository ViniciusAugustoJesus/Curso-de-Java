package fundamentos;

public class ÁreaCircunferencia {
	public static void main(String[] args) {
		// para nao deixar o valor mudar é preciso colocar final antes do tipo primitivo 
		double raio = 3.4;
		final double pi = 3.14159;
		double area = pi * raio * raio;
		System.out.println("Area = " + area + " m2");
		
	}
}
