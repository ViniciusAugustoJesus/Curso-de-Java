package Classes;

public class DataTeste {

	public static void main(String[] args) {

		Data p1 = new Data(7, 9, 2003);
		p1.dia = 7;
		p1.mes = 9;
		p1.ano = 2003;
		
		Data p2 = new Data();
		
		System.out.println(p1.obterDataFormatada());
		System.out.println(p2.obterDataFormatada());
	}
}
