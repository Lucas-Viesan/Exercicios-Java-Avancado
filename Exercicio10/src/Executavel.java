import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Executavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> lista = new ArrayList();
		
		lista.add("Lucas");
		lista.add("Ana");
		lista.add("Marcos");
		lista.add("Livia");
		
		Optional<String> nome = lista.stream()
				.filter(x -> x.length() == 5)
				.findFirst();
		
		nome.ifPresent(palavra -> System.out.println("1º nome com 5 caracteres: " + palavra));
		
	}

}
