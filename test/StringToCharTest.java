import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringToCharTest {

  String ssn = "1,2,1,1,1,1,1,1,9";

  char[] expected = {'1','2','1','1','1','1','1','1','9'};


  @Test
  void parseSSN() {

    assertEquals(expected, StringToChar.stringToChar(ssn));

  }

  @Test
  void testParseSSN() {
  }

  @Test
  void stringToChar() {
  }
}