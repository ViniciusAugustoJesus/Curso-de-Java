package EstruturaDeControle;

public class Switch1 {
	
	public static void main(String[] args) {
		
		String faixa = "preta";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sabe o Bassai-Dai..");
		case "marron":
			System.out.println("Sabe o Tekki Shodan");
		case "roxa":
			System.out.println("Sabe o Heian Goddan");
		case "verde":
			System.out.println("Sabe o Heian Yodan");
		case "laranja":
			System.out.println("Sabe o Heian Shodan");
		case "vermelha":
			System.out.println("Sabe o Tekki Heian");
		case "amarela":
			System.out.println("Sabe o Tekki Dai");
			break;
		default:
			System.out.println("Nao sabe nada");
		}
	}
}
