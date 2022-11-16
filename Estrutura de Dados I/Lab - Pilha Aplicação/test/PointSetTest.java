
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.Test;
import org.junit.Assert;

public class PointSetTest {

    @Test(expected = FileNotFoundException.class)
    public void testFileRead1() throws FileNotFoundException, IOException {
        PointSet ps = new PointSet("unknown-file.txt");
        ps.readFile();
    }

    @Test
    public void testFileRead() throws FileNotFoundException, IOException {
        ArrayList<Point> ref = new ArrayList<Point>();
        ref.add(new Point(5.2, 7.8));
        ref.add(new Point(0.0, 0.0));
        ref.add(new Point(6.5, 6.5));
        PointSet ps = new PointSet("dados/pontosTeste.txt");
        ps.readFile();
        Assert.assertEquals(ref.toString(), ps.getPoints().toString());
    }

    @Test
    public void testMin() throws FileNotFoundException, IOException {
        Point pref = new Point(0.0, 0.0);
        PointSet ps = new PointSet("dados/pontosTeste.txt");
        ps.readFile();
        Point p = ps.min();
        Assert.assertTrue(pref.equals(p));
    }

    @Test
    public void testSort() throws FileNotFoundException, IOException {
        ArrayList<Point> ref = new ArrayList<Point>();
        ref.add(new Point(0.0, 0.0));
        ref.add(new Point(6.5, 6.5));
        ref.add(new Point(5.2, 7.8));
        PointSet ps = new PointSet("dados/pontosTeste.txt");
        ps.readFile();
        ps.sort();
        Assert.assertEquals(ref.toString(), ps.getPoints().toString());
    }

    @Test
    public void testeGraham() throws EmptyStackException, IOException {
        IStack<Point> spRef = new Stack<Point>(10);
        spRef.push(new Point(0.0, 0.0));
        spRef.push(new Point(13.0, 2.6));
        spRef.push(new Point(15.6, 13.0));
        spRef.push(new Point(1.3, 11.7));

        PointSet ps = new PointSet("dados/pontos.txt");
        ps.readFile();
        IStack<Point> sp = ps.graham();

        Assert.assertEquals(spRef.getArrayList().toString(), sp.getArrayList().toString());
    }

}
