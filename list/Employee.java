package list;

public class Employee {
	private int employeeId;
	private String employeeName;
	private String date; 
	private long Salary;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public long getSalary() {
		return Salary;
	}
	public void setSalary(long salary) {
		Salary = salary;
	}
	public Employee(int employeeId, String employeeName, String date, long salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.date = date;
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", date=" + date + ", Salary="
				+ Salary + "]";
	}
	

}
