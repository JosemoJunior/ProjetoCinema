import java.util.List;

public class Utilidades {

	public static boolean temSessaoRepetida(Sessao sessao, List<Sessao> sessoes) {
		
		for (Sessao sessaoSala : sessoes) {
			if (sessao.getData_sessao().equals(sessaoSala.getData_sessao())
					&& sessao.getHor_sessao().equals(sessaoSala.getHor_sessao())) {
				
				return true;
			}
		}
		
		return false;
		
	}
	
}
