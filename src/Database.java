import java.util.ArrayList;

public class Database {

    // Airplane database
    private ArrayList<Flight> flightList;
    private ArrayList<Plane> planeList;

    public Database(){

        this.flightList = new ArrayList<Flight>();
        this.planeList = new ArrayList<Plane>();

    }

    public void addFlight(Flight flight){
        this.flightList.add(flight);
    }

    public void addPlane(Plane plane){
        this.planeList.add(plane);
    }

    public void printPlanes(){
        for (Plane plane : this.planeList){
            System.out.println(plane);
        }
    }

    public void printFlights(){
        for (Flight flight : this.flightList){
            System.out.println(flight);
        }
    }




}
