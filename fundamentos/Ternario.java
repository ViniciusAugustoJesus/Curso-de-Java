package fundamentos;

public class Ternario {
	public static void main(String[] args) {
		
		double media = 7.6;
		String resultado = media >= 7.0 ? "Aprovado" : "Recuperaçao";
				
		System.out.println("O aluno esta: " + resultado);
		
		double nota = 9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultadoFinal = temDesconto ? "Sim." : "Nao.";
		
		System.out.printf("Tem desconto? %s", resultadoFinal);
	}
	
}
