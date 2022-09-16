package fundamentos;

public class NotaçaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.toUpperCase();
		s = s.replace("X", "senhora");
		s = s.concat("!!!");
		System.out.println(s);
		// Tipo primitivo não tem o operador "."
	}
}
