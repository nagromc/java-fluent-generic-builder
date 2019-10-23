package model;

public abstract class Vehicle {
  protected String modelName;

  abstract public boolean canFly();
  abstract public boolean canRide();

  @Override
  public String toString() {
    return String.format("Vehicle.modelName='%s', Vehicle.canFly=%s, Vehicle.canRide=%s", modelName, canFly(), canRide());
  }

  public static abstract class Builder<R extends Vehicle, SELF extends Builder> {
    R result;

    public R build() {
      return result;
    }

    public SELF withModelName(String modelName) {
      result.modelName = modelName;
      return (SELF) this;
    }
  }
}
