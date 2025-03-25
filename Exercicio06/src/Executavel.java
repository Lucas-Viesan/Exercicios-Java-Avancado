import java.util.Optional;

public class Executavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Endereco end = new Endereco("Tokyo");

		Optional<Endereco> texto = Optional.of(end);
		
		Pessoa p1 = new Pessoa(texto);
		
		String cidade1 = p1.getEndereco().flatMap(endereco -> Optional.ofNullable(endereco.getCidade())).orElse("Cidade não encontrada");
		
		System.out.println(cidade1);
	}

}
