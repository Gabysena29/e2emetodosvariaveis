
package primeiro.projeto;

public class Habilitacao {

	public static void main(String[] args) {

		String nome = "Gabriely";
		int idade = 10;
		int idadePermitida = 18;
		boolean emancipado = false;
				
				if(idade >= idadePermitida || emancipado) {
					
					System.out.println("A sua idade e permitida " + nome);
				}else {
					
					System.out.println("A sua idade nao e permitida " + nome);
				}
	}

}
