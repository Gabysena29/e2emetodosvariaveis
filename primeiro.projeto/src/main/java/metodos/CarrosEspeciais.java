package metodos;

public class CarrosEspeciais  extends Carros {

	//Esse extends faz parte da Herança, isso significa que nao precisamos repetir o mesmo
	//medodo que ja criamos na outra classe aqui de (ligar e desligar) e mesmo assim quand
	//execultarmos ele vai receber esse metodo atravez do extends
	
	public void vidroEletrico () {
		
		System.out.println("Vidro eletrico acionado");
	}
	
	public void turbo () {
		
		System.out.println("Turbo ligado ");
	}

}
