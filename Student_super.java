package poly.basic03;

public class Student_super extends Person_super {

	
	String studentId;
	
	// 이름 나이 학번을 전달 받아서 초기화 하는 생성자 this 키워드를 사용
	
	Student_super(String name, int age, String studentId) {
		super(name, age); // 부모 클래스가 있고 멤버변수를 받아주는 생성자가 있다
		this.studentId = studentId;
	}
	
	
	String info() {
		return "이름: " + name + " 나이: " + age + " 학번:" + studentId;
	}
}
