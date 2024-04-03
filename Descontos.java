
public class Descontos {
	
	String nome;
	double valor;
	Tipo tipo;
	
	Descontos(String nome, double valor, Tipo tipo) {
		
		this.nome = nome;
		this.valor = valor;
		this.tipo = tipo;
	}
	
	void calcularDescontos() {
		
		switch(tipo) {
		
		case LIVRO:
			System.out.println(nome + ", " + (0.85 * valor) + " Reais");
			break;
		case ESCRITORIO:
			System.out.println(nome + " " + (0.80 * valor) + " Reais");
			break;
		case TECNOLOGIA:
			System.out.println(nome + " " + (0.90 * valor) + " Reais");
			
		}
	}
	

}
