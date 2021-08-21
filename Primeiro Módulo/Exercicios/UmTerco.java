public class UmTerco {

  public static void main(String[] args) {
    double num;

    for (num = 1; num < 10; num++) {
      System.out.println("Um terço de " + num + " é " + terco(num));
    }

    System.out.println("*** FIM ***");
  }

  private static double terco(double n) {
    return n / 3;
  }
}
