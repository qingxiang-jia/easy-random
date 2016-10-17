import java.util.Random;

public class RInt extends EasyRandom {
  private int min, max;

  public RInt(int min, int max) {
    this.min = min;
    this.max = max;
  }

  public int gen() {
    return rand.nextInt(min, max);
  }

  public int gen(int min, int max) {
    return rand.nextInt(min, max);
  }
}
