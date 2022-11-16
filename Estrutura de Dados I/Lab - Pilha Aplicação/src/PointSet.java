
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class PointSet {

    private ArrayList<Point> points;
    private String inputFileName;

    public PointSet(String fileName) {
        this.inputFileName = fileName;
        this.points = new ArrayList<Point>();
    }

    public Point min() {
        Point min = null;
        min = points.get(0);
        for(Point p:points){
            if(p.getY() < min.getY()){
                min = p;
            }
        }
        return min;
    }

    public void sort() {
        //ordena a lista de pontos de acordo com o angulo polar.
        Collections.sort(points, new PointComparator());
    }

    public IStack<Point> graham() throws EmptyStackException {
        IStack<Point> s = null;
        //passo 3: crie uma pilha vazia s
        s = new Stack(10);
        //passo 4,5 e 6: empilhe os tres primeiros pontos de points ordenado.
        this.sort();
        s.push(points.get(0));
        s.push(points.get(1));
        s.push(points.get(2));
        //passo 7: para i3 até n-1 faça
        for (int i = 3; i <= points.size() - 1; i++) {
            //passo 8: enquanto CCW(S.nextTop(),S.top(),Pi) < 0   // nextTop é o elemento abaixo do topo
            while (points.get(i).ccw(s.nextTop(), s.top()) < 0) {
                //passo 9: s.pop();
                s.pop();
                //passo 10: fim para
            }
            //passo 11: push Pi
            s.push(points.get(i));
            //passo 12: fim enquanto
        }
        //passo13: devolva s
        return s;
    }

    public void readFile() throws FileNotFoundException, IOException {
        String line;
        BufferedReader in;
        int numberOfPoints;

        in = new BufferedReader(new FileReader(inputFileName));
        line = in.readLine();
        //deveria ser o numero de pontos
        numberOfPoints = Integer.parseInt(line);

        for (int i = 0; i < numberOfPoints; i++) {
            line = in.readLine();
            String[] coordinates = line.split("\\t");
            Point p = new Point(Double.parseDouble(coordinates[0]), Double.parseDouble(coordinates[1]));
            points.add(p);
        }

        in.close();
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

}
