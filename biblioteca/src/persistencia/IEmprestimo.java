package persistencia;

import java.util.ArrayList;

import bean.EmprestimoBean;
import bean.LivroBean;
import bean.PessoaBean;

public interface IEmprestimo {
	void registrarEmprestimo (LivroBean livro, PessoaBean pessoa);
	void registrarDevolucao (LivroBean livro, PessoaBean pessoa);
	ArrayList<EmprestimoBean> listar();
}
