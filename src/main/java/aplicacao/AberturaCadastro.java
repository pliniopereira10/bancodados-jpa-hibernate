package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AberturaCadastro {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bd-teste");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.close();
		entityManagerFactory.close();

	}

}