package AbstractFactory.Vehicle;

public class Honda implements Vehicle {
  public void start() {
    System.out.println("Honda Car is starting");
  }
  public void stop() {
    System.out.println("Honda Car is stopping");
  }
}