
import java.util.Comparator;

public class PointComparator implements Comparator{
    public PointComparator(){
    }

    @Override
    public int compare(Object o1, Object o2) {
        return  (int) (( ((Point)o1).polarAngle() - ((Point)o2).polarAngle())*1000.0); 
    }
    
}
