
import java.util.Scanner;

public class UserInterface {

    private Scanner reader;
    private Database database;

    public UserInterface(Scanner reader, Database database) {
        this.reader = reader;
        this.database = database;
    }

    public void start() {

        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");

        while (true) {

            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            String input = reader.nextLine();
            if (input.equals("x")) {
                flightService();
                break;
            }
            handleStatementAirport(input);
        }
    }

    private void handleStatementAirport(String statement) {
        if (statement.equals("1")) {
            newPlane();
        } else if (statement.equals("2")) {
            newFlight();
        }
    }

    private void handleStatementFlight(String statement) {
        if (statement.equals("1")) {
            database.printPlanes();
        } else if (statement.equals("2")) {
            database.printFlights();
        } else if (statement.equals("3")){
            System.out.println("Give plane ID:");
            String input = reader.nextLine();
            System.out.println(database.getPlane(input));
        }
    }

    public void flightService() {

        System.out.println("Flight service\n" +
                "------------");
        System.out.println();

        while (true) {
            System.out.println();
            System.out.println("Choose action:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");

            String input = reader.nextLine();
            if (input.equals("x")) {
                break;
            }
            handleStatementFlight(input);


        }
    }
        public void newPlane () {
            System.out.println("Give plane ID:");
            String planeID = reader.nextLine();
            System.out.println("Give plane capacity:");
            int planeCapacity = Integer.parseInt(reader.nextLine());
            database.addPlane(new Plane(planeID, planeCapacity));
        }

        public void newFlight () {
            System.out.println("Give plane ID:");
            String planeID = reader.nextLine();
            System.out.println("Give departure airport code: ");
            String depAirportCode = reader.nextLine();
            System.out.println("Give destination airport code: ");
            String arrAirportCode = reader.nextLine();
            database.addFlight(new Flight(database.getPlane(planeID), depAirportCode, arrAirportCode));
        }


    }
