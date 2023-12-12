/*
 *  1.다음과 같이 학생(Student)클래스를 만드세요.
 *  속성:학번,이름,국어점수,수학점수,영어점수
 *  2. 학생목록을 저장하는 map 객체를 생성하세요 (키:학번, 값:학생정보)
 *  3. 다음과 같이 맵에 학생 3명을 추가하세요.
 *  (학번 : 1001, 이름 : 둘리, 국어 : 90, 수학 : 80, 영어 : 70)
 *  (학번 : 1002, 이름 : 도우너, 국어 : 55, 수학 : 65, 영어 : 75)
 *  (학번 : 1003, 이름 : 또치, 국어 : 80, 수학 : 50, 영어 : 50)
 *  4. 학생별 총점과 평균점수를 구하세요.
 *  ex)둘리의 총점 : 240, 평균 : 80
 *  5. 과목별 총점과 평균점수를 구하세요.
 *  ex)국어의 총점 : 225, 평균 : 75
 * */

// 내 풀이 해설풀이랑 아이디어는 비슷하지만, 해설풀이는 람다식 이용해서 순환
package map.Quiz;

import java.util.HashMap;
import java.util.Iterator;

public class Quiz04 {

	public static void main(String[] args) {
		//학생목록을 저장할 map생성
		HashMap <Integer, Student> map  = new HashMap<>(); // 보통 key에는 숫자형을 넣음. 식별하기 편리
		Student student1 = new Student(1001, "둘리", 90,65,75);
		Student student2 = new Student(1002, "도우너", 55,65,75);
		Student student3 = new Student(1003, "또치", 80,50,50);
		
				
		map.put(student1.idNum, student1); // 바로 map.put(1001, new Student(1001, "둘리", 90,65,75)); 했어도 됬네
		map.put(student2.idNum, student2);
		map.put(student3.idNum, student3);
		
		//학생별 총점   - > 국영수 꺼내서 3으로 나누기
		
		Iterator<Integer> it = map.keySet().iterator(); // = Set<Integer> set = map.keySet();   -> Iterator<Integer> it = set.iterator(); 
		
		
		while (it.hasNext()) {
			Student student = (map.get(it.next())); // key로 객체 요소 이용하기 위한 큰 그림. map.get()값이 value, 즉 Student의 인스턴스라 Student student와 등호 가능.
			System.out.println(student.name +" 학생의 총점은 : " + (student.kor + student.math + student.eng));
			System.out.printf(student.name +" 학생의 평균은 : " + "%.1f%n", (student.kor + student.math + student.eng)/3.0);	
		}
		
		// 해설풀이
		// Set<Integer> set = map.keySet();
		// 키를 사용하여 map을 순회
		// for (int key : set){//키를 사용해서 맵에서 학생 객체 꺼내기. int key인 이유는, set은 map의 키값 Set자료구조로 저장한 거임. 따라서 set에서 key값 꺼내서 저장하려면, key의 자료형에 맞게 int
		// Student student =  map.get(key);
		// System.out.println(student.name +" 학생의 총점은 : " + (student.kor + student.math + student.eng));
		// System.out.printf(student.name +" 학생의 평균은 : " + "%.1f%n", (student.kor + student.math + student.eng)/3.0);
		//}
		
		
		//과목별 총점, 평균점수  과목별로 추출! 과목이 key로 저장되어 있지 않아서 수동으로 꺼내봄.
//		int total1 = student1.kor + student2.kor + student3.kor;
//		int total2 = student1.math + student2.math + student3.math;
//		int total3 = student1.eng + student2.eng + student3.eng;
//		
//		
//			System.out.println("국어의 총점 : " + total1);
//			System.out.println("수학의 총점 : " + total2);
//			System.out.println("영어의 총점 : " + total3);
//		
//			System.out.printf("국어의 평균 : " + "%.1f%n", (total1/3.0));
//			System.out.printf("수학의 평균 : " + "%.1f%n", (total2/3.0));
//			System.out.printf("영어의 평균 : " + "%.1f%n", (total3/3.0));
//	
			System.out.println();
			
		// Iterator으로 해보기
			int korTotal = 0 ; //한국어 총점
			int mathTotal = 0 ; //수학 총점
			int engTotal = 0 ; //영어 총점
			
			Iterator<Integer> it2 = map.keySet().iterator();
			while (it2.hasNext()) {
				Student student = (map.get(it2.next()));
			 	// 해설 풀이 - 람다식 이용
					// Set<Integer> set = map.keySet();
					// for (int key : set){
					// Student student =  map.get(key);
				korTotal = korTotal + student.kor;
				mathTotal = mathTotal + student.math;
				engTotal = engTotal + student.eng;
			}
			
			System.out.println("국어 총점은 : " + korTotal);
			System.out.println("수학 총점은 : " + mathTotal);
			System.out.println("영어 총점은 : " + engTotal);
			
			System.out.printf("국어 평균은 : " + "%.1f%n", (korTotal/3.0));
			System.out.printf("수학 평균은 : " + "%.1f%n", (mathTotal/3.0));
			System.out.printf("영어 평균은 : " + "%.1f%n", (engTotal/3.0));
	
	}		
}




class Student {
	int idNum ;
	String name ;
	int kor;
	int math;
	int eng;
	
	public Student (){		
	}
	
	public Student(int idNum, String name, int kor, int math, int eng) {
		super();
		this.idNum = idNum;
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
	
	
}