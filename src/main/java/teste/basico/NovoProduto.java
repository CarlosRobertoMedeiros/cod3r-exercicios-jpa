package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {
	
	public static void main(String[] args) {
		
		Produto produto = new Produto("Monitor 23", 798.98);

//		DAO<Produto> dao = new DAO<>();
//		dao.abrirTransacao().incluir(produto).fecharTransacao().fechar();
		
		DAO<Produto> dao = new DAO<>();
		dao.incluirAtomico(produto).fechar();
		
		System.out.println("ID do Produto: "+produto.getId());
		
		
	}

}
