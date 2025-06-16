import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IteratorTest {

    private static final List<Triangle> EXPECTED = List.of(
            new Triangle(-2, 2, 1), new Triangle(-1, 1, 0), new Triangle(-1, 2, 1),
            new Triangle(0, 1, 0), new Triangle(0, 2, 1), new Triangle(-2, 3, 1),
            new Triangle(-1, 2, 0), new Triangle(-1, 3, 1), new Triangle(-2, 4, 1)
    );

    @Test
    public void testCompositeTriangleIterator() {
        //Wir erstellen ein Zusammengesetztes Dreick
        //Dann gehen wir mir einer Vorschleife durch und packen alles in ein Array
        //Die Reihenfolge wie wir es in das Array setzen zeigt ob wir es richtig gemacht haben
        //also ob die reihenfolge so ist wie die reihenfolge aus der aufgabe oben.
        CompositeTriangle CTriangle = new CompositeTriangle(-2, 4, 3);
        List<Triangle> triangles = new ArrayList<>();

        for (Triangle t : CTriangle) {
            triangles.add(t);
        }
        assertEquals(EXPECTED, triangles);
    }
}
