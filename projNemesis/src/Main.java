import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Main {
	
	private static ArrayList<Livros> listaLivros = new ArrayList<Livros>();
	private static ArrayList<Autores> listaAutores = new ArrayList<Autores>(); 
	private static ArrayList<Categorias> listaCategorias = new ArrayList<Categorias>();
	private static ArrayList<Editoras> listaEditoras = new ArrayList<Editoras>();
	
	private static Livros livro;
	private static Autores autor;
	private static Categorias categoria;
	private static Editoras editora;
	
	private static Autores criarAutor(){
		String nome="", cidade = "", pais="";
		
		nome = JOptionPane.showInputDialog("Nome: ");
		
		if (nome.isEmpty()){
			JOptionPane.showMessageDialog(null,"Nome não pode ficar em branco!","Erro",JOptionPane.ERROR_MESSAGE);
			return null;
		}else{
			if (isAutor(nome) != null){
				JOptionPane.showMessageDialog(null,"Autor já cadastrado!","Erro",JOptionPane.ERROR_MESSAGE);
				return null;
			}
		}
		
		cidade = JOptionPane.showInputDialog("Cidade: ");
		pais = JOptionPane.showInputDialog("Pais: ");
		
		if (cidade.isEmpty() || pais.isEmpty()){
			Autores autor = new Autores(nome);
			return autor;
		}else{
			Autores autor = new Autores(nome,cidade,pais);
			return autor;
		}
	}
	
	private static Categorias criarCategoria(){
		String descricao="";
		
		descricao = JOptionPane.showInputDialog("Descrição: ");
		
		if (descricao.isEmpty()){
			JOptionPane.showMessageDialog(null,"Descrição não pode ficar em branco!","Erro",JOptionPane.ERROR_MESSAGE);
			return null;
		}else{
			if (isCategoria(descricao) != null){
				JOptionPane.showMessageDialog(null,"Descrição já cadastrada!","Erro",JOptionPane.ERROR_MESSAGE);
				return null;
			}
			Categorias categoria = new Categorias(descricao);
			return categoria;
		}
	}
	
	private static Editoras criarEditora(){
		String nome="", endereco = "", contato="";
		
		nome = JOptionPane.showInputDialog("Nome: ");
		
		if (nome.isEmpty()){
			JOptionPane.showMessageDialog(null,"Nome não pode ficar em branco!","Erro",JOptionPane.ERROR_MESSAGE);
			return null;
		}else{
			if (isEditora(nome) != null){
				JOptionPane.showMessageDialog(null,"Editora já cadastrada!","Erro",JOptionPane.ERROR_MESSAGE);
				return null;
			}
		}
		
		endereco = JOptionPane.showInputDialog("Endereço: ");
		contato = JOptionPane.showInputDialog("Contato: ");
		
		if (endereco.isEmpty() || contato.isEmpty()){
			Editoras editora = new Editoras(nome);
			return editora;
		}else{
			Editoras editora = new Editoras(nome,endereco,contato);
			return editora;
		}
	}
	
	private static Livros cadastrarLivro(){
		String nomeLivro="", nomeAutor="", descCategoria="", nomeEditora="";
		
		nomeLivro = JOptionPane.showInputDialog("Nome: ");
		
		if (nomeLivro.isEmpty()){
			JOptionPane.showMessageDialog(null,"Nome não pode ficar em branco!","Erro",JOptionPane.ERROR_MESSAGE);
			return null;
		}else{
			if (isLivro(nomeLivro) != null){
				JOptionPane.showMessageDialog(null,"Livro já cadastrado!","Erro",JOptionPane.ERROR_MESSAGE);
				return null;
			}
		}
		
		nomeAutor = JOptionPane.showInputDialog("Autor: ");
		descCategoria = JOptionPane.showInputDialog("Categoria: ");
		nomeEditora = JOptionPane.showInputDialog("Editora: ");
		
		if (isAutor(nomeAutor) == null || isCategoria(descCategoria) == null || isEditora(nomeEditora) == null){
			Livros livro = new Livros(nomeLivro);
			return livro;
		}
		
		Livros livro = new Livros(nomeLivro,isAutor(nomeAutor),isCategoria(descCategoria),isEditora(nomeEditora));
		return livro;
		
	}
	
	private static Autores isAutor(String nome){
		for (Autores obj : listaAutores){
			if (nome.equals(obj.getNome()) ){
				return obj;
			}
		}
		
		return null;
	}
	
	private static Categorias isCategoria(String descricao){
		for (Categorias obj : listaCategorias){
			if (descricao.equals(obj.getDescricao())){
				return obj;
			}
		}
		
		return null;
	}
	
	private static Editoras isEditora(String nome){
		for (Editoras obj : listaEditoras){
			if (nome.equals(obj.getNome()) ){
				return obj;
			}
		}
		
		return null;
	}
	
	private static Livros isLivro(String nome){
		for (Livros obj : listaLivros){
			if (nome.equals(obj.getNome()) ){
				return obj;
			}
		}
		
		return null;
	}
	
	private static Livros buscarLivro(){
		String busca="";
		
		busca = JOptionPane.showInputDialog("Buscar: ");
		
		for (Livros obj : listaLivros){
			if (obj.getNome().equals(busca) || 
				obj.getAutor().getNome().equals(busca) || 
				obj.getCategoria().getDescricao().equals(busca)|| 
				obj.getEditora().getNome().equals(busca))
				
				return obj;
		}

		JOptionPane.showMessageDialog(null,"Livro não encontrado!","Erro",JOptionPane.ERROR_MESSAGE);
		return null;
	}

	public static void main(String[] args){
		
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
		
		
		String op="";
		
		do{
			op = JOptionPane.showInputDialog("Acervo de Livros: \n\n" + 
					"1 - Cadastro de Livros\n" +
					"2 - Cadastro de Autores\n" +
					"3 - Cadastro de Categorias\n" +
					"4 - Cadastro de Editoras\n" +
					"5 - Buscar Livros\n" +
					"0 - Sair\n\n" +
					"Opção: ");
			switch(op){
				case "1":{
					livro = cadastrarLivro();
					if (livro != null){
						listaLivros.add(livro);
					}
					System.out.println(listaLivros);
					break;
					}
				case "2":{
					autor = criarAutor();
					if (autor != null){
						listaAutores.add(autor);
					}
					System.out.println(listaAutores);
					break;
					}
				case "3":{
					categoria = criarCategoria();
					if (categoria != null){
						listaCategorias.add(categoria);
					}
					System.out.println(listaCategorias);
					break;
					}
				case "4":{
					editora = criarEditora();
					if (editora != null){
						listaEditoras.add(editora);
					}
					System.out.println(listaEditoras);
					break;
					}
				case "5":{
					System.out.println(buscarLivro());
					break;
					}
				case "0":{System.exit(0);}
				default :{JOptionPane.showMessageDialog(null,"Entrada Inválida!","Erro",JOptionPane.ERROR_MESSAGE);break;}
				}
		}while(true);
	}

}
