import java.lang.reflect.Constructor;

public class PrivateConstructorAccess {

	public static void main(String[] args) {
		
		
		try {
			Class t = Class.forName("Test");
			Constructor [] c=  t.getDeclaredConstructors();
			c[0].setAccessible(true);
			c[0].newInstance(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
