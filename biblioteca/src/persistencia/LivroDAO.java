package persistencia;

import java.util.ArrayList;
import java.util.Collections;

import bean.LivroBean;

public class LivroDAO implements ILivro{
	private static ArrayList<LivroBean> livros = new ArrayList<>();
	
	@Override
	public void incluir(LivroBean livro) {
		livros.add(livro);
	}

	@Override
	public void remover(LivroBean livro) {
		livros.remove(livro);
	}

	@Override
	public ArrayList<LivroBean> listar() {
		return livros;
	}

	@Override
	public LivroBean consultar(LivroBean livro) {
		int posicao = Collections.binarySearch(livros, livro);
		return livros.get(posicao);
	}
	
}
