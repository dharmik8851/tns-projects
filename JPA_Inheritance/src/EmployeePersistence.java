import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeePersistence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Employee_details");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		ActiveEmployee ae1 = new ActiveEmployee(1, "dharmik", 10000, 0);
		RetiredEmployee re1 = new RetiredEmployee(2, "abhi", 50000);
		em.persist(ae1);
		em.persist(re1);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
