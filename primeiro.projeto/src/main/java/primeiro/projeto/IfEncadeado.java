package primeiro.projeto;

public class IfEncadeado {

	public static void main(String[] args) {

		boolean opcao1 = true;
		boolean opcao2 = true;
		boolean opcao3 = true;
		
		if(opcao1) {
			
			System.out.println("Entrou na opcao 1");
			
			if(opcao2) {
				System.out.println("Entrou na opcao 2");
			}else {
				System.out.println("Nao entrou na opcao 3");
			}
			if(opcao3) {
				System.out.println("Entrou na opcao 3");
			}else {
				System.out.println("Nao entrou na opcao 3");
			}
			
			
			
		}else {
			System.out.println("Nao entrou na opcao 1");
		}
	}

}
