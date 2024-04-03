
public class Main {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("João", "Masculino", 45, false);
        Pessoa pessoa2 = new Pessoa("Maria", "Feminino", 20, true);
        Pessoa pessoa3 = new Pessoa("Pedro", "Masculino", 15, false);

        Churrasco churrasco = new Churrasco();
        churrasco.verificarConsumo(pessoa1); // João vai consumir 1.0 kilos de carne.
        churrasco.verificarConsumo(pessoa2); // Maria vai consumir 0.0 kilos de carne.
        churrasco.verificarConsumo(pessoa3); // Pedro vai consumir 2.0 kilos de carne.
	}

}
