// vs collection quiz 05
// ppt 21페이지
package map;

import java.util.HashMap;
import java.util.Iterator;



public class Ex4 {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Members member1 = new Members(1001, "둘리");
		Members member2 = new Members(1002, "둘리");
		Members member3 = new Members(1003, "둘리");
		Members member4 = new Members(1004, "둘리");

		memberHashMap.addMember(member1);
		memberHashMap.addMember(member2);
		memberHashMap.addMember(member3);
		memberHashMap.addMember(member4);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);
		
		memberHashMap.showAllMember();		
	}
}

// 회원 관리 클래스 
class MemberHashMap {

	// 회원 목록을 저장할 map
	HashMap<Integer, Members> map; // map 선언

	public MemberHashMap() {
		map = new HashMap<>(); // map 생성
	}

	// 맵에 회원을 추가하는 메서드
	public void addMember(Members member) {
		map.put(member.memberId, member);
	}

	// 아이디로 회원을 삭제하는 메서드
	public boolean removeMember(int memberId) {
		// 해당회원이 있으면
		if (map.containsKey(memberId)) { // containsKey (key) -> boolean타입
			map.remove(memberId);
			System.out.println(memberId + "번 회원을 삭제하였습니다.");
			return true; // true값 반환되고 종료
		} else {
			// 해당회원이 없으면
			System.out.println(memberId + "번 회원이 존재하지 않습니다.");
			return false;
		}
	}

	// 전체 회원을 출력하는 메서드
	void showAllMember() { // 람다식 or Iterator
		
		Iterator<Integer> keys = map.keySet().iterator();
		while (keys.hasNext()) {
			int key = keys.next();
			Members member = map.get(key);
			System.out.println(member);
		}
	}
}


//쇼핑몰 회원 클래스 만들기
class Members {

	int memberId; // 회원 아이디
	String memberName; // 회원 이름

	public Members(int memberId, String memberName) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "Members [memberId=" + memberId + ", memberName=" + memberName + "]";
	}

}
