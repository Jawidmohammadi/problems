public class Practice {

  public static void main(String[] args) {
    char myUniCode = '\u00A9';

    System.out.println(myUniCode);

    boolean myTrueBooleanValue = true;
    boolean myFalseBooleanValue = false;

    boolean isCustomerTwentyOne = true;

    byte mynum = Byte.MAX_VALUE;

    System.out.println(mynum);

    byte mytotal = (byte) (mynum / 2);

    System.out.println(mytotal);


    String myString = "This is my String";
    System.out.println(myString);

    myString = myString + "\u00A9 2020";
    System.out.println(myString);


    String lastString = "20";

    int myInt = 50;

    lastString = lastString + myInt;

    System.out.println(lastString);


    int result = 1 + 2;

    System.out.println(result);
    result += 2;
    System.out.println(result);
    result *= 10;
    System.out.println(result);

    result -= 2;
    System.out.println(result);



    boolean isAlien = false;
    if (isAlien == false){
      System.out.println("They are not twentytwo");
    }

  }


}
