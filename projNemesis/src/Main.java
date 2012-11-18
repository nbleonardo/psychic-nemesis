
public class Main {

	public static void main(String[] args) {
		
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
		
		Livros livro1;
		livro1 = new Livros("O Hobbit",autor2,categoria1,editora2);
		Livros livro2;
		livro2 = new Livros("O Alquimista",autor1,categoria2,editora1);
		Livros livro3;
		livro3 = new Livros("O Símbolo Perdido",autor3,categoria3,editora3);
		
		System.out.println("------Livros Cadastrados------");
		System.out.println(livro1);
		System.out.println(livro2);
		System.out.println(livro3);
	}

}
