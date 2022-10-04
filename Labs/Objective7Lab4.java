public class Objective7Lab4 {
  public static void main(String[] args) {
    int currentsum, counter;
    counter = 1;
    currentsum = 0;

    while(counter <= 20) {
      currentsum += counter;
      counter = counter + 1;
    }

    System.out.println(currentsum);


  }
}
