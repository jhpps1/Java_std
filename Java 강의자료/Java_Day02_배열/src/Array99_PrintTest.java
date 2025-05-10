
public class Array99_PrintTest {
	public static void main(String[] args) {

		// print를 써보자
		System.out.print("Hello World");
		System.out.print("Hello World%n");

		// \n을 사용하면 줄이 바뀐다.
		System.out.println("Hello World!!");
		System.out.println("Hello World!!");

		// System.out.println("\");
		System.out.println("\\");
		System.out.println("\"");

		// escape sequence : 특정한 문자 조합은 문자 그대로가
		// ex) \n  \\  \"  \t

		System.out.printf("%d\n", 10); // 정수 (10진수)
		System.out.printf("%o\n", 10); // 정수 (8진수)
		System.out.printf("%x\n", 10); // 정수 (16진수)
		System.out.printf("%X\n", 10); // 정수 (16진수)

		System.out.printf("%d\n", 10); // 4칸을 확보한 뒤
		System.out.printf("%-4d\n", 10); // 4칸을 확보한
		System.out.printf("%04d\n", 10); // 4칸을 확보한

		System.out.printf("%f\n", 10.12345); // 실수
		System.out.printf("%.2f\n", 10.12345); // 실수
		// 자동으로 반올림까지 해준다.

		System.out.printf("%s\n", "싸피"); // 문자열
		System.out.printf("%c\n", 'A'); // 문자
		System.out.printf("%d\n", (int) 'A'); // 문자를
	}
}
