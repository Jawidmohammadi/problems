public class Operator {

  public static void main(String[] args) {

    double value = 20;
    double valuee = 80;
    double total = (value + valuee) / 100;
    double mod = total % total;



    boolean isCar = false;
    if (isCar) {
      System.out.println("This is not supposed to happen");
    }

    isCar = true;
    boolean wasCar = isCar ? true : false;
    if (wasCar) {
      System.out.println("wasCar is true");
    }


  }

}
