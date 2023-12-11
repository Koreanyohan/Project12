package collection;

import java.util.ArrayList;

public class Quiz05 {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Members member1 = new Members(1001, "둘리");
		Members member2 = new Members(1002, "둘리");
		Members member3 = new Members(1003, "둘리");
		Members member4 = new Members(1004, "둘리");

		// 회원 4명 추가
		memberArrayList.addMember(member1);
		memberArrayList.addMember(member2);
		memberArrayList.addMember(member3);
		memberArrayList.addMember(member4);
		memberArrayList.showAllMember();
		
		// 아이디로 4번째 회원 삭제
		memberArrayList.removeMember(1004);
		memberArrayList.showAllMember();
				
	}
}


// 회원관리 클래스
class MemberArrayList {

	// 1. 회원 목록
	ArrayList<Members> list = new ArrayList<Members>(); // 리스트 선언 - 참조변수 by 자료구조(ArrayList)

	public MemberArrayList() { // 생성자의 목적 - 1. 객체 생성 / 2. 멤버변수 초기화
		list = new ArrayList<Members>(); // 리스트 생성
	}
//	ArrayList<Members> list = new ArrayList <Members>(); 해도 되는데 설계의 목적상 생성자 생성하는게 맞다고 하신다..

	// 2. 리스트에 회원을 추가하는 메서드
	public void addMember(Members member) {
		list.add(member);
	}

	// 3. 아이디로 회원을 삭제하는 마서드
	public boolean removeMember(int memberId) { // boolean으로 반환타입설정한 것은 삭제 성공여부 알기 위해서.

		// 리스트를 순회하면서 특정회원아이디를 가지는 회원 찾기
		for (int i = 0; i < list.size(); i++) {
			Members member = (Members) list.get(i);
			int id = member.memberId; // 객체 안의 아이디 꺼내기 여기서 memberId는 Members변수의 멤버변수

			// 해당 회원의 아이디가 인자와 같은지 비교
			if (id == memberId) { // 여기서 memberId는 removeMember메서드의 매개변수.
				list.remove(i);// 같으면 삭제

				System.out.println(memberId + "번 회원을 삭제하였습니다.");

				return true; // 삭제에 성공했으면 true 반환, removeMember 메서드 빠져나감.
			}
		}
		return false; // 삭제에 실패시 false 반환
	}

	// 전체 회원을 출력하는 메서드
	public void showAllMember() {//아이디와 이름 뽑아내야되니 참조변수와 멤버변수 이용하는거 생각
		for (int i = 0; i < list.size(); i++) {
			Members member = list.get(i); // Arraylist에 저장된 것은 인스턴스다!!
			System.out.println(member); // Members 클래스에 있는 toString()메서드이용
// ==		System.out.println("Member " + "[memberId=" + member.memberId + ", memberName=" + member.memberName + "]");
		}
		System.out.println();
	}
}

class Members {
	int memberId; // 회원아이디
	String memberName; // 회원이름

	public Members(int memberId) {
		super();
		this.memberId = memberId;
	}

	public Members(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	@Override
	public String toString() { // 참조변수 print 시에 주소값 안뜨고 아이디랑 이름 뜨게 만들기
		return "Members [memberId=" + memberId + ", memberName=" + memberName + "]";
	}

}
