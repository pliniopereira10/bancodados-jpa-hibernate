package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AberturaCadastro {

	public static void main(String[] args) {
		
		// Aqui crio a conexão chamando as configurações do arquivo persistence.xml pelo nome bd-teste
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bd-teste");
		//	Aqui crio objeto responsável pela manipulação da tabela
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.close();	//	fim do gerenciador de manipulação da tabela
		entityManagerFactory.close();	//	fim da conexao com o banco de dados

	}	//	fim do método principal

}	//	fim da classe AberturaCadastro
