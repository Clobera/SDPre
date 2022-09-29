public class Objective3Lab2 {
  public static void main(String[] args) {
    double side1, side2, side1sqr, side2sqr, hypotenuse;

    side1 = 8;
    side2 = 10;
    side1sqr = side1 * side1;
    side2sqr = side2 * side2;
    hypotenuse = Math.sqrt(side1sqr + side2sqr);

    System.out.Println(hypotenuse);
  }
}
