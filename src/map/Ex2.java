package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex2 {

	public static void main(String[] args) {
		// Character형 키, String형 value를 저장하는 맵 생성
		HashMap<Character, String> map = new HashMap<>();
		
		// 데이터 추가
		map.put('a', "사과");
		map.put('b', "바나나");
		map.put('c', "코코넛");
		System.out.println("hashmap : " + map);

		// 키로 데이터 조회
		String value = map.get('b'); // key값 b로 값을 조회
		System.out.println("key : b, value : " + value);
		
		// 데이터 수정
		map.replace('b', "블루베리"); // key가 'b'인 map의 value값 변경
		System.out.println("hashmap : " + map);
		
		// 데이터 삭제
		map.remove('a'); // key가 'a'인 데이터 삭제
		System.out.println(" ㄴ 삭제 후 hashmap : " + map);
		
		
		//map 순회하기 - index가 없어서 Iterator 사용.
		Set<Character> set = map.keySet();
		Iterator<Character> keys = set.iterator(); //set대신 걍 바로 map.keySet()넣어도 댐.
	           	// map.keySet()이용, key의 목록(Set자료구조)으로 iterator호출
		
		while (keys.hasNext()) { 		 // 다음 key가 있으면
			Character key = keys.next(); // key를 꺼내서
			System.out.println("Iterator -> [key]:" + key + " [Value]: " + map.get(key));
		}		
		
		
		// 특정 키 값이 존재하는지 확인하기
		if (map.containsKey('b')) { // containsKey  boolean 타입 ->true
			System.out.println("map에 b라는 키가 있습니다.");
		} else { // -> false
			System.out.println("map에 b라는 키가 없습니다.");
		}			
	}
}














