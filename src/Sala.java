import java.util.ArrayList;
import java.util.List;

public class Sala {
	
	private int numSala;
	private int capacidade;
	private List<Sessao> sessoes;
	
	public Sala() {
		this.sessoes = new ArrayList<Sessao>();
	}
	
	public Sala(int numSala, int capacidade) {
		this.numSala = numSala;
		this.capacidade = capacidade;
		this.sessoes = new ArrayList<Sessao>();
	}
	
	public List<Sessao> getSessoes() {
		return sessoes;
	}

	public int getNumSala() {
		return numSala;
	}
	public void setNumSala(int numSala) {
		this.numSala = numSala;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	@Override
	public String toString() {
		return "Sala [numSala=" + numSala + ", capacidade=" + capacidade + ", sessoes=" + sessoes + "]";
	}

	public void cadastrarSessao(Sessao sessao) throws SessaoRepetidaException {
		
		for (Sessao sessaoSala : sessoes) {
			if (sessao.getData_sessao().equals(sessaoSala.getData_sessao())
					&& sessao.getHor_sessao().equals(sessaoSala.getHor_sessao())) {
				
				throw new SessaoRepetidaException(
						"Não pode haver duas sessões ao mesmo tempo.");
				
			}
		}
		
		this.sessoes.add(sessao);
	}
	
	public void alterarSessao(Sessao sessao, int posicao) {
	    
		if (posicao < 0 || posicao >= sessoes.size()) {
	        throw new IndexOutOfBoundsException("Posição inválida.");
	    }
	    sessoes.set(posicao, sessao);
	}
	public void removerSessao(int posicao) {
		if (posicao < 0 || posicao >= sessoes.size()) {
	        throw new IndexOutOfBoundsException("Posição inválida.");
	    }
		sessoes.remove(posicao);
	}
	public void listarSessoes() {
		for (Sessao sessaoSala : sessoes) {
			System.out.println(sessaoSala.toString()); 
		}
	}

}
