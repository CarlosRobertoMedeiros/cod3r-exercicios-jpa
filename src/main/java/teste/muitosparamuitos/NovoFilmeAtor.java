package teste.muitosparamuitos;

import infra.DAO;
import modelo.muitoparamuitos.Ator;
import modelo.muitoparamuitos.Filme;

public class NovoFilmeAtor {
	
	public static void main(String[] args) {
		
		Filme filmeA = new Filme("Terminator I", 7.4);
		Filme filmeB = new Filme("Terminator II", 8.7);
		
		Ator atorA = new Ator("Arnold Schwarzenegger");
		Ator atrizB = new Ator("Linda Hamilton");
		
		filmeA.adicionarAtor(atorA);
		filmeA.adicionarAtor(atrizB);
		
		filmeB.adicionarAtor(atorA);
		
		DAO<Filme> dao = new DAO<>();
		dao.incluirAtomico(filmeA); //Lembrando que está em cascata
		
	}

}
