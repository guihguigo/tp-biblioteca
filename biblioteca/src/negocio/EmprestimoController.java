package negocio;

import bean.LivroBean;
import bean.PessoaBean;

public class EmprestimoController {
	private EmprestimoDAO emprestimoDAO;
	
	public boolean realizarEmprestimo(LivroBean livro, PessoaBean pessoa) {
		emprestimoDAO = new EmprestimoDAO();
		emprestimoDAO.registrarEmprestimo(livro, pessoa);
		
		return true;
	}
	
	
	
	
}
