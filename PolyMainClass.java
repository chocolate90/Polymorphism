package poly.basic02;

public class PolyMainClass {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.method01();
		p.method02();
		
		Child c = new Child();
		c.method01();
		c.method02();
		c.method3();
		
		System.out.println("-------다형성-------");
		
		// Parent의 기능만 사용할 수 있는데, 오버라이딩된 메서드는 우선 실행
//		Parent p1 = new Child();
		Parent p1 = c;
		p1.method01();
		p1.method02();
//		p1.method3();
		
		System.out.println(c);
		System.out.println(p1);
		System.out.println(c == p1);
		
		System.out.println("-------클래스 캐스팅-------");
		
		/*
		 *  다형성 적용시 자식이 가지고 있던 본래 멤버들에는 접근할 수 없는 문제가 발생한다.
		 *  단, 재정의된 클래스는 가능
		 *  이 문제는 클래스 캐스팅으로 해결할 수 있다.
		 */
		
		Parent pp = new Child();
		Child cc = (Child)pp;
		
		cc.method01();
		cc.method02();
		cc.method3();
		
		/*
		 *  다형성이 일어나지 않은 객체를 대상으로 캐스팅을 실행하면 에러가 발생한다.
		 */
		
//		Parent p3 = new Parent();
//		Child c3 = (Child)p3;
	}
}
