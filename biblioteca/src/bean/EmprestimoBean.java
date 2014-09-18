package bean;

import java.util.Date;

public class EmprestimoBean implements Comparable<LivroBean>{
	private PessoaBean pessoa;
	private LivroBean livro;
	private Date dataEmprestimo;
	private Date dataDevolucaoEmprestimo;

	public EmprestimoBean(PessoaBean pessoa, LivroBean livro,
			Date dataEmprestimo) {
		super();
		this.pessoa = pessoa;
		this.livro = livro;
		this.dataEmprestimo = dataEmprestimo;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof LivroBean
				&& ((LivroBean)obj).getISBN().equals(
						this.livro.getISBN()))
			return true;
		
			return false;
	}

	@Override
	public int compareTo(LivroBean o) {

		return this.livro.getISBN().compareTo(o.getISBN());
	}

}
