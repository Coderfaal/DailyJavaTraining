package Day6Training;

public class TestRecords {
    public static void main(String[] args) {
        Employee e= new Employee(101,"fal",75000);

        System.out.println("Employee Number :"+ e.empNo());
        System.out.println("Employee Name :"+ e.empName());
        System.out.println("Employee Salary :"+ e.empSalary());

        Employee e2= new Employee(101,"fal",75000);
        System.out.println(e==e2);

        System.out.println(e2);

    }
}
