/* Character타입의 ArrayList 생성하세요.
 * 문자 3개를 추가하세요 ('A','B','C')
 * 리스트에 'A'라는 문자가 존재하는지 확인하고,
 * 존재한다면 리스트에서 삭제하세요.
 * */

package collection;

import java.util.ArrayList;

public class Quiz02 {

	public static void main(String[] args) {
		ArrayList<Character> list = new ArrayList<>();

		list.add('A'); // = list.add (new Character ('A'))
		list.add('B');
		list.add('C');
		System.out.println("요소 삭제 전 : " + list);
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 'A') // 리스트안에 'A'있는지 확인
				list.remove(i);		// cf)기초자료형 비교 - 비교연산자
									//		  객체 비교 - equals
		}
		System.out.println("요소 삭제 후 : " + list);
	}
}
