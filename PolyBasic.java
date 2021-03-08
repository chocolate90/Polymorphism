package poly.basic;

/*
 *  자바에서 하나의 class 파일 안에는 여러 class가 가능하다.
 *  단, 파일명과 동일한 클래스가 존재해야하고, 해당 class만 public 이어야 한다.(예제 용도)
 */

class A {
	
}

class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

public class PolyBasic {

	/*
	 * 
	 */
	
	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	// 기본타입에서 
	int x = 10;
	double y = x; // int -> double 자동 형변환
	
	// 참조타입에서 
	A a1 = b; // B -> A로 자동 형변환
	A a2 = c;
	A a3 = new D();
	A a4 = new E();
	
	// 상속 관계가 없다면 다형성 적용이 불가능
//	C c1 = new D();
	
	// 모든 class는 object의 자식 클래스가 되기 때무에 object에는 모든 타입을 저장할 수 있다.
	
	Object o = a;
	Object o2 = "문자열";
	Object o3 = 1;
	Object o4 = new B();
	

}
