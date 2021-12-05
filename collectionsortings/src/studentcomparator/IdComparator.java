package studentcomparator;

import java.util.Comparator;

import student.comparable.Student;

public class IdComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		if (o1.getRollno() == o2.getRollno()) {
			return 0;
		} else if (o1.getRollno() > o2.getRollno()) {
			return 1;
		} else {
			return -1;
		}

	}

}
