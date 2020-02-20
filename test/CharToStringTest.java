import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

class CharToStringTest {


  char[] parsssn  = {
      '1','2','3','4','5','6','7','8','9'
  };



  String expected =
      "123-45-6789";


  @Test
  void parseSSN() {

  assertEquals(expected, CharToString.parseSSN(parsssn));
  }
}