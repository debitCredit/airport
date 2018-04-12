public class Flight {

    private Plane plane;
    private String depAirport;
    private String arrAirport;

    public Flight(Plane plane, String depAirport, String arrAirport){
        this.plane = plane;
        this.depAirport = depAirport;
        this.arrAirport = arrAirport;
    }

    @Override
    public String toString() {
        return plane + "(" + this.depAirport + "-" + this.arrAirport + ")";
    }
}
