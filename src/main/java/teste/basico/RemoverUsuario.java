package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class RemoverUsuario {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		//Funcionou pois o objeto está fora do estado gerenciado
		try {
			
			Usuario usuario = em.find(Usuario.class, 1L);
			
			if(usuario!=null) {
				em.getTransaction().begin();
				em.remove(usuario);
				em.getTransaction().commit();
				System.out.println(usuario.getEmail());
			}
		} catch (Exception e) {
			em.getTransaction().rollback();
			throw new RuntimeException("Ocorreu um Erro desconhecido "+e.getMessage());
		}finally {
			em.close();
			emf.close();
		}
		
		
	}

}
