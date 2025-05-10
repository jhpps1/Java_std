
public class Java05_조건문2 {
	public static void main(String[] args) {
		// if(조건식) {} 조건식이 참일 경우 블록 내부 수행
		// else {} 조건식이 거짓인 경우 else 블록 내부 수행
		
		int age = 20;
  		
  		// 20살 이상이면 주류 허용
  		// 아니면 음료만..
  		if(age >= 20) {
  			System.out.println("주류 OK");
  		}else {
  		System.out.println("음료 OK");
  		}
	}
}
