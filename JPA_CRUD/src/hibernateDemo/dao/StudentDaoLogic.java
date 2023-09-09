package hibernateDemo.dao;

import javax.persistence.EntityManager;

import hibernateDemo.entities.Student;

public class StudentDaoLogic implements StudentDao{
	
	private EntityManager entityManager;
	
	public StudentDaoLogic() {
		entityManager = JPAUtil.getEntityManager();
	}

	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		Student student = entityManager.find(Student.class, id);
		System.out.println("Student fetched successfully");
		return student;
	}

	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		entityManager.persist(student);
		System.out.println("Student saved successfully");
	}

	public void removeStudent(Student student) {
		// TODO Auto-generated method stub
		entityManager.remove(student);
		System.out.println("Student removed successfully");
	}

	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		entityManager.merge(student);
		System.out.println("Student updated successfully");
	}

	public void commitTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().commit();
		System.out.println("transaction commited");
	}

	public void beginTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
		System.out.println("transaction begin");
	}

}
