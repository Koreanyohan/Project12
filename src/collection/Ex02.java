package collection;

import java.util.ArrayList;

public class Ex02 {

	public static void main(String[] args) {
		ArrayList <Member> list = new ArrayList <>();
		
		Member member1 = new Member (1001, "둘리");
		Member member2 = new Member (1002, "또치");
		Member member3 = new Member (1003, "도우너");
		
		list.add(member1); // 회원추가
		list.add(member2); // 회원추가
		list.add(member3); // 회원추가
		list.add(member3); // 같은 회원 중복추가 - list는 중복 허용해서 가능함.
				
		
//		for문을 이용해서 전체 회원 정보 출력하기
		for (int i = 0 ; i < list.size(); i ++ ) {
			Member member= list.get(i); // 리스트에서 회원 꺼내기
			System.out.println(member.toString()); // (member)만 써도 됨.
		}
		
		list.remove(0); // 1번째 회원 삭제
		System.out.println("전체 회원 수 : " + list.size());
		
		//리스트의 모든 데이터 출력하기
		System.out.println(list);
		
	}
}

// 쇼핑몰 회원
class Member {
	int memberId ; // 회원아이디
	String memberName ; // 회원이름
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";
	}
	
	
}