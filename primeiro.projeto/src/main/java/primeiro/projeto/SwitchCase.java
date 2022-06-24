package primeiro.projeto;

public class SwitchCase {

	public static void main(String[] args) {

		int opcao = 1;
		double valorProduto = 5.000;
		double saldoCliente = 10.000;
		switch (opcao){
			
			case 1:
				System.out.println("Voce escolheu a opcao vista");
				
				if(saldoCliente >= valorProduto) {
					System.out.println("Compra realiza com sucesso");
					
				}else {
					
					System.out.println("Compra negada, procure seu banco");
				}
			break;
			
			case 2:
				System.out.println("Voce escolheu a opcao 2");
				
			case 3:
				System.out.println("Voce escolheu a opcao 3");
			break;
			
			default:
				System.out.println("Voce escolheu a opcao errada.");
		}
	}

}
