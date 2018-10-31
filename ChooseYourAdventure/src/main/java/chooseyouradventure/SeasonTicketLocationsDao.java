package chooseyouradventure;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class SeasonTicketLocationsDao {
	
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("ChooseYourAdventure");
	
	public void insertSeasonTicketLocations(SeasonTicketLocations seasonTicketLocationsToAdd) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(seasonTicketLocationsToAdd);
		em.getTransaction().commit();
		em.close();
		}

	public List<SeasonTicketLocations> getAllSeasonTicketLocations() {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction() .begin();
		String q = "Select s from SeasonTicketLocations s";
		TypedQuery<SeasonTicketLocations> typedQuery = em.createQuery(q, SeasonTicketLocations.class);
		List<SeasonTicketLocations> all = typedQuery.getResultList();
		return all;
	}
}