package Part_1;

public class Main {

    public static void main(String[] args) {
        Tripleton obj1 = Tripleton.getInstance();
        Tripleton obj2 = Tripleton.getInstance();
        Tripleton obj3 = Tripleton.getInstance();
        Tripleton obj4 = Tripleton.getInstance();

        System.out.println(obj1); //print address of 1st inst
        System.out.println(obj2); //print address of 2nd inst
        System.out.println(obj3); //print address of 3rd inst
        System.out.println(obj4 + "\n");    //should print address of 3rd inst also

        System.out.println(Tripleton.getInstanceN(0));
        System.out.println(Tripleton.getInstanceN(1));
        System.out.println(Tripleton.getInstanceN(2));
    }
}
