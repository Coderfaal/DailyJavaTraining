package Day6Training;

public record Employee(int empNo,String empName,double empSalary) {

    public Employee{
        if(empSalary<0){
            throw new IllegalArgumentException("Salary cannot be negative");
        }
    }
}
