import java.util.Optional;

public class Executavel {
	
	public static void getNome(Optional<String> valor) {
		valor.ifPresent(valorPresente -> System.out.println("Valor presente: " + valorPresente));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Optional<String> nome = Optional.of("Lucas");
	
	getNome(nome);
		
	}

}
