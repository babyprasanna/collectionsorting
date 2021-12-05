package student.comparable;

import java.util.ArrayList;
import java.util.Collections;

import student.comparable.Student;

public class StudentComparable {

	public static void main(String[] args) {

		ArrayList<Student> stu = new ArrayList<>();

		Student student = new Student(1, "Prasanna", 93);
		Student student2 = new Student(2, "Rajendra", 64);
		Student student3 = new Student(3, "Rekha", 15);
		Student student4 = new Student(3, "Ram", 19);

		stu.add(student);
		stu.add(student2);
		stu.add(student3);
		stu.add(student4);

		Collections.sort(stu);
		
		System.out.println(stu);
	}

}