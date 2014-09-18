package negocio;

import java.util.ArrayList;

import persistencia.LivroDAO;
import bean.LivroBean;

public class LivroController {
	private LivroDAO livroDAO;
	
	public ArrayList<LivroBean> listarLivro(){
		livroDAO = new LivroDAO();
		
		return livroDAO.listar();
	}
	
	public boolean cadastrarLivro(LivroBean livroBean) {
		livroDAO = new LivroDAO();
		livroDAO.incluir(livroBean);
		
		return true;
	}
	
	public boolean excluirLivro(LivroBean livro) {
		livroDAO.remover(livro);
		
		return true;
	}
}
