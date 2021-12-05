package student.comparable;

import java.util.Objects;

public class Student implements Comparable<Student> {

	private int rollno;
	private String name;
	private int age;

	public Student() {

	}

	public Student(int rollno, String name, int age) {

		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name, rollno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(age, other.age) && Objects.equals(name, other.name) && rollno == other.rollno;
	}

	public int compareTo(Student s) {

		if (age == s.age) {

			return 0;
		} else if (age > s.age) {

			return 1;
		} else {

			return -1;
		}
	}

}
