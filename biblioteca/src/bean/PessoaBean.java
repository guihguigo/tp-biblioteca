package bean;

public class PessoaBean implements Comparable<PessoaBean>{
	private String nome;
	private String cpf;
	private String email;
	
	
	public PessoaBean(String nome, String cpf, String email) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}

	@Override
	public int compareTo(PessoaBean o) {	
		return this.cpf.compareTo(o.cpf);
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof PessoaBean && ((PessoaBean) obj).cpf.equals(this.cpf))
			return true;
			
		return false;
	}

	@Override
	public String toString() {
		return this.nome + " " + this.cpf + " " + this.email;
	}
	public String getCpf() {
		// TODO Auto-generated method stub
		return this.cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
		
	
}
