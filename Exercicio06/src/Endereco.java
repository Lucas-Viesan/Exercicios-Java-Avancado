
public class Endereco {
	
	private String cidade;

	
public Endereco(String cidade) {
	this.cidade = cidade;
}


public String getCidade() {
	return cidade;
}


public void setCidade(String cidade) {
	this.cidade = cidade;
}

@Override
public String toString() {
	return "Cidade: " + cidade;
}

}
