package generic;

public class Ex02 {

	public static void main(String[] args) {
		ThreeDPrinter3 printer = new ThreeDPrinter3();
		
		Powder p1 = new Powder() ; // Powder을 재료로 선택 
		
		printer.setMaterial(p1);
		
		Powder p2 = (Powder)printer.getMaterial();
			
		// Powder p2 = new Obejct(); 꼴이라서 자식클래스 = 부모클래스라 형변환해야지.		
//		Powder p2 = printer.getMaterial(); 
 
	}
}

//파우더와 플라스틱을 재료로 사용하는 프린터 만들기 (통합)
class ThreeDPrinter3 {
	
	 // 변수의 자료형을 Object로 선언하면 파우더와 플라스틱을 모두 저장할 수 있음.
	private Object material ;
	
	public void setMaterial(Object material) {
		this.material = material;
}
	public Object getMaterial () { // Object형 리턴타입
		return material ;
	}	
}



