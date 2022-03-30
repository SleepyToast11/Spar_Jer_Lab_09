package Part_2;

import java.util.Date;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;

public class Secretary implements Observer {
	private Date date;

	public void registerToProf(Prof p){
		p.addObserver(this);
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public void update(Observable o, Object arg) {
		if (arg instanceof Integer) {
			return;
		} else {
			setDate((Date) arg);
			Random rand = new Random();
			((Prof)o).setRoomNumber(rand.nextInt(10) + 1);
		}
	}
}
