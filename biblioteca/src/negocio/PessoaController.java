package negocio;

import java.util.ArrayList;

import bean.PessoaBean;
import persistencia.PessoaDAO;

public class PessoaController {
	private PessoaDAO pessoaDAO;
	
	public PessoaController() {
		pessoaDAO = new PessoaDAO();
	}
	public ArrayList<PessoaBean> listar() {
		return pessoaDAO.Listar();
	}
	
	public void incluir(PessoaBean pessoa) {
		pessoaDAO.incluir(pessoa);
	}
	
	public void excluir(PessoaBean pessoa) {
		pessoaDAO.remover(pessoa);
	}
	
	public PessoaBean consultar(PessoaBean pessoa) {
		return pessoaDAO.consultar(pessoa);
	}
}
