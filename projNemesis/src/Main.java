import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Main {
	
	private static Autores criarAutor(){
		String nome="", cidade = "", pais="";
		
		nome = JOptionPane.showInputDialog("nome: ");
		cidade = JOptionPane.showInputDialog("cidade: ");
		pais = JOptionPane.showInputDialog("pais: ");
		
		if (nome == "" || nome == null){
			JOptionPane.showMessageDialog(null,"Nome não pode ficar em branco!","Erro",JOptionPane.ERROR_MESSAGE);
			return null;
		}
		else{
			if (cidade == "" || cidade == null || pais == "" || pais == null){
				Autores autor = new Autores(nome);
				return autor;
			}
			else{
				Autores autor = new Autores(nome,cidade,pais);
				return autor;
			}
		}
	}
	
	private static Categorias criarCategoria(){
		String descricao="";
		
		descricao = JOptionPane.showInputDialog("Descricao: ");
		
		Categorias categoria = new Categorias(descricao);
		return categoria;
	}
	
	private static Editoras criarEditora(){
		String nome="", endereco = "", contato="";
		
		nome = JOptionPane.showInputDialog("nome: ");
		endereco = JOptionPane.showInputDialog("endereço: ");
		contato = JOptionPane.showInputDialog("contato: ");
		
		Editoras editora = new Editoras(nome,endereco,contato);
		return editora;
	}

	public static void main(String[] args){
		
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
		ArrayList<Autores> listaAutores = new ArrayList<Autores>();
		ArrayList<Categorias> listaCategorias = new ArrayList<Categorias>();
		ArrayList<Editoras> listaEditoras = new ArrayList<Editoras>();
		
		listaLivros.add(livro1);
		listaLivros.add(livro2);
		listaLivros.add(livro3);
		
		listaAutores.add(autor1);
		listaAutores.add(autor2);
		listaAutores.add(autor3);
		
		listaCategorias.add(categoria1);
		listaCategorias.add(categoria2);
		listaCategorias.add(categoria3);
		
		listaEditoras.add(editora1);
		listaEditoras.add(editora2);
		listaEditoras.add(editora3);
		
		/*String busca = "Dan Brown";
		
		for (Livros obj : listaLivros){
			if (obj.getNome() == busca || obj.getAutor().getNome() == busca || 
				obj.getCategoria().getDescricao() == busca || 
				obj.getEditora().getNome() == busca)
				
				System.out.println(obj);
		}*/
		
		String op="";
		
		do{
			op = JOptionPane.showInputDialog("op: ");
			switch(op){
			case "1":{/*listaAutores.add(criarAutor());*/System.out.println(criarAutor());;break;}
			case "2":{/*listaCategorias.add(criarCategoria());*/System.out.println(criarCategoria());;break;}
			case "3":{/*listaEditoras.add(criarEditora());*/System.out.println(criarEditora());;break;}
			case "4":{break;}
			case "5":{break;}
			default:{break;}
			}
		}while(true);
	}

}
