package persistencia;

import java.util.ArrayList;

import bean.LivroBean;

public interface ILivro {
	void incluir(LivroBean livro);
	void remover(LivroBean livro);
	ArrayList<LivroBean> listar();
	LivroBean consultar(LivroBean livro);
}
