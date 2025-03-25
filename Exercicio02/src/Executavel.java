import java.util.Optional;

public class Executavel {
	
	public static String getValor(Optional<String> valor) {
		return valor.orElse("Valor padrão");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Optional<String> nome = Optional.empty();
		
		System.out.println("Optional sem valor: " + getValor(nome));
		
		nome = Optional.of("Lucas");
		
		System.out.println("Adionado valor: " + getValor(nome));
		
	}

}
