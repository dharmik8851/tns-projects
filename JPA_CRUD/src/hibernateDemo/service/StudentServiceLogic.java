package hibernateDemo.service;

import hibernateDemo.dao.StudentDao;
import hibernateDemo.dao.StudentDaoLogic;
import hibernateDemo.entities.Student;

public class StudentServiceLogic implements StudentService{
	
	private StudentDao dao;
	
	public StudentServiceLogic() {
		dao = new StudentDaoLogic();
	}

	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
	}

	public void removeStudent(Student student) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.removeStudent(student);
		dao.commitTransaction();
	}

	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
	}

	public Student findStudentById(int id) {
		// TODO Auto-generated method stub
		Student student = dao.getStudentById(id);
		return student;
	}

}
