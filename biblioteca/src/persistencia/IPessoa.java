package persistencia;

import java.util.ArrayList;

import bean.PessoaBean;

public interface IPessoa {
	void incluir (PessoaBean pessoa);
	void remover (PessoaBean pessoa);
	ArrayList<PessoaBean> Listar();
	PessoaBean consultar(PessoaBean pessoa);
}
