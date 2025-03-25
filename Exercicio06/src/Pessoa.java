import java.util.Optional;

public class Pessoa {
   private Optional<Endereco> endereco;
   
   public Pessoa(Optional<Endereco> endereco) {
       this.endereco = endereco;
   }

   public Optional<Endereco> getEndereco() {
       return endereco;
   }
	
}
