import java.util.Random;  // Ctrl + shift + O : 자동 임포트

public class FunctionTest {
	public static void main(String[] args) {
		System.out.println("아침에 일어난다.");
		이동("교육장", "버스");
		boolean 과제 = 교육();
		이동("집", "헬기");
		if(과제) {
			System.out.println("과제를 해결한다.");
		}
		System.out.println("잠을 잔다.");
	}
	
	/*
	// 입력과 출력(반환값)은 필요없어! 내부적으로 중복만 처리할거야 -> void
	public static void 교육() {
		System.out.println("오전 수업을 듣는다.");
		System.out.println("점심을 먹는다.");
		System.out.println("오후 수업을 듣는다.");
	}*/
	
	// 과제의 유무: boolean 형태로 반환
	public static boolean 교육() {
		System.out.println("오전 수업을 듣는다.");
		System.out.println("점심을 먹는다.");
		System.out.println("오후 수업을 듣는다.");
		
		// 랜덤 발생기 (Ctrl + shift + O : 자동 임포트)
		Random random = new Random();
		
		return random.nextBoolean();
	}
	
	public static void 이동(String 장소, String 탈것) {
		System.out.println(장소+"(으)로 " + 탈것 + "을(를) 이용하여 이동한다.");
	}
	
}
