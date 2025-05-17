package polymorphism01;

public class Test2 {
	public static void main(String[] args) {
		// 형변환
		
		// 묵시적 형변화 -> 자동 형변환
//		Student st = new Student();
//		Person p = st;
//		Object obj = st;
//		obj = p;
		
		// 명시적 형변환 -> 직접 변환해주어야 함
		Person p = new Person();
		
//		Student st = (Student) p;  //  java.lang.ClassCastException:
		
		if (p instanceof Student) {
			Student st3 = (Student) p;
			st3.study();
		}
		
//		st.study();
		
		Person p2 = new Student();
		Student st2 = (Student) p2;
		
		st2.study(); 
		
		System.out.println(p2 instanceof Student);
		
		if (p instanceof Student) {  // 이렇게 쓰는 게 조금 더 안전해!
			Student st4 = (Student) p2;
			st4.study();
		}
		
	}
}
