package class04;

public class Person {
		// 메서드 오버로딩
		void study(int time) {
			// int time = ?
			System.out.println(time + "시간 공부를 했습니다.");
		}
		
		// 반환 타입만 다른 것 -> 메서드 오버로딩 아님
//		int study(int time) {
//			// int time = ?
//			System.out.println(time + "시간 공부를 했습니다.");
//			return time;
//		}
		
		// 파라미터 이름만 다른 것 -> 메서드 오버로딩 아님
//		void study(int age) {
//			System.out.println(age);
//		}
		
		
		void study(long time) {
			System.out.println(time + "시간 공부를 했습니다.");
		}
		
		void study(double time) {
			System.out.println(time + "시간 공부를 했습니다.");
		}
		
		
		// 파라미터의 순서가 다르다 -> 서로 다른 메서드
		void study(String subject, int time) {
			
		}
		
		void study(int time, String subject) {
			
		}
	}
