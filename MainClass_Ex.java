package poly.instanceof_;

public class MainClass_Ex {

	public static void main(String[] args) {

		// 다형성을 적용한 경우
		Person_Ex hong = new Student_Ex("홍길동", 20, "123");

		Person_Ex lee = new Teacher_Ex("이승철", 40, "음악");
	
		Person_Ex son = new Employee_Ex("손흥민", 20, "축구");
	
		personInfo(hong);
		personInfo(lee);
		personInfo(son);
	}
	
	public static void personInfo(Person_Ex p) {
		
		// instanceof로 타입확인 후 캐스팅
		
		if(p instanceof Student_Ex) {
			
			System.out.println("학생 정보 입니다.");
			Student_Ex s = (Student_Ex)p;
			System.out.println(s.info());
			
		} else if(p instanceof Teacher_Ex) {
			
			System.out.println("선생님 정보 입니다.");
			Teacher_Ex t = (Teacher_Ex)p;
			System.out.println(t.info());
			
		} else if(p instanceof Employee_Ex) {
			
			System.out.println("직원 정보 입니다.");
			Employee_Ex e = (Employee_Ex)p;
			System.out.println(e.info());
			
		} else { // 부모타입은 항상 마지막에
			
			System.out.println("사람 정보 입니다.");
			System.out.println(p.info());		
		}
	}
}
