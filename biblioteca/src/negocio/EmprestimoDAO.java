package negocio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

import bean.EmprestimoBean;
import bean.LivroBean;
import bean.PessoaBean;
import persistencia.IEmprestimo;

public class EmprestimoDAO implements IEmprestimo {
	private ArrayList<EmprestimoBean> emprestimos = new ArrayList<>();

	@Override
	public void registrarEmprestimo(LivroBean livro, PessoaBean pessoa) {
		emprestimos.add(new EmprestimoBean(pessoa, livro, new Date(System
				.currentTimeMillis())));
	}

	@Override
	public void registrarDevolucao(LivroBean livro, PessoaBean pessoa) {
		int posicao = Collections.binarySearch(emprestimos, livro); 
		emprestimos.get(posicao);
	}

	@Override
	public ArrayList<EmprestimoBean> listar() {
		
		return emprestimos;
	}

}
