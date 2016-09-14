import org.junit.*;
import static org.junit.Assert.*;

import java.util.*;

public class RectangleTest {

  @Test
public void all_returnsAllInstancesOfRectangle_true() {
  Rectangle firstRectangle = new Rectangle(10, 20);
  Rectangle secondRectangle = new Rectangle(5, 5);
  assertTrue(Rectangle.all().contains(firstRectangle));
  assertTrue(Rectangle.all().contains(secondRectangle));
  }
}
