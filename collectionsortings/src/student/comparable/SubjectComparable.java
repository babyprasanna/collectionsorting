package student.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class SubjectComparable {

	public static void main(String[] args) {

		ArrayList<Subject> sub = new ArrayList<>();

		Subject subject = new Subject(1, "Java", 90);
		Subject subject1 = new Subject(2, "cpp", 61);
		Subject subject2 = new Subject(3, "C", 22);
		Subject subject3 = new Subject(4, "webdesigning", 49);

		sub.add(subject);
		sub.add(subject1);
		sub.add(subject2);
		sub.add(subject3);

		Collections.sort(sub);

		System.out.println(sub);

	}

}
