package studentcomparator;

import java.util.ArrayList;
import java.util.Collections;

import student.comparable.Student;
import student.comparable.Subject;

public class Main {

	public static void main(String[] args) {

		ArrayList<Student> stu = new ArrayList<>();

		Student student = new Student(2, "Prasanna", 93);
		Student student2 = new Student(4, "Rajendra", 64);
		Student student3 = new Student(3, "Rekha", 15);
		Student student4 = new Student(1, "Ram", 19);

		stu.add(student);
		stu.add(student2);
		stu.add(student3);
		stu.add(student4);

		Collections.sort(stu, new AgeComparator());
		Collections.sort(stu, new IdComparator());

		ArrayList<Subject> sub = new ArrayList<>();

		Subject subject = new Subject(3, "Java", 90);
		Subject subject1 = new Subject(4, "cpp", 61);
		Subject subject2 = new Subject(1, "C", 22);
		Subject subject3 = new Subject(2, "webdesigning", 49);

		sub.add(subject);
		sub.add(subject1);
		sub.add(subject2);
		sub.add(subject3);

		Collections.sort(sub, new MarksComparator());

		System.out.println(stu);
		System.out.println(sub);

	}

}
