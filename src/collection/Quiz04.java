/* Integer 타입의 HashSet 생성하세요.
 * set에 숫자3개를 추가하세요.
 * set의 크기를 출력하세요.
 * Iterator를 이용하여 set의 요소를 하나씩 출력하세요
 * 람다식 포문을 이용해서 set의 요소를 하나씩 출력하세요. * 
 * */
// EX 03관련 문제

package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Quiz04 {

	public static void main(String[] args) {
		HashSet<Integer> hash = new HashSet<>();

		hash.add(1);
		hash.add(2);
		hash.add(3);

		System.out.println("set의 크기 : " + hash.size());
		// 값 꺼내기 1. Iterator 이용
		Iterator<Integer> it = hash.iterator();
		          //ㄴ Iterator 제너릭스는 참조할 set 제너릭스와 일치시키기
		while (it.hasNext()) {
			System.out.println("Iterator 이용 : " + it.next());
		}
		// 값 꺼내기 2. 람다식포문 이용
		for (Integer i : hash) { // 좌항에 꺼낼 값과 같은 타입 넣어야! 따라서 Integer넣어. (int도 댐)
			System.out.println("람다식 이용 : " + i + " ");
		}
	}
}
