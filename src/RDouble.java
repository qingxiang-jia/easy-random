public class RDouble extends EasyRandom {
  private double min, max;

  public RDouble(double min, double max) {
    this.min = min;
    this.max = max;
  }

  public double gen() {
    return rand.nextDouble(min, max);
  }

  public double gen(double min, double max) {
    return rand.nextDouble(min, max);
  }
}
