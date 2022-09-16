package fundamentos;

public class DesafioLogico {
	
	public static void main(String[] args) {
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean Tv50 = trabalho1 && trabalho2;
		boolean Tv32 = trabalho1 ^ trabalho2;
		boolean sorvete = trabalho1 || trabalho2;
		
		System.out.println("Comprou  TV 50\"?" + Tv50);
		System.out.println("Comprou  TV 32\"?" + Tv32);
		System.out.println("Comprou  sorvete\"?" + sorvete);
		System.out.println("Mais saudavel\"?" + !sorvete);


	}
}
