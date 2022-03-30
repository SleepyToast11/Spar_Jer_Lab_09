package Part_2;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Prof prof = new Prof("Seinfeld");
		Course course = new Course("Generic CS", prof);
		Student stu1 = new Student("Kramer");
		Student stu2 = new Student("Elaine");
		Student stu3 = new Student("Jerry");
		Student stu4 = new Student("George");
		Secretary secretary = new Secretary();
		secretary.registerToProf(prof);
		stu1.registerToCourse(course);
		/*stu2.registerToCourse(course);
		stu3.registerToCourse(course);
		stu4.registerToCourse(course);*/
		Date date = new Date();
		prof.setMidtermDate(date);
		prof.printStudentList();
	}
}
