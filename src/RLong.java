public class RLong extends EasyRandom {
  private long min, max;

  private RLong(long min, long max) {
    this.min = min;
    this.max = max;
  }

  public long gen() {
    return rand.nextLong(min, max);
  }

  public long gen(long min, long max) {
    return rand.nextLong(min, max);
  }
}
