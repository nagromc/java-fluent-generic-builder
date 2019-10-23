package model;

public abstract class Car extends Vehicle {
  protected int numberOfWheels;

  @Override
  public boolean canFly() {
    return false;
  }

  @Override
  public boolean canRide() {
    return true;
  }

  @Override
  public String toString() {
    return String.format("%s, Car.numberOfWheels=%d", super.toString(), numberOfWheels);
  }

  public static abstract class Builder<R extends Car, SELF extends Builder>
          extends Vehicle.Builder<R, SELF> {

    public SELF withNumberOfWheels(int numberOfWheels) {
      result.numberOfWheels = numberOfWheels;
      return (SELF) this;
    }

  }
}
