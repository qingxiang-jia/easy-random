public class Tests {
  public static void main(String...args) {
    int min = 0, max = 11;
    RInt rInt = new RInt(min, max);
    System.out.printf("Should be between %d and %d\n", min, max);
    for (int i = 0; i < 100; i++) {
      System.out.println(rInt.gen());
    }
    min = 10;
    max = 21;
    System.out.printf("Should be between %d and %d\n", min, max);
    for (int i = 0; i < 20; i++) {
      System.out.println(rInt.gen(min, max));
    }
  }
}
