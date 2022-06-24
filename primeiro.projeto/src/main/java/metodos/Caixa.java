package metodos;

public class Caixa {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		
		
		System.out.println(cc.getSaldo());
		
		cc.setSaldo(100.0);
		
		System.out.println(cc.getSaldo()
				);

	}

}
