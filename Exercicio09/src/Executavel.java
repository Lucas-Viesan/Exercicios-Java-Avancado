import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Executavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Optional<String>> lista = new ArrayList();

		lista.add(Optional.of("Lucas"));
		lista.add(Optional.of("Armando"));
		
		String resultado = lista.stream()
				.map(x -> x.filter(nome -> nome.startsWith("A")))
				.filter(Optional::isPresent)  // Filtra apenas os valores presentes
	            .map(Optional::get)          // Obtém o valor contido no Optional
	            .findFirst()                 // Retorna o primeiro valor válido
	            .orElse("Sem resultado");    // Caso não encontre nenhum, retorna o padrão

	        System.out.println("Resultado: " + resultado);

	
	}

}
