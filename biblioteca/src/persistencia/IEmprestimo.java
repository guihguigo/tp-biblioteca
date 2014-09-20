package persistencia;

import java.util.ArrayList;

import bean.EmprestimoBean;

public interface IEmprestimo {
	void registrarEmprestimo (EmprestimoBean emprestimo);
	void registrarDevolucao (EmprestimoBean emprestimo);
	ArrayList<EmprestimoBean> listar();
}
