package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03 {

	public static void main(String[] args) {
	
		//HashSet 생성
		HashSet<String> hashSet = new HashSet<>();

		//데이터 추가 - 저장한 순서와 상관 없이 저장됨. 
		hashSet.add("둘리"); // 회원추가
		hashSet.add("또치"); // 회원추가
		hashSet.add("도우너"); // 회원추가
		hashSet.add("도우너"); // 중복된 값은 추가 불가
		
		System.out.println("set 목록 : " + hashSet);
		System.out.println("set 크기 : " + hashSet.size());
		
		hashSet.remove("도우너"); // set은 배열구조 아니라서 지우고 싶은 데이터값 넣어서 삭제
		System.out.println("삭제 후 set 목록 : " + hashSet);
	
	// Set 데이터 순회하기
		//1.Iterator클래스 - set은 인덱스 없어서 이걸로 데이터 순회함.
		Iterator<String> ir = hashSet.iterator(); // 문장 잘 기억하자..
		
		while (ir.hasNext()) { // 다음 요소 있는지 확인 -> 있으면 true. 없으면 false 반환.
			String member = ir.next(); // 다음요소 읽어옴
			System.out.println("Iterator문 이용 : " +member + " ");
		}	
		//2. 람다식
		for(String member : hashSet) {
			System.out.println("람다식 이용 : " + member + " ");
		}
	}
}


