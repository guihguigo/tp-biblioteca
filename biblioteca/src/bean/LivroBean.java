package bean;

public class LivroBean implements Comparable<LivroBean> {
	private String ISBN;
	private String titulo;
	private String autor;
	private String editora;

	
	public LivroBean(String iSBN, String titulo, String autor, String editora) {
		super();
		ISBN = iSBN;
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
	}

	@Override
	public int compareTo(LivroBean o) {
		return this.ISBN.compareTo(o.ISBN);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof LivroBean
				&& ((LivroBean) obj).ISBN.equals(this.ISBN))
			return true;

		return false;
	}

	public String getISBN() {
		return this.ISBN;
	}

	@Override
	public String toString() {
		return this.ISBN + " " + this.titulo + " " + this.autor + " "
				+ this.editora;
	}

}
