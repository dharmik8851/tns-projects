package entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {

		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Student st=new Student();
		st.setName("paragraj");
		
		Address homeAddress=new Address();
		homeAddress.setStreet("12th Street");
		homeAddress.setCity("Mumbai");
		homeAddress.setState("MH");
		homeAddress.setZipcode(421501);
		homeAddress.setStudent(st);
		
		//inject/map address into student
		
		
		em.persist(homeAddress);

		em.getTransaction().commit();
		
		System.out.println("Added one student with address to the database");
		
		em.close();
		factory.close();
		
		
	}

}