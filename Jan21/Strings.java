import javax.naming.Name;

// import java.lang.String // no need to import.
public class Strings {

	public static void main(String[] args) {
		//Interned String, means points directly to the literal.
		String name1 = "John Watson";
		// Object String, string is created inside the Heap with data.
		String name2 = new String("Fionna Flynn");
		
		System.out.println(name1);
		System.out.println(name2.toString());
		
	}

}
