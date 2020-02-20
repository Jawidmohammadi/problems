
public class CharToString {

  //change to char[] into a string, formatted like a social security number: [{1}{2}{3}-45-6789]
  public static String parseSSN(char[] ssn) {

    String result = new String(ssn);
    result = result.substring(0, 3) + "-" + result.substring(3, 5) + "-" + result.substring(5);
return result;

  }


}
