package COLLECTIONS;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
//    public int compare(Employee o1, Employee o2) {
//        if (o1.getEmpNumber() < o2.getEmpNumber()) return -1;
//        else if (o1.getEmpNumber() == o2.getEmpNumber()) return 0;
//        return 1;
//    }
    public int compare(Employee o1,Employee o2) {
        if(o1.getEmpName().compareTo(o2.getEmpName())<0) return -1;
        else if (o1.getEmpName().compareTo(o2.getEmpName())==0)return 0;
    return 1;}

}
