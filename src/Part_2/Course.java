package Part_2;

import java.util.Observable;

public class Course extends Observable{
	String courseName;
	Prof prof;
	public Course(String courseName, Prof prof){
		this.courseName = courseName;
		this.prof = prof;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public void setProf(Prof prof) {
		this.prof = prof;
	}

	public String getCourseName() {
		return courseName;
	}

	public Prof getProf() {
		return prof;
	}
}
