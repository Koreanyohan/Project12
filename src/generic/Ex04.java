/*
 * 제너릭을 사용하는 ArrayList 클래스 사용하기
 * */

package generic;

import java.util.ArrayList;

public class Ex04 {

	public static void main(String[] args) {
		// 숫자를 저장하는 리스트 생성
		ArrayList <Integer> list1 = new ArrayList <>();

		list1.add(10); // int타입의 값만 저장가능
		
		Integer i = list1.get(0); // 값을 꺼낼 때 형변환 할 필요 없음.
						// list1.get(0)은 Integer타입. 아니라면 컴파일에러 떠서 걸러줌
						// cf) Integer i 대신 int i 라고 써도 됨. 어차피 언박싱.
		System.out.println(i);
		
		
		// Boolean을 사용하는 리스트 생성		
		ArrayList <Boolean> list2 = new ArrayList <>();
		
		list2.add(true);
		
		Boolean bool = list2.get(0);
		
		System.out.println(bool);
	}
}

