package Part_2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;

public class Prof extends Observable{

	public Prof(String name){
		this.name = name;
	}

	private ArrayList<Student> studentlist;
	private String name;
	private int roomNumber;
	private Date midtermDate;

	public String getName() {
		return name;
	}

	public Date getMidtermDate() {
		return midtermDate;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setMidtermDate(Date midtermDate) {
		this.midtermDate = midtermDate;

		setChanged();
		notifyObservers();
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;

		setChanged();
		notifyObservers();
	}

	public void takingTheMidterm(Student observer){
		this.studentlist.add(observer);
	}

	public void printStudentList(){
		System.out.println(studentlist.toString());
	}
}
