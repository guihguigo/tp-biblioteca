package negocio;

import java.util.ArrayList;

import persistencia.IEmprestimo;
import bean.EmprestimoBean;

public class EmprestimoDAO implements IEmprestimo {
	private static ArrayList<EmprestimoBean> emprestimos = new ArrayList<>();

	@Override
	public void registrarEmprestimo(EmprestimoBean emprestimo) {
		emprestimos.add(emprestimo);
	}

	@Override
	public void registrarDevolucao(EmprestimoBean emprestimo) {
		int posicao = emprestimos.indexOf(emprestimo);
		emprestimos.set(posicao, emprestimo);
	}
	
	@Override
	public ArrayList<EmprestimoBean> listar() {
		return emprestimos;
	}

}
