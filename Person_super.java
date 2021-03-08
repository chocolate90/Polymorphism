package poly.basic03;

public class Person_super{

	String name;
	int age;
	
	Person_super(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		
	}
	Person_super(String name) {
//		this.name = name;
//		this.age = 1;
		this(name, 1);
	}
	
	Person_super() {
//		this.name = "이름x";
//		this.age = 1;
		this("이름x", 1);
	}
	
	String info() {
		return "이름: " + name + " 나이: " + age;
	}
}
