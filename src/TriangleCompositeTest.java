
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleCompositeTest {

    @Test
    public void testTriangleConstructorAndGetters() {
        Triangle t = new Triangle(2, 3, 1);
        assertEquals(2, t.getX());
        assertEquals(3, t.getY());
        assertEquals(1, t.getZ());
    }

    @Test
    public void testTriangleEquals() {
        Triangle t1 = new Triangle(1, 2, 0);
        Triangle t2 = new Triangle(1, 2, 0);
        assertEquals(t1, t2);
    }

    @Test
    public void testTriangleToString() {
        Triangle t = new Triangle(2, 3, 1);
        assertEquals("(2,3,1)", t.toString());
    }

    @Test
    public void testTriangleInHashSet() {
        Set<Triangle> set = new HashSet<>();
        Triangle t = new Triangle(1, 2, 0);
        set.add(t);
        assertTrue(set.contains(new Triangle(1, 2, 0)));
    }

    @Test
    public void testGetRight() {
        Triangle t = new Triangle(3, 2, 1);
        Triangle right = t.getRight();
        assertEquals(new Triangle(4, 1, 0), right);
    }

    @Test
    public void testCompositeTriangleConstructorAndGetters() {
        CompositeTriangle ct = new CompositeTriangle(-2, 4, 3);
        assertEquals(-2, ct.getX());
        assertEquals(4, ct.getY());
        assertEquals(3, ct.getK());
    }

    @Test
    public void testCompositeTriangleIterator() {
        CompositeTriangle ct = new CompositeTriangle(-2, 4, 3);
        List<Triangle> expected = List.of(
            new Triangle(-2, 2, 1), new Triangle(-1, 1, 0), new Triangle(-1, 2, 1),
            new Triangle(0, 1, 0), new Triangle(0, 2, 1), new Triangle(-2, 3, 1),
            new Triangle(-1, 2, 0), new Triangle(-1, 3, 1), new Triangle(-2, 4, 1)
        );
        List<Triangle> actual = new ArrayList<>();
        for (Triangle t : ct) {
            actual.add(t);
        }
        assertEquals(expected, actual);
    }

    @Test
    public void testContainsMethod() {
        CompositeTriangle ct = new CompositeTriangle(-2, 4, 3);
        Triangle t = new Triangle(-1, 2, 1);
        assertTrue(ct.contains(t));
        Triangle notIncluded = new Triangle(5, 5, 1);
        assertFalse(ct.contains(notIncluded));
    }
}
