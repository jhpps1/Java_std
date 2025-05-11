package modifier07_object_array;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("Yang", 45, "Youtube");
		Person p2 = new Person("Hong", 25, "Golf");
		
		PersonManager pm = PersonManager.getInstance();
		pm.addPerson(p1);
		pm.addPerson(p2);
		
		PersonManager pm2 = PersonManager.getInstance();
		
	}
}
