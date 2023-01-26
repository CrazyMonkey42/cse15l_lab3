import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
    int[] input2 = { };
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ }, input2);
    int[] input3 = { 3, 2, 1 };
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[]{ 1, 2, 3 }, input3);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    int[] input3 = { 3, 2, 1 };
    assertArrayEquals(new int[]{ 1, 2, 3 }, ArrayExamples.reversed(input3));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input0 = { };
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input0), 0);
    double[] input1 = { 1.0, 2.0, 3.0 };
    assertEquals(2.5, ArrayExamples.averageWithoutLowest(input1), 0);
    double[] input2 = { -1.0, -2.0, -3.0 };
    assertEquals(-1.5, ArrayExamples.averageWithoutLowest(input2), 0);
    double[] input3 = { 1.0, 2.0 };
    assertEquals(2.0, ArrayExamples.averageWithoutLowest(input3), 0);
    double[] input4 = { 1.0, 2.0, 3.0, 4.0 };
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input4), 0);
  }
}
