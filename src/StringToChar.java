public class StringToChar {

  public static char[]  stringToChar (String ssnString){
    char[] newChar;
  ssnString= ssnString.replaceAll("[\\D]","");

  newChar = ssnString.toCharArray();

  return newChar;
  }


}
