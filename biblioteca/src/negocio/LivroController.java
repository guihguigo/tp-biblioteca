package negocio;

import java.util.ArrayList;

import persistencia.LivroDAO;
import bean.LivroBean;

public class LivroController {
	private LivroDAO livroDAO;
	
	public LivroController() {
		livroDAO = new LivroDAO();
	}
	public ArrayList<LivroBean> listar(){
		return livroDAO.listar();
	}
	
	public void salvar(LivroBean livroBean) {
		livroDAO.incluir(livroBean);
	}
	
	public void excluir(LivroBean livro) {
		livroDAO.remover(livro);
	}
	
	public LivroBean consultar(LivroBean livro) {
		return livroDAO.consultar(livro);
	}
}
