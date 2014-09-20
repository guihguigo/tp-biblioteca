package negocio;

import java.util.Date;

import bean.EmprestimoBean;
import bean.LivroBean;
import bean.PessoaBean;

public class EmprestimoController {
	private EmprestimoDAO emprestimoDAO;
	
	public EmprestimoController() {
		emprestimoDAO = new EmprestimoDAO();
	}
	
	public void emprestar(LivroBean livro, PessoaBean pessoa) {
		Date dataEmprestimo = new Date(System.currentTimeMillis());
		EmprestimoBean emprestimo = new EmprestimoBean(pessoa, livro, dataEmprestimo);
		
		emprestimoDAO.registrarEmprestimo(emprestimo);
	}
	
	public void devolver(EmprestimoBean emprestimo) {
		Date data = new Date(System.currentTimeMillis());
		emprestimo.setDataDevolucaoEmprestimo(data);
	}
	
	public EmprestimoBean consultar(String ISBN) {
		System.out.println(emprestimoDAO.listar().size());
		for (EmprestimoBean emprestimo : emprestimoDAO.listar()) {
			if (emprestimo.getLivro().getISBN().equals(ISBN));
			return emprestimo;
		}
		
		return null;
	}
}
