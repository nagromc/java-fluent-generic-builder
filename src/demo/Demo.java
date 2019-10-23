package demo;

import model.Airplane;
import model.ElectricCar;
import model.GasolineCar;

public class Demo {

  public static void main(String[] args) {
    airplaneDemo();
    electricCarDemo();
    gasolineCarDemo();
  }

  private static void airplaneDemo() {
    Airplane.Builder builder = Airplane.Builder.newBuilder();
    builder.withModelName("Airbus A380");
    Airplane airplane = builder.build();
    System.out.println(airplane);
  }

  private static void electricCarDemo() {
    ElectricCar.Builder builder = ElectricCar.Builder.newBuilder();
    builder
            .withModelName("Tesla Model S")
            .withNumberOfWheels(4)
            .withSocketType("foo")
    ;
    ElectricCar electricCar = builder.build();
    System.out.println(electricCar);
  }

  private static void gasolineCarDemo() {
    GasolineCar.Builder builder = GasolineCar.Builder.newBuilder();
    builder
            .withModelName("BMW 320d")
            .withNumberOfWheels(4)
            .withMotorType("Diesel")
    ;
    GasolineCar gasolineCar = builder.build();
    System.out.println(gasolineCar);
  }

}
