import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProblemsTest {

  String[]  nameprams = {
      "Alex",
      "Jon",
      "Jawid",
      "John"
  };


  Problems problems = new Problems();
  @Test
  void helloName() {

//    assertEquals("Hello Alex!", problems.helloName(nameprams[]));

    for (int i = 0; i < nameprams.length; i++ ){

      String input = nameprams[i];
      String returnValue = "Hello " + input + "!";
      assertEquals(returnValue, problems.helloName(input));
    }

  }
}