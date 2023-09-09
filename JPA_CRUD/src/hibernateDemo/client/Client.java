package hibernateDemo.client;

import hibernateDemo.entities.Student;
import hibernateDemo.service.*;

public class Client {

	public static void main(String[] args) {

		StudentService service = new StudentServiceLogic();

		// Create
		Student student = new Student();
		student.setId(1004);
		student.setName("rupal");
		service.addStudent(student);

		// Retrieve
		student = service.findStudentById(1003);
		System.out.println(student);

		// update
		student = service.findStudentById(1001);
		student.setName("Sachin Tendulkar");
		service.updateStudent(student);

		// at this breakpoint, we have updated record added in first section
		student = service.findStudentById(1001);
		System.out.print(student);
		
		// at this breakpoint, record is removed from table
		// Delete Operation
		student = service.findStudentById(1002);
		service.removeStudent(student);
		System.out.println("End of program/Life cycle completed...");

	}

}
