
public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.

        Plane testPlane1 = new Plane("Damian", 1 );
        Plane testPlane2 = new Plane("Gosia", 99 );
        System.out.println(testPlane1);
        System.out.println(testPlane2);

        Database database = new Database();

        database.addPlane(testPlane1);
        database.addPlane(testPlane2);

        database.printFlights();

        database.printPlanes();



    }
}
