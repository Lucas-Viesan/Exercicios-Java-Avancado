import java.util.Optional;

public class Executavel {

	public static String getNome(Optional<String> valor) {
		return valor.map(nome -> nome.toUpperCase()).orElse("Valor padrão");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Optional<String> texto = Optional.of("Lucas");
		
		System.out.println("Retorno: " + getNome(texto));
		
	}

}
