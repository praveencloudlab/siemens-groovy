import groovy.transform.*
class Employee {
    private int empId;
    private String empName;
    private double salary;

    Employee(int empId) {
        this.empId = empId
    }

    Employee(int empId, String empName, double salary) {
        this.empId = empId
        this.empName = empName
        this.salary = salary
    }
// setters are mutable. can change properties
     // should be public with no return type with setXXX where XXX is the property name
    public void setEmpId(int empId){
        this.empId=empId;
    }



    // getter are immutable
    //should be public with no arguments, but with return type. getXXX
    public int getEmpId(){
        return empId;
    }

    String getEmpName() {
        return empName
    }

    void setEmpName(String empName) {
        this.empName = empName
    }

    double getSalary() {
        return salary
    }

    void setSalary(double salary) {
        // bl
        this.salary = salary
    }


    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
