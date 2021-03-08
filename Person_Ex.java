package poly.instanceof_;

public class Person_Ex{

	String name;
	int age;
	
	Person_Ex(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		
	}
	Person_Ex(String name) {
//		this.name = name;
//		this.age = 1;
		this(name, 1);
	}
	
	Person_Ex() {
//		this.name = "이름x";
//		this.age = 1;
		this("이름x", 1);
	}
	
	String info() {
		return "이름: " + name + " 나이: " + age;
	}
}
