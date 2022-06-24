package primeiro.projeto;

public class RevisandoIf {

	public static void main(String[] args) {

		int mediaPassar = 9;
		int nota1 = 9;
		int nota2 = 10;
		int nota3 = 8;
		int media = (nota1+nota2+nota3) /3;
		
		if(media >= mediaPassar) {
			
			System.out.println("Parabens voce passou de ano, sua nota e " + media );
		}else {
			
			System.out.println("Infelizmente voce nao passou de ano.");
		}
	}

}
