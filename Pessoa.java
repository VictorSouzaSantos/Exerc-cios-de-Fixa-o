
public class Pessoa {
	
	String nome, sexo;
	int idade;
	boolean vegetariana;
	
	Pessoa(String nome, String sexo, int idade, boolean vegetariana) {
		
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.vegetariana = vegetariana;
	}

	public String getNome() {
		return nome;
	}


	public String getSexo() {
		return sexo;
	}


	public int getIdade() {
		return idade;
	}


	public boolean isVegetariana() {
		return vegetariana;
	}
	

}
