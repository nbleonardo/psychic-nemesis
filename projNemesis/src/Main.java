import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		
		/**
		 * Todos os dados aqui utilizados foram retirados do wikipedia
		 */
		
		/**
		 * Exemplo dos cadastros de Autores, Editoras, Categorias.
		 * Pode-se cadastrar os Autores e Editoras contendo apenas o nome;
		 * Para adicionar as outras informações basta utilizar o metodo set adequado.
		 * As Categorias exigem só a sua descrição.
		 */
		
		Autores autor1;
		autor1 = new Autores("Paulo Coelho","Rio de Janeiro","Brasil");
		Autores autor2;
		autor2 = new Autores("J. R. R. Tolkien","Bloemfontein","Inglaterra");	
		Autores autor3;
		autor3 = new Autores("Dan Brown","Exeter","Estados Unidos");
		
		Editoras editora1;
		editora1 = new Editoras("Planeta");
		Editoras editora2;
		editora2 = new Editoras("Artenova");
		Editoras editora3;
		editora3 = new Editoras("Sextante");
		
		Categorias categoria1;
		categoria1 = new Categorias("Fantasia");
		Categorias categoria2;
		categoria2 = new Categorias("Ficção");
		Categorias categoria3;
		categoria3 = new Categorias("Suspense");
		
		/**
		 * Exemplo de cadastro de Livros.
		 * Pode-se cadastrar o Livro contendo apenas o nome;
		 * Para adicionar as outras informações, utilizar o metodo set adequado;
		 * Essas informações já devem existem como objetos.
		 */
		
		Livros livro1;
		livro1 = new Livros("O Hobbit",autor2,categoria1,editora2);
		Livros livro2;
		livro2 = new Livros("O Alquimista",autor1,categoria2,editora1);
		Livros livro3;
		livro3 = new Livros("O Símbolo Perdido",autor3,categoria3,editora3);
		
		/**
		 * Exibe os Livros com todas as informações disponiveis.
		 */
		
		/*System.out.println("------Livros Cadastrados------");
		System.out.println(livro1);
		System.out.println(livro2);
		System.out.println(livro3);*/
		
		/**
		 * Exemplo simples de busca de Livros pelo nome.
		 */
		
		ArrayList<Livros> listaLivros = new ArrayList<Livros>();
		
		listaLivros.add(livro1);
		listaLivros.add(livro2);
		listaLivros.add(livro3);
		
		String nome = "O Hobbit";
		
		for (Livros obj : listaLivros){
			if (obj.getNome() == nome)
				System.out.println(obj);
		}
	}

}
