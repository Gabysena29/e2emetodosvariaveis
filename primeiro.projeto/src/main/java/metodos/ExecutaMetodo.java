package metodos;

public class ExecutaMetodo {

	public static void main(String[] args) {

		//MetodoVazio metodo = new MetodoVazio();
		//MetodoRetorno retorno = new MetodoRetorno();
		MetodoAtributo atributo = new MetodoAtributo();
		
		//metodo.mensagem();
		//retorno.nome();
		//atributo.digiteSeuNome("Anderson");
		//atributo.digiteSuaIdade(22);
		atributo.digiteDados(33, "Gaby");
		atributo.consultaDados();
	}

}
