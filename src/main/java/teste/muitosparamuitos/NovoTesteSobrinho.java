package teste.muitosparamuitos;

import infra.DAO;
import modelo.muitoparamuitos.Sobrinho;
import modelo.muitoparamuitos.Tio;

public class NovoTesteSobrinho {
	
	public static void main(String[] args) {
		
		Tio tio1 = new Tio("João");
		Tio tio2 = new Tio("Maria");
		
		Sobrinho sobrinho1 = new Sobrinho("Junior");
		Sobrinho sobrinho2 = new Sobrinho("Ana");
		
		tio1.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tio1);
		
		tio1.getSobrinhos().add(sobrinho2);
		sobrinho2.getTios().add(tio1);
		
		tio2.getSobrinhos().add(sobrinho2);
		sobrinho2.getTios().add(tio2);
		
		tio2.getSobrinhos().add(sobrinho2);
		sobrinho2.getTios().add(tio2);
		
		DAO<Object> dao = new DAO<>();
		dao
			.abrirTransacao()
			.incluir(tio1)
			.incluir(tio2)
			.incluir(sobrinho1)
			.incluir(sobrinho2)
			.fecharTransacao()
			.fechar();
		
		
		
		
		
		
		
	}

}
