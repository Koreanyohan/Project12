/* 12월 8일 시작 -2 */

package collection;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		
		ArrayList <Integer> list = new ArrayList <>();
		
		list.add(10); // list의 첫번째 인덱스에 값 저장
		list.add(20); // list의 두번째 인덱스에 값 저장
		list.add(30); // list의 세번째 인덱스에 값 저장
		
		//리스트 요소 하나씩 출력
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
//		System.out.println(list.get(3));없는 인덱스이므로 에러(index 3 out of bounds)
		
		System.out.println("리스트 전체 요소 : " + list); // list클래스 내부의 toString메서드가 처리. 인덱스 순으로 출력됨.
		
		list.remove(2);
		System.out.println("리스트 요소 삭제 후 : " + list);
		
		int size = list.size();
		System.out.println("리스트 크기 : " + size);
	}
}
