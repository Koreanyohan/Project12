/* 12월 8일 시작 -1 */

package generic;

// 재료로 사용할 파우더 클래스 만들기
class Powder {
	
	public void doPrinting() {
		System.out.println("Powder 재료로 출력합니다.");
	}

	public String toString() {
		return "재료는 Powder입니다.";
	}
}
// 재료로 사용할 플라스틱 클래스 만들기
class Plastic  {

	public void doPrinting() {
		System.out.println("Plastic 재료로 출력합니다.");
	}

	public String toString() {
		return "재료는 Plastic입니다.";
	}
}


// 파우더를 재료로 사용하는 프린터 만들기
class ThreeDPringer1 { // private멤버변수(외부에서 수정 못함) + get set 메서드 
	
	private Powder material ; // 변수의 자료형을 클래스의 참조변수 Powder로 
	
	public void setMaterial(Powder material) { // set메서드 - 밖에서 데이터 주면 저장.
		this.material = material;
}
	public Powder getMaterial () {  // get메서드 - 안에 가지고 있는 데이터 밖으로 꺼냄.
		return material ;
	}	
}

//플라스틱를 재료로 사용하는 프린터 만들기
class ThreeDPringer2 {
	
	private Plastic material ; // 변수의 자료형을 Plastic으로
	
	public void setMaterial(Plastic material) {
		this.material = material;
}
	public Plastic getMaterial () {
		return material ;
	}	
}









































