package collection;

import java.util.ArrayList;

public class Quiz05 {

	public static void main(String[] args) {
		Members member1 = new Members (1001, "둘리");
		Members member2 = new Members (1002, "둘리");
		Members member3 = new Members (1003, "둘리");
		Members member4 = new Members (1004, "둘리");
		
		MemberArrayList list = new MemberArrayList ();
		list.addMember(member1);
		list.addMember(member2);
		list.addMember(member3);
		list.addMember(member4);
		
		

	}

}



class Members {
	int memberId ;
	String memberName ;
	
	
	public Members(int memberId, String memberName) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	
	
}

// 받고 -> 리스트클래스에서 받은거 자기 리스트에 추가시켜야.
class MemberArrayList {
	
	ArrayList<Members> list = new ArrayList<>();
		
	
	void addMember(Members member) {
		list.add(member);
	};
	
	boolean removeMember (int memberId){
		return true;
	};
	
	void showAllMember();
	
}




