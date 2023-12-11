package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex3 {

	public static void main(String[] args) {
	
		// 회원목록을 저장하는 map 생성
		HashMap<Integer, Member> map = new HashMap<>();
		
		// 회원 추가
		Member member1 = new Member (1001, "둘리");
		Member member2 = new Member (1002, "또치");
		Member member3 = new Member (1003, "도우너");
		
		map.put(member1.memberId, member1); // -> 참조하는 변수가 map과 member1
//ㄴ map.put(member1.memberId, new Member(1001, "둘리"); -> 참조하는 변수가 map밖에 없음
		map.put(member2.memberId, member2);
		map.put(member3.memberId, member3);
		
		// 회원 조회 map.get(key값) = > map데이터 출력 
		System.out.println(map.get(1001)); // key값 넣어서 get메서드 사용
		System.out.println(map.get(1002));
		System.out.println(map.get(1003));
		
		
		System.out.println();
		// 1번째 회원 삭제
		map.remove(1001);
		
		// 전체 회원 수 출력
		System.out.println("전체 회원 수 : " + map.size());
		
		// 전체 회원 목록 출력
		System.out.println(map);
// Map의 참조변수넣으면 나옴 -> Map함수의 toString메서드오버라이딩 된대로 출력. 참조변수의 주소값이 아니라. 
		
		
		// 회원 목록 순회하기 (without Iterator)
		Set<Integer> keyset = map.keySet();
		
		for (int key : keyset) {
			System.out.println("[Key]:" + key + "[Value]:" + map.get(key));
					
		}	
//		Iterator로 어캐 해야될지 생각해보자. 밑에꺼 하니까 에러뜸	(Ex4와 연관)	
//		Iterator<Integer> keys = map.keySet().iterator();
//		while (keys.hasNext()) {
//			int key1 = keys.next();
//			Member member = map.get(key1);
//			System.out.println(member);	
		
	}
}


// 쇼핑몰 회원 클래스 만들기
class Member {
	
	int memberId ; // 회원 아이디
	String memberName ; // 회원 이름
	
	public Member(int memberId, String memberName) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
	}
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";
	}	
	
}
