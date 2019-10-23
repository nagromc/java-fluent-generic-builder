package model;

public class GasolineCar extends Car {
  protected String motorType;

  @Override
  public String toString() {
    return String.format("%s, GasolineCar.motorType=%s", super.toString(), motorType);
  }




  public static class Builder extends Car.Builder<GasolineCar, Builder> {

    public Builder() {
      result = new GasolineCar();
    }

    public static Builder newBuilder() {
      return new Builder();
    }

    public Builder withMotorType(String motorType) {
      result.motorType = motorType;
      return this;
    }

  }
}
