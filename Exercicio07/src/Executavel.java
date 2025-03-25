import java.util.Optional;

public class Executavel {
	
	public static double getNumber(Optional<Double> valor) {
		return valor.map(n -> n.doubleValue()).orElseThrow(() -> new RuntimeException("Valor não encontrado"));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Optional<Double> numero = Optional.of(20.0);
		
		System.out.println(getNumber(numero));
	}

}
