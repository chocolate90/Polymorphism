package poly.basic03;

public class MainClass_super {

	public static void main(String[] args) {

//		// 다형성이 없는 경우
//		Student_super hong = new Student_super("홍길동", 20, "123");
//		Student_super park = new Student_super("박찬호", 25, "234");
//		Student_super kim = new Student_super("김밥나라", 30, "234");
//		
//		Teacher_super lee = new Teacher_super("이승철", 40, "음악");
//		Teacher_super choi = new Teacher_super("최강창민", 40, "음악");
//		
//		Employee_super son = new Employee_super("손흥민", 20, "축구");
//		
//		// 학생 정보를 저장하기 위해 각각의 배열이 필요하다.
//		Student_super[] arr1 = {hong, park, kim};
//		Teacher_super[] arr2 = {lee, choi};
//		Employee_super[] arr3 = {son};
//		
//		for(Student_super s : arr1) {
//			System.out.println(s.info());
//		}
//		
//		for(Teacher_super t : arr2) {
//			System.out.println(t.info());
//		}
//		
//		for(Employee_super e : arr3) {
//			System.out.println(e.info());
//		}

		// 다형성을 적용한 경우
		Person_super hong = new Student_super("홍길동", 20, "123");
		Person_super park = new Student_super("박찬호", 25, "234");
		Person_super kim = new Student_super("김밥나라", 30, "234");
		
		Person_super lee = new Teacher_super("이승철", 40, "음악");
		Person_super choi = new Teacher_super("최강창민", 40, "음악");
		
		Person_super son = new Employee_super("손흥민", 20, "축구");
		
		Person_super[] arr = {hong, park, kim, lee, choi, son};
		
		for(Person_super p : arr ) {
			System.out.println(p.info());
		}
		System.out.println("-------------------------------");
		// 매개변수 다형성
		
		House h = new House();
		
		h.setIn(hong);
		h.setIn(park);
		h.setIn(kim);
		h.setIn(lee);
		h.setIn(choi);
		h.setIn(son);
		
		h.info();
		
		
		
		
	}
}
