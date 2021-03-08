package poly.basic03;

public class House {

//	Student_super[] arr;
//	Teacher_super[] arr1;
//	Employee_super[] arr2;
	
//	Person_super[] arr = new Person_super[100];
	
	private Person_super[] arr; // 자식클래스를 저장할 배열
	private int index; // 배열을 관리할 index
	
	House() {
		arr = new Person_super[100];
	}
	
	/*
	 *  1. Person의 자식객체를 전달 받을 수 있는 setIn() 생성
	 *  기능 - Person배열에 순서대로 자식클래스를 저장
	 *  
	 *  2. info()는 arr에 있는 학생정보를 전부 출력해주는 메서드 생성
	 *  
	 *  3. 메인클래스에서 6명의 Person을 전달하고 info 메서드로 확인
	 */
	
	public void setIn(Person_super p) {
		arr[index]  = p;
		index ++;
	}
	
	public void info() {
//		for(Person_super p : arr) {
//			System.out.println(p.info());
//		}
		
		for(int i = 0; i < index; i++) {
			System.out.println(arr[i].info());
		}
	}
	
}
