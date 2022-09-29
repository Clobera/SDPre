public class Objective3Lab3 {
  public static void main(String[] args) {
    int first, second, third, sum;

    first = 1 + (int)(Math.random() * 6);
    second = 1 + (int)(Math.random() * 6);
    third = 1 + (int)(Math.random() * 6);
    sum = first + second + third;

    String equation = first + " + " + second + " + " + third + " +" + " = " + sum;

    System.out.println(equation);


  }
}
