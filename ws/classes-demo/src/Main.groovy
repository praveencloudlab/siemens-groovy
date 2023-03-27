class Abc{
  int a=100; // if static is not mentioned, then its instance
  static int b=2000;

  static void main(String[] args) {

    def emp=new Employee();
    emp.empId=100
    emp.empName="James"
    emp.salary=3843479

    println("EMpID ${emp.empId}, name : ${emp.empName}, Salary: ${emp.salary}")




  }
}
