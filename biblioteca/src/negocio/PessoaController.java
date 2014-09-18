package negocio;

import java.util.ArrayList;

import bean.PessoaBean;
import persistencia.PessoaDAO;

public class PessoaController {
	private PessoaDAO pessoaDAO;
	
	public ArrayList<PessoaBean> listar() {
		pessoaDAO = new PessoaDAO();
		
		return pessoaDAO.Listar();
	}
	
	public boolean incluirPesso(PessoaBean pessoa) {
		pessoaDAO = new PessoaDAO();
		pessoaDAO.incluir(pessoa);
		
		return true;
	}
	
	public boolean excluirPessoa(PessoaBean pessoa) {
		pessoaDAO = new PessoaDAO();
		pessoaDAO.remover(pessoa);
		
		return true;
	}
}
