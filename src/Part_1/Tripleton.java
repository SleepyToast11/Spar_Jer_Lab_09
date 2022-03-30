package Part_1;

public class Tripleton {

	private Tripleton() {
	}

	private static Tripleton[] array = new Tripleton[3];

	public static Tripleton getInstance(){
		if (array[0] == null){
			array[0] = new Tripleton();
			return array[0];
		}
		else if (array[1] == null){
			array[1] = new Tripleton();
			return array[1];
		}
		else if (array[2] == null){
			array[2] = new Tripleton();
			return array[2];
		}
		else
			return array[2];
	}

	public static Tripleton getInstanceN(int index) {
		return array[index];
	}
}
