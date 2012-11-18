
public class Categorias {
	
	private String descricao;

	public Categorias(String descricao) {
		super();
		setDescricao(descricao);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return String.format("Categorias [descricao=%s]", descricao);
	}
	
}
