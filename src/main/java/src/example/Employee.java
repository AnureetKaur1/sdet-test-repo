package src.example;

public class Employee {

	int eno;
	String empName;
	double salary;
	
	
	public Employee() {
		
	}
	
	public Employee(int eno, String empName, double salary) {
		super();
		this.eno = eno;
		this.empName = empName;
		this.salary = salary;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
