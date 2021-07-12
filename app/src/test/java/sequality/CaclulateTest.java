package sequality;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CaclulateTest {
  @Test
  public void testSum() {
    Calclulate calclulate = new Calclulate();
    int expected = 5;
    assertEquals(expected, calclulate.sum(2, 3));
  }

}
