package model;

public class ElectricCar extends Car {
  protected String socketType;

  @Override
  public String toString() {
    return String.format("%s, ElectricCar.socketType=%s", super.toString(), socketType);
  }




  public static class Builder extends Car.Builder<ElectricCar, Builder> {

    public Builder() {
      result = new ElectricCar();
    }

    public static Builder newBuilder() {
      return new Builder();
    }

    public Builder withSocketType(String socketType) {
      result.socketType = socketType;
      return this;
    }

  }
}
