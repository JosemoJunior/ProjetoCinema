import java.util.ArrayList;
import java.util.List;

public class Filme {

	private String titulo;
	private String duracao;
	private List<Sessao> sessoes;
	private List<Ator> atores;
	private List<Genero> generos;
	
	public Filme() {
		this.generos = new ArrayList<Genero>();
		this.atores = new ArrayList<Ator>();
		this.sessoes = new ArrayList<Sessao>();
	}
	
	public Filme(String titulo, String duracao) {
		this.titulo = titulo;
		this.duracao = duracao;
		this.generos = new ArrayList<Genero>();
		this.atores = new ArrayList<Ator>();
		this.sessoes = new ArrayList<Sessao>();
		
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	
	@Override
	public String toString() {
		return "Filme [titulo=" + titulo + ", duracao=" + duracao + ", sessoes=" + sessoes + ", atores=" + atores
				+ ", generos=" + generos + "]";
	}

	public void listarSessoes() {
		
	}
	
	public void listarAtores() {
		
	}
	
	public void listarGeneros() {
		
	}
	
	public void addGenero(Genero genero) {
		this.generos.add(genero);
	}
	
	public void addAtor(Ator ator) {
		this.atores.add(ator);
	}
	
	public void addSessao(Sessao sessao) throws SessaoRepetidaException {

		if (Utilidades.temSessaoRepetida(sessao, this.sessoes)) {
			throw new SessaoRepetidaException(
					"Não pode haver duas sessões ao mesmo tempo.");
		}
		
		this.sessoes.add(sessao);
	}
	
}
