package basicJava;

import java.util.Comparator;

public class EmployeeIdComparator implements Comparator {

    @Override
    public int compare(Object o1,Object o2){
        return ((Employee) o1).getId()-(((Employee) o2).getId());
    }
}
