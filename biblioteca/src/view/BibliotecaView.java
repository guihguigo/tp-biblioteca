package view;
import java.util.ArrayList;
import java.util.Scanner;

import negocio.EmprestimoController;
import negocio.LivroController;
import negocio.PessoaController;
import bean.EmprestimoBean;
import bean.LivroBean;
import bean.PessoaBean;


public class BibliotecaView {
	static final String MENU = "1 - Listar Pessoas: \n"
			+ "2 - Cadastrar Pessoa: \n"
			+ "3 - Excluir Pessoa: \n"
			+ "4 - Listar Livros: \n"
			+ "5 - Cadastrar Livro: \n"
			+ "6 - Excluir Livro: \n"
			+ "7 - Consultar Emprestimo \n"
			+ "8 - Realizar Emprestimo: \n"
			+ "9 - Realizar Devolução: \n";
	
	public static String input(String mensagem) {
		System.out.println(mensagem);
		Scanner scanner = new Scanner(System.in);
		String result = scanner.next();		
		return result;
	}
	
	public static void main(String[] args) {
		int opcao = 0;
		
		do {
			opcao = Integer.parseInt(input(MENU));
			
			switch (opcao) {
			case 1: 
				listarPessoas();
				break;
				
			case 2: 
				cadastrarPessoa();
				break;
				
			case 3:
				excluirPessoa();
				
			case 4: 
				listarLivros();
				break;
				
			case 5:
				cadastrarLivro();
				break;
			
			case 6:
				excluirLivro();
				break;
			case 7: 
				consultarEmprestimo();
				break;
			case 8:
				realizarEmprestimo();
				break;
			case 9: 
				realizarDevolucaoEmprestimo();
				break;
			}
			
		} while (opcao != 0);
	}

	private static void realizarDevolucaoEmprestimo() {
		String ISBN = input("Entre com o ISBN");
		EmprestimoController controller = new EmprestimoController();
		EmprestimoBean emprestimo = controller.consultar(ISBN);
		controller.devolver(emprestimo);
	}

	private static void realizarEmprestimo() {
		String cpf = input("Entre com o cpf");
		PessoaBean pessoa = new PessoaBean(null, cpf, null);
		pessoa = new PessoaController().consultar(pessoa);
		
		String ISBN = input("Entre com o ISBN");
		LivroBean livro = new LivroBean(ISBN, null, null, null);
		livro = new LivroController().consultar(livro);
		
		new EmprestimoController().emprestar(livro, pessoa);
	}

	private static void consultarEmprestimo() {
		String ISBN = input("Entre com o ISBN do livro emprestado: ");
		EmprestimoBean emprestimo = new EmprestimoController().consultar(ISBN);
		System.out.println(emprestimo.toString());
	}
		

	private static void excluirLivro() {
		String ISBN = input("Entre com ISBN");
		
		LivroController controller = new LivroController();
		controller.excluir(new LivroBean(ISBN, null, null, null));
		
	}

	private static void cadastrarLivro() {
		String ISBN = input("Entre com ISBN");
		String titulo = input("Entre com titulo");
		String autor = input("Entre com autor");
		String editora = input("Entre com editora");
		LivroBean livro = new LivroBean(ISBN, titulo, autor, editora);
		
		LivroController controller = new LivroController();
		controller.salvar(livro);;
	}

	private static void listarLivros() {
		LivroController controller = new LivroController();
		
		for (LivroBean livro : controller.listar()) {
			System.out.println(livro.toString());
		}
	}

	private static void excluirPessoa() {
		String cpf = input("Entre com o cpf");
		
		PessoaController controller =  new PessoaController();
		controller.excluir(new PessoaBean(null, cpf, null));
	}
	
	private static void cadastrarPessoa() {
		String nome = input("Entre com o nome");
		String cpf = input("Entre com o cpf");
		String email = input("Entre com o email");
		
		PessoaBean pessoa = new PessoaBean(nome, cpf, email);
		PessoaController controller = new PessoaController();
		controller.incluir(pessoa);		
	}

	private static void listarPessoas() {
		PessoaController controller = new PessoaController();
		ArrayList<PessoaBean> pessoas = controller.listar();
		
		for (PessoaBean pessoa : pessoas) {
			System.out.println(pessoa.toString());
		}
	}
			
}
