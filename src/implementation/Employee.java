package implementation;

public class Employee implements Comparable<Employee> {
    private int empId;
    private String name;
    @Override
    public int compareTo(Employee o) {
        return 0;
    }
}
