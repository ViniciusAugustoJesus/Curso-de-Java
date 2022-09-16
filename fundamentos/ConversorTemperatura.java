package fundamentos;

public class ConversorTemperatura {
	
	public static void main(String[] args) {
		final double diferença = 32;
		final double multiplicaçao = 5 / 9.0;
		double faren = 86;
		double celsius = (faren - diferença) * multiplicaçao; 
				System.out.println("A conversao de " + faren + "°F e igual a " + celsius + "°C" );
				
	}
}
