package poly.basic03;

public class Teacher_super extends Person_super {

	
	String subject;
	
	Teacher_super(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}
	
	String info() {
		return "이름: " + name + " 나이: " + age + " 과목:" + subject;
	}
}
