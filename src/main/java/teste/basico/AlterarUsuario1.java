package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class AlterarUsuario1 {
	
	public static void main(String[] args) {
		

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		String jpql = "select u from Usuario u";
		
		try {
			em.getTransaction().begin();
			
			Usuario usuario = em.find(Usuario.class, 1L);
			System.out.println(usuario.getEmail());
			
			usuario.setNome("Carlos Lima");
			usuario.setEmail("numsei@esqueci.com");
			em.merge(usuario);
			
			em.getTransaction().commit();
			System.out.println(usuario.getEmail());
			
		} catch (Exception e) {
			em.getTransaction().rollback();
			throw new RuntimeException("Ocorreu um Erro desconhecido "+e.getMessage());
		}finally {
			em.close();
			emf.close();
		}
		
	}

}
