package homeLearningTask5;

public class Employee {

	int eid;
	String ename;
	double salary;
	String email;
	String department;
	
	
	public int getEid() {
		return eid;
	}
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	//main method 
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();

		
		e1.setEid(2101);
		e1.setEname("Will");
		e1.setSalary(21650.00);
		e1.setEmail("will@employera.com");
		e1.setDepartment("IT");
		
		e2.setEid(2002);
		e2.setEname("Annie");
		e2.setSalary(22750.00);
		e2.setEmail("annie@employera.com");
		e2.setDepartment("HR");
		
		e3.setEid(2003);
		e3.setEname("Abi");
		e3.setSalary(20625.00);
		e3.setEmail("abi@employera.com");
		e3.setDepartment("IT");
		
		
		System.out.println("Employee ID : "+ e1.getEid());
		System.out.println("Employee Name : "+ e1.getEname());
		System.out.println("Employee Salary : "+ e1.getSalary());
		System.out.println("Employee Email : "+ e1.getEmail());
		System.out.println("Employee Department : "+ e1.getDepartment());
		
		System.out.println("=============================");
		
		System.out.println("Employee ID : "+ e2.getEid());
		System.out.println("Employee Name : "+ e2.getEname());
		System.out.println("Employee Salary : "+ e2.getSalary());
		System.out.println("Employee Email : "+ e2.getEmail());
		System.out.println("Employee Department : "+ e2.getDepartment());
		
		System.out.println("=============================");

		System.out.println("Employee ID : "+ e3.getEid());
		System.out.println("Employee Name : "+ e3.getEname());
		System.out.println("Employee Salary : "+ e3.getSalary());
		System.out.println("Employee Email : "+ e3.getEmail());
		System.out.println("Employee Department : "+ e3.getDepartment());
	}


}


