package poly.instanceof_;

public class Employee_Ex extends Person_Ex {

	String department; // 부서
	
	Employee_Ex(String name, int age, String department) {
		super(name, age);
		this.department = department;
	}
	
	String info() {
		return "이름: " + name + " 나이: " + age + " 부서:" + department;
	}
}
