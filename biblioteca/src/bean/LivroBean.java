package bean;

public class LivroBean implements Comparable<LivroBean>{
	private String ISBN;
	private String titulo;
	private String autor;
	private String editora;
	
	@Override
	public int compareTo(LivroBean o) {
		return this.ISBN.compareTo(o.ISBN);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof LivroBean && ((LivroBean)obj).ISBN.equals(this.ISBN))
			return true;
		
		return false;
	}

	public String getISBN() {
		return this.ISBN;
	}
	
	
	
}
