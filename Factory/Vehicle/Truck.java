package Factory.Vehicle;

public class Truck implements Vehicle{
    public void start(){
        System.out.println("Truck is Starting...");
    }
    public void stop(){
        System.out.println("Truck is Stopping...");
    }
}