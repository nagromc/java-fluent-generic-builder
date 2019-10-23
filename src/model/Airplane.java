package model;

public class Airplane extends Vehicle {
  @Override
  public boolean canFly() {
    return true;
  }

  @Override
  public boolean canRide() {
    return false;
  }




  public static class Builder extends Vehicle.Builder<Airplane, Builder> {

    public Builder() {
      result = new Airplane();
    }

    public static Builder newBuilder() {
      return new Builder();
    }

  }

}
