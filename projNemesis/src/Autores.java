
public class Autores {
	
	private String nome; 
	private String cidade;
	private String pais;

	public Autores(String nome) {
		super();
		setNome(nome);
	}
	
	public Autores(String nome, String cidade, String pais) {
		super();
		setNome(nome);
		setCidade(cidade);
		setPais(pais);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return String.format("Autores [nome=%s, cidade=%s, pais=%s]", nome,
				cidade, pais);
	}
}
