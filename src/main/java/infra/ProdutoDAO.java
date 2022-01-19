package infra;

import modelo.basico.Produto;

public class ProdutoDAO extends DAO<Produto> {
	//Aqui eu usaria uma outra abordagem
	
	public ProdutoDAO() {
		super(Produto.class);
	}

}
