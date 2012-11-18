
public class Editoras {
	
	private String nome;
	private String endereco;
	private String contato;

	public Editoras(String nome) {
		super();
		setNome(nome);
	}
	
	public Editoras(String nome, String endereco, String contato) {
		super();
		setNome(nome);
		setEndereco(endereco);
		setContato(contato);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	@Override
	public String toString() {
		return String.format("Editoras [nome=%s, endereco=%s, contato=%s]",
				nome, endereco, contato);
	}
}
