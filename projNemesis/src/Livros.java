
public class Livros {
	
	private String nome;
	private Autores autor;
	private Categorias categoria;
	private Editoras editora;

	public Livros(String nome) {
		super();
		setNome(nome);
	}
	
	public Livros(String nome, Autores autor, Categorias categoria, Editoras editora) {
		super();
		setNome(nome);
		setAutor(autor);
		setCategoria(categoria);
		setEditora(editora);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Autores getAutor() {
		return autor;
	}

	public void setAutor(Autores autor) {
		this.autor = autor;
	}

	public Categorias getCategoria() {
		return categoria;
	}

	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}

	public Editoras getEditora() {
		return editora;
	}

	public void setEditora(Editoras editora) {
		this.editora = editora;
	}

	@Override
	public String toString() {
		return String.format(
				"Livros [nome=%s, autor=%s, categoria=%s, editora=%s]", nome,
				autor, categoria, editora);
	}
	
}
