package COLLECTIONS;

import java.util.Objects;

public class Employee implements Comparable<Employee> {

    private int empNumber;
    private String empName;
    private double empSalary;


    public Employee(int empNumber, String empName, double empSalary) {
        this.empNumber = empNumber;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(int empNumber) {
        this.empNumber = empNumber;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "empNumber=" + empNumber +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return getEmpNumber() == employee.getEmpNumber() && Double.compare(getEmpSalary(), employee.getEmpSalary()) == 0 && Objects.equals(getEmpName(), employee.getEmpName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmpNumber(), getEmpName(), getEmpSalary());
    }

    @Override
    public int compareTo(Employee employee) {
        if(this.empNumber<employee.getEmpNumber()) return -1;
        else if (this.empNumber==employee.getEmpNumber()) return 0 ;
        else
            return 1;
    }
}
