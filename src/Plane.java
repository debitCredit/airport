public class Plane {

    private String planeID;
    private int planeCapacity;

    public Plane(String planeID, int planeCapacity){
        this.planeID = planeID;
        this.planeCapacity = planeCapacity;
    }

    @Override
    public String toString() {
        return this.planeID + " (" + planeCapacity +" ppl)";
    }
}
