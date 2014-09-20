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
		this.dataDevolucaoEmprestimo = dataDevolucaoEmprestimo;
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

	public PessoaBean getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaBean pessoa) {
		this.pessoa = pessoa;
	}

	public LivroBean getLivro() {
		return livro;
	}

	public void setLivro(LivroBean livro) {
		this.livro = livro;
	}

	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public Date getDataDevolucaoEmprestimo() {
		return dataDevolucaoEmprestimo;
	}

	public void setDataDevolucaoEmprestimo(Date dataDevolucaoEmprestimo) {
		this.dataDevolucaoEmprestimo = dataDevolucaoEmprestimo;
	}
	
	

}
