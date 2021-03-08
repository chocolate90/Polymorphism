package poly.basic03;

public class Employee_super extends Person_super {

	String department; // 부서
	
	Employee_super(String name, int age, String department) {
		super(name, age);
		this.department = department;
	}
	
	String info() {
		return "이름: " + name + " 나이: " + age + " 부서:" + department;
	}
}
