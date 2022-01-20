package teste.heranca;

import infra.DAO;
import modelo.heranca.Aluno;
import modelo.heranca.AlunoBolsista;

public class NovoAluno {
	
	public static void main(String[] args) {
		
		DAO<Aluno> alunoDAO = new DAO<>();
		
		Aluno aluno1 = new Aluno(123L, "João");
		AlunoBolsista aluno2 = new AlunoBolsista(12345L, "Antonio Nunes", 500.04);
		
		alunoDAO.incluirAtomico(aluno1);
		alunoDAO.incluirAtomico(aluno2);
		
		alunoDAO.fechar();
		
	}

}

//
//JAVAFX -> Quinta e SExta e SABADO
//Conceito WEb Dommigo 
//Spring Domingo e Segunda e Terça
//Não Relacional
//Quarta e Quinta