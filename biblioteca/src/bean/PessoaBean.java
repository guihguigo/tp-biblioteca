package bean;

public class PessoaBean implements Comparable<PessoaBean>{
	private String nome;
	private String cpf;
	private String email;
	
	@Override
	public int compareTo(PessoaBean o) {	
		return this.cpf.compareTo(o.cpf);
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof PessoaBean && ((PessoaBean) obj).cpf.equals(this.cpf))
			return true;
			
		return false;
	}

	public String getCpf() {
		// TODO Auto-generated method stub
		return this.cpf;
	}
		
}
