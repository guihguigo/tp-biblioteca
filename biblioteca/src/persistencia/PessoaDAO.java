package persistencia;

import java.util.ArrayList;
import java.util.Collections;

import bean.PessoaBean;

public class PessoaDAO implements IPessoa{
	private static ArrayList<PessoaBean> pessoas = new ArrayList<>();
	
	@Override
	public void incluir(PessoaBean pessoa) {
		pessoas.add(pessoa);
	}

	@Override
	public void remover(PessoaBean pessoa) {
		pessoas.remove(pessoa);
	}

	@Override
	public ArrayList<PessoaBean> Listar() {
		return pessoas;
	}

	@Override
	public PessoaBean consultar(PessoaBean pessoa) {
		int posicao = pessoas.indexOf(pessoa);
		return pessoas.get(posicao);
	}

}
