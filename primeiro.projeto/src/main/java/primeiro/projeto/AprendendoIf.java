package primeiro.projeto;

public class AprendendoIf {

	public static void main(String[] args) {

		int idadePermitida = 18;
		int minhaIdade = 5;
		
		if (minhaIdade >= idadePermitida){
			
			System.out.println("Permitido tirar habilitacao, a sua idade e " + minhaIdade);
			
		}else {
			System.out.println("Nao e permitido tirar habilitacao, a sua idade e " + minhaIdade + ".");
		}
	}

}
