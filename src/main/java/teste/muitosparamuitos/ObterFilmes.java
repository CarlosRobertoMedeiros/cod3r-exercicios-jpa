package teste.muitosparamuitos;

import java.util.List;

import infra.DAO;
import modelo.muitoparamuitos.Ator;
import modelo.muitoparamuitos.Filme;

public class ObterFilmes {
	
	public static void main(String[] args) {

		DAO<Filme> dao = new DAO<>(Filme.class);
		List<Filme> filmes = dao.consultar("obterFilmesComNotaMaiorQue", "nota", 7.0);
		
		for (Filme filme : filmes) {
			System.out.println(filme.getNome()+" => "+filme.getNota());
			
			for(Ator ator: filme.getAtores()) {
				System.out.println(ator.getNome());
			}
		}
		
		
	}

}
