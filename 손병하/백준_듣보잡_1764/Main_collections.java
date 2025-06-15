package backjoon;

import java.util.ArrayList;
import java.util.Collections;

//	리스트 정렬 등 유틸 기능이 있는 Collections

public class Main_collections {
	public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("banana");
        list.add("apple");
        list.add("grape");

        Collections.sort(list);  // 사전순 정렬

        System.out.println(list); // [apple, banana, grape]
    }
}
