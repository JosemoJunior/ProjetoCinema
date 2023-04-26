import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		
		try {
			
			Ator ator1 = new Ator("Arnold Schwarzenegger");
			Ator ator2 = new Ator("Jean Claude Van Damme");
			Ator ator3 = new Ator("Jack Nicholson");
			Ator ator4 = new Ator("Mia Khalifa");
			Ator ator5 = new Ator("Clint Eastwood");
			
			Genero genero1 = new Genero("Ação");
			Genero genero2 = new Genero("Aventura");
			Genero genero3 = new Genero("Comédia");
			Genero genero4 = new Genero("Romance");
			
			Filme filme1 = new Filme("Gran Torino 2", "130");
			filme1.addAtor(ator3);
			filme1.addAtor(ator4);
			filme1.addAtor(ator5);
			filme1.addGenero(genero3);
			filme1.addGenero(genero4);
			
			Filme filme2 = new Filme("Mercenários 2", "103");
			filme2.addAtor(ator1);
			filme2.addAtor(ator2);
			filme2.addGenero(genero1);
			filme2.addGenero(genero2);
			
			Sessao sessao1 = new Sessao("28/04/2023","19:10", filme2);
			Sessao sessao2 = new Sessao("28/04/2023","21:30", filme2);
			Sessao sessao3 = new Sessao("29/04/2023","19:10", filme1);
			Sessao sessao4 = new Sessao("29/04/2023","21:30", filme1);
			
			filme1.addSessao(sessao3);
			filme1.addSessao(sessao4);
			
			filme2.addSessao(sessao1);
			filme2.addSessao(sessao2);
			
			Sala sala1 = new Sala(1, 50);
			
			sala1.cadastrarSessao(sessao1);
			sala1.cadastrarSessao(sessao2);
			sala1.cadastrarSessao(sessao3);
			sala1.cadastrarSessao(sessao4);
			sala1.listarSessoes();
			
			System.out.println("\n");
			
			sala1.alterarSessao(sessao4, 0);
			sala1.listarSessoes();
			
			System.out.println("\n");
			
			sala1.removerSessao(0);
			sala1.listarSessoes();
			
			System.out.println("\n");
			
			filmesLongos(sala1);
			
		
		} catch (SessaoRepetidaException e) {
			
			System.out.println("Erro: " + e.getMessage());
			
		} catch (Exception e) {
			
			System.out.println("Erro desconhecido: " + e.getMessage());
		
		}	
		
	}
	
	public static void filmesLongos(Sala sala) {
		
		System.out.println("Lista dos filmes com mais de duas horas: \n");
		
		List<Sessao> sessoes = sala.getSessoes();
		Set<Filme> filmesLongos = new LinkedHashSet<Filme>();
		
		for (int i=0;i<sessoes.size();i++) {
			
			if (Integer.parseInt(sessoes.get(i).getFilme().getDuracao()) > 120) {
				filmesLongos.add(sessoes.get(i).getFilme());
			}
			
		}
		
		for (Filme filme : filmesLongos) {
			System.out.println(filme.getTitulo());
		}
		
	}

}
