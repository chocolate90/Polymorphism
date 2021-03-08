package poly.instanceof_;

public class Teacher_Ex extends Person_Ex {

	
	String subject;
	
	Teacher_Ex(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}
	
	String info() {
		return "이름: " + name + " 나이: " + age + " 과목:" + subject;
	}
}
