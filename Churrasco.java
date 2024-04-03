
public class Churrasco {
	
	   private double qtdCarne;

	    public void verificarConsumo(Pessoa pessoa) {
	        if (pessoa.getIdade() >= 4 && pessoa.getIdade() <= 12 && !pessoa.isVegetariana()) {
	            qtdCarne = 1.0; // 1 kilo de carne
	        } else if (pessoa.getIdade() >= 13 && !pessoa.isVegetariana()) {
	            qtdCarne = 2.0; // 2 kilos de carne
	        } else {
	            qtdCarne = 0.0; // Não consome carne
	            
	        }
	        System.out.println(pessoa.getNome() + " vai consumir " + qtdCarne + " kilos de carne.");
	    }

}
