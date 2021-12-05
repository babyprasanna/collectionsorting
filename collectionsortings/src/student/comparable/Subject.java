package student.comparable;

import java.util.Objects;

public class Subject implements Comparable<Subject> {

	private int id;
	private String subname;
	private int marks;

	public Subject() {

	}

	public Subject(int id, String subname, int marks) {

		this.id = id;
		this.subname = subname;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubname() {
		return subname;
	}

	public void setSubname(String subname) {
		this.subname = subname;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Subject [id=" + id + ", subname=" + subname + ", marks=" + marks + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, marks, subname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subject other = (Subject) obj;
		return id == other.id && marks == other.marks && Objects.equals(subname, other.subname);
	}

	@Override
	public int compareTo(Subject s) {
		if (marks == s.marks) {
			return 0;
		} else if (marks > s.marks) {
			return 1;
		} else {
			return -1;

		}

	}
}
