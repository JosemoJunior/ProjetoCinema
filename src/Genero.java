
public class Genero {

	private String descricao;
	
	public Genero() {}

	public Genero(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Genero [descricao=" + descricao + "]";
	}
	
}
