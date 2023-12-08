/* Character타입의 ArrayList 생성하세요.
 * 문자 3개를 추가하세요 ('A','B','C')
 * 리스트의 요소를 하나씩 출력하세요.
 * 리스트에서 두번째 문자 B를 삭제하세요.
 * 리스트의 크기를 출력하세요.
 * */

package collection;
import java.util.ArrayList;

public class Quiz01 {
	public static void main(String[] args) {
		ArrayList <Character> list = new ArrayList<>();
		Character character1 = new Character('A');
		
		Character character2 = 'A'; // new Character('A') 언박싱
		
		//제너릭스 Character이라 이 타입의 데이터 추가 가능.
		list.add(character1);
		list.add(character2);
		list.add('C');  // list.add(new Character('C')) 언박싱
		
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
		
		for (int i = 0; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
		
		list.remove(1); // (인덱스)
		
		System.out.println(list.size()); // 3 -> 2
		System.out.println(list);
	}
}
