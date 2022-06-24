package primeiro.projeto;

public class ElseIf {

	public static void main(String[] args) {
 
		boolean dinheiro = false;
		boolean credito = false;
		boolean boleto = true;
		int preco = 10000;
		
		System.out.println("****************************************");
		System.out.println("************E2E TREINAMENTOS************");
		System.out.println("****************************************");
		System.out.println("");
		
		
		if(dinheiro) {
			
			int desconto = 600;
			preco = preco - desconto;
			
			System.out.println("Parabens pela compra do carro no valor " + preco);
			
		}else if (credito) {
			
			int juros = 1500;
			preco = preco + juros;
			
			System.out.println("Parabens pela compra do carro no valor " + preco);
			
		}else if(boleto) {
			
			int juros= 2500;
			preco = preco + juros;
			
			System.out.println("Parabens pela compra do carro no valor " + preco);
		}
	}

}
