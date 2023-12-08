/* 책번호와 제목을 멤버로 가지는 Book클래스를 만드세요.
 * Book형 ArrayList 생성하세요.
 * 리스트에 책 3권 추가하세요.
 * 리스트의 모든 요소를 삭제하세요.
 * */
package collection;
import java.util.ArrayList;

public class Quiz03 {

	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<>();
		Book book1 = new Book("나루토", "일본인1");
		Book book2 = new Book("원피스", "일본인2");
		Book book3 = new Book("블리치", "일본인3");

// 주소값을 추가하는 개념이다. 따라서, print(list) 하면 주소값만 나옴. -> toString 오버라이드
		list.add(book1); // 걍 바로 new Book("나루토", "일본인1"); 했어도 됨.
		list.add(book2); 
		list.add(book3);

		System.out.println(list);		
		// 1. 일반 for문 사용해서 출력하기 - 얼마나 순회할지 직접 적어줘야 됨.
		for (int i = 0 ; i < list.size() ; i++) {
			Book book = list.get(i);
			System.out.println(book);
		}		
		// 2. 람다식 for문 사용해서 출력하기  - list의 데이터 개수만큼만 순회함.
		for (Book book : list) {// 배열에서 꺼낸값을 출력. x:y에서 x에 list에서 꺼낼 데이터타입 적어
			System.out.println(book);
		}				
		
		//리스트 삭제
		int a = list.size();
		for (int i = 0; i < a ; i++) {
			list.remove(0); // 배열 삭제마다 데이터 수 줄어드니까 0번만 계속 삭제하면 됨.
		}
		System.out.println("모든 요소 삭제 후 : " + list);
	}
}

class Book {
	String name;
	String author;

	public Book(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + "]";
	}

}