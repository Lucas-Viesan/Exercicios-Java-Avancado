import java.util.Optional;

public class Executavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade = 10;
		
		Optional<Integer> checkIdade = Optional.of(idade);
		Optional<Integer> checkValor = Optional.empty(); 
		
		System.out.println("O optional Idade está com valor: " + checkIdade.isPresent());
		System.out.println("O optional Valor está vazio: " + checkValor.isEmpty());
		
	}

}
