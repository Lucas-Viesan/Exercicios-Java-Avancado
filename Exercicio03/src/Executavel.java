import java.util.Optional;
import java.util.Random;

public class Executavel {

	public static int getNumero(Optional<Integer> valor) {
		return valor.orElseGet(() -> new Random().nextInt(100) + 1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Optional<Integer> numero = Optional.of(4);
		
		System.out.println("Contido na Optional: " + getNumero(numero));

		numero = Optional.empty();
		System.out.println("Optional orElseGet: " + getNumero(numero));
	}

}
