package metodos;

public class MetodoAtributo {
	
	// criamos a variavel global, assim ela vale para todos os metodos que criamos aqui, 
	//e na hora de chamar o ponteiro usamos o this. para valer a variavel global
	
	int idade;
	String nome;
	
	public void digiteSuaIdade (int idade) {
		
		System.out.println("A idade digitada é" + idade);
		
	}
	
	public String digiteSeuNome ( String nome) {
		
		System.out.println("O nome digitado é " + nome);
		return nome;
		
	}
	
	public void digiteDados (int idade, String nome) {
		
		this.nome = nome;
		this.idade = idade;
		
		System.out.println("O nome digitado é " + nome + " e a idade e " + idade
				);
		
		
	}
	
	public void consultaDados () {
		
		System.out.println("nome cadastrado foi" + this.nome + " idade cadastrada foi " + this.idade );
	}

}
