package Part_2;

import java.util.Observable;
import java.util.Observer;

public class Student implements Observer {

	private final String name;
	private int roomNumber;
	private Course course;

	/**
	 * This method is called whenever the observed object is changed. An
	 * application calls an <tt>Observable</tt> object's
	 * <code>notifyObservers</code> method to have all the object's
	 * observers notified of the change.
	 *
	 * @param o the observable object.
	 * @param arg an argument passed to the <code>notifyObservers</code>
	 * method.
	 */
	@Override
	public void update(java.util.Observable o, Object arg) {
		if(arg instanceof Integer){
			roomNumber = (Integer)arg;
			System.out.println("Student " + name + " has a midterm in room number: " + roomNumber);
			return;
		}
		System.out.println("Student " + name + " says ..Doh got it dude!");
		System.out.println( ((Prof)o).getName() + " says " + arg);
		((Prof)o).takingTheMidterm(this);
	}

	public Student(String name){
		this.name = name;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public String getName() {
		return name;
	}

	public Course getCourse() {
		return course;
	}

	public void registerToCourse(Course c){
		c.addObserver(this);
	}
}
