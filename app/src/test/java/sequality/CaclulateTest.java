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

  @Test
  public void testAverage() {
    Calclulate calclulate = new Calclulate();
    assertEquals(5, calclulate.average(10, 2));
  }

  @Test
  public void testSumRange() {
    Calclulate calclulate = new Calclulate();
    assertEquals(15, calclulate.sumRange(1, 5));
  }

  @Test
  public void testSumRangeOdd() {
    Calclulate calclulate = new Calclulate();
    assertEquals(9, calclulate.sumRangeOdd(0, 5));
    assertEquals(9, calclulate.sumRangeOdd(1, 5));
  }

  @Test
  public void testSumRangeEven() {
    Calclulate calclulate = new Calclulate();
    assertEquals(12, calclulate.sumRangeEven(1, 6));
    assertEquals(12, calclulate.sumRangeEven(2, 6));
  }
}
