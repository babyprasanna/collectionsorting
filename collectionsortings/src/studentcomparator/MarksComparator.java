package studentcomparator;

import java.util.Comparator;

import student.comparable.Subject;

public class MarksComparator implements Comparator<Subject> {

	@Override
	public int compare(Subject o1, Subject o2) {

		if (o1.getMarks() == o2.getMarks()) {
			return 0;
		} else if (o1.getMarks() > o2.getMarks()) {
			return 1;
		} else {
			return -1;
		}
	}
}
