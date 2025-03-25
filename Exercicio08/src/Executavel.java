import java.util.Optional;

public class Executavel {
	
	public static void getNumber(Optional<Integer>valor) {
		 System.out.println(valor.filter(n -> n > 10));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Optional<Integer> numero = Optional.of(11);
		
		getNumber(numero);
		
		numero = Optional.of(1);
		
		getNumber(numero);
		

	}

}
