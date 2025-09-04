package AbstractFactory.Vehicle;

public class ToyotaFactory implements VehicleFactory {
  public Vehicle createVehicle() {
    return new Toyota();
  }
}