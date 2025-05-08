package class01;

public class PersonTest {
	public static void main(String[] args) {
		// 사람의 정보를 관리하자!
		// ver1.
		String name1 = "Yang";
		int age1 = 45;
		String hobby1 = "Youtube";
		
		String name2 = "Hong";
		int age2 = 25;
		String hobby2 = "Golf";
		
		// ver2.
		int size = 2;
		String[] names = new String[size];
		int[] ages = new int[size];
		String[] hobbies = new String[size];
		
		names[0] = "Yang";
		names[1] = "Hong";
		
		ages[0] = 45;
		ages[1] = 25;
		
		hobbies[0] = "Youtube";
		hobbies[1] = "Golf";
	}
}
