public class Problems {

  // int variable
  int id = 456;

  // int arrayvariable
  int[] ids = {10998877, 2877665, 36544, 4555};

  Integer alternativeId = 2;


  /* Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
  helloName("Bob") → "Hello Bob!"
  helloName("Alice") → "Hello Alice!"
  helloName("X") → "Hello X!" */

  public String helloName(String name) {

    return "Hello " + name + "!";
  }

  /*
  Given a string, we'll say that the front is the first 3 chars of the string.
   If the string length is less than 3, the front is whatever is there.
   Return a new string which is 3 copies of the front.


    front3("Java") → "JavJavJav"
    front3("Chocolate") → "ChoChoCho"
    front3("abc") → "abcabcabc"
  */
  public String front3(String str) {
    String front;

    if (str.length() >= 3) {
      front = str.substring(0, 3);
    } else {
      front = str;

    }
    return front + front + front;
  }


  //change to char[] into a string, formatted like a social security number: [{1}{2}{3}-45-6789]
  public static String parseSSN(char[] ssn) {

    String result = new String(ssn);
    result = result.substring(0, 3) + "-" + result.substring(3, 5) + "-" + result.substring(5);
    return result;
  }

/*
Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).


factorial(1) → 1
factorial(2) → 2
factorial(3) → 6*/

  public int factorial(int n) {

    int result = 1;
    for (int i = 0; i < n; i++) {

      result = result * (n-i);

    }
   return result;
  }

  public int factorialWithRecursion(int n){
    if (n==1) return 1;

    return n*factorialWithRecursion(n-1);
  }


}

















